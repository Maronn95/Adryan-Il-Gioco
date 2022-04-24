package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;

import java.util.List;
import java.util.Optional;

public interface OggettiBattlegroundService {

    public List<OggettiBattlegroundEntity> getOggetti();


   public Optional<OggettiBattlegroundEntity> getOggettiById(Long id);


   public void CreateOggetto(OggettiBattlegroundEntity oggetto);



   public void DeleteOggetto(Long id);

   }

