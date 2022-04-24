package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.ArmiRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.OggettiInventarioRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ArmiServiceImpl implements ArmiService {

    @Autowired
    ArmiRepo AR;


    @Override
    public List<Armi> getArmi() {
        return AR.findAll();
    }

    @Override
    public Optional<Armi> getArmaById(Long id) {

        return AR.findById(id);
    }

    @Override
    public void CreateArma(Armi arma) {
        AR.save(arma);
    }

    @Override
    public void DeleteArma(Long id) {
        AR.deleteById(id);

    }
}
