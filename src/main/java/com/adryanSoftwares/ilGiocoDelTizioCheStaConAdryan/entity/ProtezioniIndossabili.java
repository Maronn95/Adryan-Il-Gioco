package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.cazzoDuro.EffettiMagiciDifensivi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.cazzoDuro.Locazione;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
