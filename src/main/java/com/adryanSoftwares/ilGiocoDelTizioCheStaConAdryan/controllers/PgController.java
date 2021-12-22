package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pg")
public class PgController {

    @Autowired
    PgService pgService;


}
