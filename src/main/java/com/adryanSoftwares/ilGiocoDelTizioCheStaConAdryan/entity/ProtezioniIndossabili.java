package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProtezioniIndossabili {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ProtezioneIndossabileId")
    private Long ProtezioneIndossabileId;

    @Column(name="Descrizione")
    private String descrizione;

    @Column(name="OggettoMagico")
    private Boolean oggetoMagico;

    @Column(name="EffettoMagico")
    private EffettiMagiciDifensivi efd;

    @Column(name="Locazione")
    private Locazione locazione;

    @Column(name="ValoreProtettivo")
    private Double valoreProtettivo;

    @Column(name="Durabilità")
    private Double durabilita;
}
