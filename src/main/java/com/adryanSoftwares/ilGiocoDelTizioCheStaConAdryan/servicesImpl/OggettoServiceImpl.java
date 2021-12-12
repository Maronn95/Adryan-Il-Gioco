package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.OggettiRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiService;
import org.springframework.beans.factory.annotation.Autowired;

public class OggettoServiceImpl implements OggettiService {

    @Autowired
    OggettiRepo oggettiRepo;
}
