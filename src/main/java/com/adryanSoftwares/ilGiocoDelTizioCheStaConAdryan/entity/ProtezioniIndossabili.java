package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.EffettiMagiciDifensivi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Locazione;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProtezioniIndossabili extends OggettoInventario {

    private Long protezioneIndossabileId;

    private Locazione locazione;

    private String name;

    private EffettiMagiciDifensivi efd;


    private Double valoreProtettivo;


    private Double durabilita;



}


