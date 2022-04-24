package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;

import java.util.List;
import java.util.Optional;

public interface ArmiService {
    public List<Armi> getArmi();


    public Optional<Armi> getArmaById(Long id);


    public void CreateArma(Armi oggetto);



    public void DeleteArma(Long id);
}

