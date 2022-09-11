package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabiliEntity;

import java.util.List;
import java.util.Optional;

public interface ProtezioniService {

    List<ProtezioniIndossabiliEntity> getProtezioni();


    Optional<ProtezioniIndossabiliEntity> getProtezioneById(Long id);


    void CreateProtezione(ProtezioniIndossabiliEntity protezione);



    void DeleteProtezione(Long id);
}
