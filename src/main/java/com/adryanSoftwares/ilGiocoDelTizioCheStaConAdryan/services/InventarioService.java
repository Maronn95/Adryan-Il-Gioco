package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.InventarioEntity;

import java.util.List;

public interface InventarioService {

    public List<InventarioEntity> getInventario();

    public InventarioEntity getInventarioById(Long id);
}
