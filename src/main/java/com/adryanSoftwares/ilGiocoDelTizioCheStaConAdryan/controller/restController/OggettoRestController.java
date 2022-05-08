package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controller.restController;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controller.api.BGApi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controller.api.OggettoAPI;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.OggettoDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.mapper.BattleGroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.BattleGroundServiceImpl;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.OggettoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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
