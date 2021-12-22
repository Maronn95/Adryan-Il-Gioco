package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.StattsCalcolateRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsCalcolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StattsCalcolateServiceImpl implements StattsCalcolateService {

    @Autowired
    PgEntity pgEntity;
    StattsCalcolateRepo stattsCalcolateRepo;

    @Override
    public StattsPureEntity tXc() {
        return null;
    }

    @Override
    public StattsPureEntity calcoloCa() {
        StattsPureEntity dido = new StattsPureEntity();


         return stattsCalcolateRepo.save(dido);
    }

    @Override
    public StattsPureEntity vita(int vita) {
        int puntiVita = vita*2;

        return null;
    }

    @Override
    public StattsPureEntity vitaMax() {
        return null;
    }

    @Override
    public StattsPureEntity vitaAttuale() {
        return null;
    }

}
