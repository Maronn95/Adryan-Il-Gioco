package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.InventarioEquipaggiatoNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.InventarioEquipaggiatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fight")
public class InventarioEquipaggiatoController {

    @Autowired
    InventarioEquipaggiatoService inventarioEquipaggiatoService;

    @RequestMapping(value="/EquipaggiaOggetto", method= RequestMethod.GET)
    public InventarioEquipaggiatoNewJSONresp equipaggiaOggetto(@RequestBody Integer idPg, Integer oggettoDaEquipaggiare) throws Exception {
        return inventarioEquipaggiatoService.equipaggiaOggetto(idPg, oggettoDaEquipaggiare);
    }

}
