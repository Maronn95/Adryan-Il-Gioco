package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;

import java.util.List;
import java.util.Optional;

public interface ArmiService {

    List<Armi> getArmi();

    Optional<Armi> getArmaById(Integer id);

    void CreateArma(Armi oggetto);

    void DeleteArma(Long id);
}

