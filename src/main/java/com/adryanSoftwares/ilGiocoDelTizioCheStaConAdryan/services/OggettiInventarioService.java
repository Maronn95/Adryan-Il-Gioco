package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;

import java.util.List;
import java.util.Optional;

public interface OggettiInventarioService {

    List<OggettoInventario> getOggetti();

    Optional<OggettoInventario> getOggettiById(Long id);

    void CreateOggetto(OggettoInventario oggetto);

    void DeleteOggetto(Long id);
}
