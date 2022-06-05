package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.cazzoDuro.EffettiMagiciDifensivi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.cazzoDuro.Locazione;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.cazzoDuro.Rarita;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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


