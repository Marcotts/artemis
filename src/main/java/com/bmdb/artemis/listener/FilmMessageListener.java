package com.bmdb.artemis.listener;

import com.bmdb.artemis.model.TousLesFilms;
import com.bmdb.artemis.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;

@Component
public class FilmMessageListener {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @JmsListener(destination = "bmdb.dev.data")
    @Transactional
    public void onMessage(String message) {
        try {
            TousLesFilms film = objectMapper.readValue(message, TousLesFilms.class);
            filmRepository.save(film);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
