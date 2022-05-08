package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.ArmiRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ArmiServiceImpl implements ArmiService {

    @Autowired
    ArmiRepo armiRepo;


    @Override
    public List<Armi> getArmi() {
        return armiRepo.findAll();
    }

    @Override
    public Optional<Armi> getArmaById(Long id) {

        return armiRepo.findById(id);
    }

    @Override
    public void CreateArma(Armi arma) {
        armiRepo.save(arma);
    }

    @Override
    public void DeleteArma(Long id) {
        armiRepo.deleteById(id);

    }
}
