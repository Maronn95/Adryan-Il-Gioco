package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;

import java.util.List;

public interface StattsPureService {

    List<StattsPureDTO> getAllStatts();

    StattsPureEntity getStattById(Long idPg);

    StattsPureDTO setStatt(StattsPureDTO stattsPureDTO);
}
