package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.OggettiInventarioRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiBattlegroundService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OggettoInventarioServiceImpl implements OggettiInventarioService {

    @Autowired
     OggettiInventarioRepo OIR;
    @Override
    public List<OggettoInventario> getOggetti() {
        return OIR.findAll();
    }

    @Override
    public Optional<OggettoInventario> getOggettiById(Long id) {
        return OIR.findById(id);
    }

    @Override
    public void CreateOggetto(OggettoInventario oggetto) {
         OIR.save(oggetto);
    }

    @Override
    public void DeleteOggetto(Long id) {
        OIR.deleteById(id);

    }
}
