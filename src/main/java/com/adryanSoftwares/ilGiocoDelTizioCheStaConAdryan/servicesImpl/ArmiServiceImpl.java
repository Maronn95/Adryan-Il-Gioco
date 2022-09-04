package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ArmiServiceImpl implements ArmiService {

    @Override
    public List<ArmiEntity> getArmi() {

        //return armiRepo.findAll();
        return  null;
    }

    @Override
    public Optional<ArmiEntity> getArmaById(Integer id) {

        //return armiRepo.findById(id);
        return  null;
    }

    @Override
    public void CreateArma(ArmiEntity arma) {

        //armiRepo.save(arma);
    }

    @Override
    public void DeleteArma(Long id) {
        //armiRepo.deleteById(id);
    }
}
