package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiBattlegroundService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OggettoBattlegroundServiceImpl implements OggettiBattlegroundService {





    @Override
    public List<OggettiBattlegroundEntity> getOggetti() {
       //return oggettiRepo.findAll();
        return  null;

    }

    @Override
    public Optional<OggettiBattlegroundEntity> getOggettiById(Long id) {

        //return oggettiRepo.findById(id);
        return  null;
    }

    @Override
    public void CreateOggetto(OggettiBattlegroundEntity oggetto) {
        //oggettiRepo.save(oggetto);
    }

    @Override
    public void DeleteOggetto(Long id) {
        //oggettiRepo.deleteById(id);
    }
}
