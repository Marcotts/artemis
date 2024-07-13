package com.bmdb.artemis.model;

import jakarta.persistence.*;
import lombok.*;


import java.math.BigInteger;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "SERIE1")
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger Id;

    @Column(name = "TITREFRANCAIS")
    private String titreFrancais;
    @Column(name = "TITREANGLAIS")
    private String titreAnglais;
    @Column(name = "ANNEE")
    private String annee;
    @Column(name = "POCHETTE")
    private String pochette;
    @Column(name = "DISQUEFRANCAIS")
    private String disqueFrancais;
    @Column(name = "DISQUEANGLAIS")
    private String disqueAnglais;
    @Column(name = "AUDIOFRANCAIS")
    private String audioFrancais;
    @Column(name = "AUDIOANGLAIS")
    private String audioAnglais;
    @Column(name = "ENDOUBLE")
    private String enDouble;
    @Column(name = "DERNIEREPISODEVISIONNE")
    private String dernierEpisodeVisionne;
    @Column(name = "ANNEESAISON")
    private String anneeSaison;
    @Column(name = "DERNIERESAISON")
    private String derniereSaison;
}
