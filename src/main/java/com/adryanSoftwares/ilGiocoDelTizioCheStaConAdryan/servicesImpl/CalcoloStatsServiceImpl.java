package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.CalcoloStatsService;
import org.springframework.beans.factory.annotation.Autowired;

public class CalcoloStatsServiceImpl implements CalcoloStatsService {

    @Autowired
    StattsEntity stattsEntity;
}
