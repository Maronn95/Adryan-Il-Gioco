package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Inventario;

import java.util.List;
import java.util.Optional;

public interface InventarioService {

    public List<Inventario> getInventario();

    public Inventario getInventarioById(Long id);
}
