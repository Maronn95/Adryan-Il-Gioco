package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.OggettoDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;

public class OggettoMapper {

    public static OggettiEntity DtoNewEntity(OggettoDTO ogDto){
        OggettiEntity oggetto = new OggettiEntity();
        if (ogDto != null) {
            if (ogDto.getId() != null) oggetto.setIdOggetto(ogDto.getId());
            return oggetto;

        }
        return null;
    }
    public static OggettoDTO entityToDto(OggettiEntity oggettoEntity) {

        OggettoDTO dto = new OggettoDTO();
        if(oggettoEntity!=null) {
            if (oggettoEntity.getIdOggetto()!=null) dto.setId(oggettoEntity.getIdOggetto());
        }
        return dto;
    }
}
