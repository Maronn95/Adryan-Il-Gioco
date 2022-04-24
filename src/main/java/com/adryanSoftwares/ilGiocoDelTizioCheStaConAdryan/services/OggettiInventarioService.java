package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;

import java.util.List;
import java.util.Optional;

public interface OggettiInventarioService {

    public List<OggettoInventario> getOggetti();


    public Optional<OggettoInventario> getOggettiById(Long id);


    public void CreateOggetto(OggettoInventario oggetto);



    public void DeleteOggetto(Long id);
}
