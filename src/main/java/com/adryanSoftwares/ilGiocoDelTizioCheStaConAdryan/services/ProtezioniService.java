package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabili;

import java.util.List;
import java.util.Optional;

public interface ProtezioniService {

    List<ProtezioniIndossabili> getProtezioni();


    Optional<ProtezioniIndossabili> getProtezioneById(Long id);


    void CreateProtezione(ProtezioniIndossabili protezione);



    void DeleteProtezione(Long id);
}
