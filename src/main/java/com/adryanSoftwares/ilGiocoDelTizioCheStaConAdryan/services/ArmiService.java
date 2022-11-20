package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;

import java.util.List;
import java.util.Optional;

public interface ArmiService {

    List<ArmiEntity> getArmi();

    Optional<ArmiEntity> getArmaById(Integer id);

    void CreateArma(ArmiEntity oggetto);

    void DeleteArma(Long id);


}

