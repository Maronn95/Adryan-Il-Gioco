package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabili;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.OggettiInventarioRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.ProtezioniRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ProtezioniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProtezioniIndossabiliServiceImpl implements ProtezioniService {

    @Autowired
    ProtezioniRepo PR;
    @Override
    public List<ProtezioniIndossabili> getProtezioni() {
        return PR.findAll();
    }

    @Override
    public Optional<ProtezioniIndossabili> getProtezioneById(Long id) {
        return PR.findById(id);
    }

    @Override
    public void CreateProtezione(ProtezioniIndossabili protezione) {
        PR.save(protezione);
    }

    @Override
    public void DeleteProtezione(Long id) {
        PR.deleteById(id);

    }
}
