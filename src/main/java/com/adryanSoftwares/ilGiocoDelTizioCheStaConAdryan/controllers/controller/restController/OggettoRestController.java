package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.restController;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.api.OggettoAPI;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.OggettoDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.OggettoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OggettoRestController implements OggettoAPI {

    @Autowired
    OggettoServiceImpl ogSI;


    @Override
    public OggettiEntity saveOrUpdate(OggettoDTO oggettoDTO) {

        OggettiEntity oG = OggettoMapper.DtoNewEntity(oggettoDTO);
        ogSI.saveOrUpdate(oG);
        return oG;
    }
}
