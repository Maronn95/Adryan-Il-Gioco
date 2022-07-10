package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgAzioniOffensiveJSONService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping("/pgAzioniOffensive")
public class PgControllerAzioniOffensive {

    @Autowired
    private PgAzioniOffensiveJSONService pgaService;

    @RequestMapping(value="/fendenteLeggero/{idPg1}/{idPg2}/{idArma}", method= RequestMethod.GET)
    public int fendenteLeggero(@PathVariable("idPg1") int idPg1, @PathVariable("idPg2") int idPg2, @PathVariable("idArma") int idArma ) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
       return pgaService.fendenteLeggero(idPg1,idPg2, idArma);

    }



}
