package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabiliEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ProtezioniService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProtezioniIndossabiliServiceImpl implements ProtezioniService {

    @Override
    public List<ProtezioniIndossabiliEntity> getProtezioni() {
        //return PR.findAll();
        return  null;
    }

    @Override
    public Optional<ProtezioniIndossabiliEntity> getProtezioneById(Long id) {
        //return PR.findById(id);
        return  null;
    }

    @Override
    public void CreateProtezione(ProtezioniIndossabiliEntity protezione) {
        //PR.save(protezione);
    }

    @Override
    public void DeleteProtezione(Long id) {
        //PR.deleteById(id);
    }
}
