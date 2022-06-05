package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;

import java.util.List;
import java.util.Optional;

public interface OggettiBattlegroundService {

    List<OggettiBattlegroundEntity> getOggetti();

    Optional<OggettiBattlegroundEntity> getOggettiById(Long id);

    void CreateOggetto(OggettiBattlegroundEntity oggetto);

    void DeleteOggetto(Long id);

   }

