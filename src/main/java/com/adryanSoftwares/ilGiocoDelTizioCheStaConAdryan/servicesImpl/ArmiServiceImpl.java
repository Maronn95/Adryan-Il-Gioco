package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ArmiServiceImpl implements ArmiService {

    @Override
    public List<Armi> getArmi() {

        //return armiRepo.findAll();
        return  null;
    }

    @Override
    public Optional<Armi> getArmaById(Long id) {

        //return armiRepo.findById(id);
        return  null;
    }

    @Override
    public void CreateArma(Armi arma) {

        //armiRepo.save(arma);
    }

    @Override
    public void DeleteArma(Long id) {
        //armiRepo.deleteById(id);
    }
}
