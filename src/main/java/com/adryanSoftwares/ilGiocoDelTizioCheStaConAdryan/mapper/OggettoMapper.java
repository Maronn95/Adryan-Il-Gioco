package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;

public class OggettoMapper {

    public static OggettiEntity DtoNewEntity(OggettiDTO ogDto){
        OggettiEntity oggetto = new OggettiEntity();
        if (ogDto != null) {
            if (ogDto.getId() != null) oggetto.setIdOggetto(ogDto.getId());
            return oggetto;

        }
        return null;
    }
    public static OggettiDTO entityToDto(OggettiEntity oggettiEntity) {

        OggettiDTO dto = new OggettiDTO();
        if(oggettiEntity!=null) {
            if (oggettiEntity.getIdOggetto()!=null) dto.setId(oggettiEntity.getIdOggetto());
        }
        return dto;
    }
}
