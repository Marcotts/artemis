package com.bmdb.artemis.repository;


import com.bmdb.artemis.model.TousLesFilms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface FilmRepository extends JpaRepository<TousLesFilms, BigInteger> {
}