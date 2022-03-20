package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsCalcolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stattsCalcolate")
public class PgControllerStattsCalcolate {

    /*@Autowired
    StattsCalcolateService stattsCalcolateService;

    @GetMapping("/getCa/{idPg}")
    StattsPureDTO calcoloCa (@PathVariable ("pgId") long pgId){
        return this.stattsCalcolateService.calcoloCa(pgId);
    }

*/
}
