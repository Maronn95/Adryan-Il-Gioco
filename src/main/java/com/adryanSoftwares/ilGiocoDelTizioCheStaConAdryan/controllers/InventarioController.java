package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Inventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.InventarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    private InventarioServiceImpl ISI;


    @RequestMapping("/getInventarioById/{id}")
    public Inventario getInventarioById(@PathVariable("id") Long id){
       return this.ISI.getInventarioById(id);

    }
}
