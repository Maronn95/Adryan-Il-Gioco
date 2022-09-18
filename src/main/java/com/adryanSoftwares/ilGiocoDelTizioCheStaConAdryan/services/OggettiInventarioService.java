package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventarioEntity;

import java.util.List;
import java.util.Optional;

public interface OggettiInventarioService {

    List<OggettoInventarioEntity> getOggetti();

    Optional<OggettoInventarioEntity> getOggettiById(Long id);

    void CreateOggetto(OggettoInventarioEntity oggetto);

    void DeleteOggetto(Long id);
}
