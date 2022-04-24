package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabili;

import java.util.List;
import java.util.Optional;

public interface ProtezioniService {

    public List<ProtezioniIndossabili> getProtezioni();


    public Optional<ProtezioniIndossabili> getProtezioneById(Long id);


    public void CreateProtezione(ProtezioniIndossabili protezione);



    public void DeleteProtezione(Long id);
}
