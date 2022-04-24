package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.AzioniRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.AzioniService;
import org.springframework.beans.factory.annotation.Autowired;

public class AzioniServiceImpl implements AzioniService {

    @Autowired
    AzioniRepo azioniRepo;
}