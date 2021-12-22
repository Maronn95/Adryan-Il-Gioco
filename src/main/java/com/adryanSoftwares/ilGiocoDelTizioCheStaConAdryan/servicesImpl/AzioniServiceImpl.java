package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AzioniEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.AzioniRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.AzioniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AzioniServiceImpl implements AzioniService {

    @Autowired
    AzioniRepo azioniRepo;
    PgEntity pgEntity;

    @Override
    public AzioniEntity attaccoFisico(AzioniEntity azioniEntity) {
        return null;
    }

    @Override
    public AzioniEntity tiroXcolpire(AzioniEntity azioniEntity) {
        return null;
    }

    @Override
    public AzioniEntity calcoloDanni(AzioniEntity azioniEntity) {
        return null;
    }

    @Override
    public AzioniEntity difesa(AzioniEntity azioniEntity) {
        return null;
    }

    @Override
    public AzioniEntity aggiornamentoVita(AzioniEntity azioniEntity) {
        return null;
    }

    @Override
    public AzioniEntity subireAttaccoFisico(AzioniEntity azioniEntity) {
        return null;
    }
}

