package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiInventarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OggettoInventarioServiceImpl implements OggettiInventarioService {

    @Override
    public List<OggettoInventario> getOggetti() {

        //return OIR.findAll();
        return  null;
    }

    @Override
    public Optional<OggettoInventario> getOggettiById(Long id) {

        //return OIR.findById(id);
        return  null;
    }

    @Override
    public void CreateOggetto(OggettoInventario oggetto) {
        //OIR.save(oggetto);
    }

    @Override
    public void DeleteOggetto(Long id) {
        //OIR.deleteById(id);
    }
}
