package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProtezioniIndossabili {


    private Long ProtezioneIndossabileId;

    private String descrizione;

    private Boolean oggetoMagico;

    private EffettiMagiciDifensivi efd;

    private Locazione locazione;


    private Double valoreProtettivo;


    private Double durabilita;
}
