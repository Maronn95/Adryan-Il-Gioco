package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventarioEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiInventarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OggettoInventarioServiceImpl implements OggettiInventarioService {

    @Override
    public List<OggettoInventarioEntity> getOggetti() {

        //return OIR.findAll();
        return  null;
    }

    @Override
    public Optional<OggettoInventarioEntity> getOggettiById(Long id) {

        //return OIR.findById(id);
        return  null;
    }

    @Override
    public void CreateOggetto(OggettoInventarioEntity oggetto) {
        //OIR.save(oggetto);
    }

    @Override
    public void DeleteOggetto(Long id) {
        //OIR.deleteById(id);
    }
}
