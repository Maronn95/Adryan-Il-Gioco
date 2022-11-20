package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ChestDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ChestEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;

public class ChestMapper {
    public static ChestEntity DtoNewEntity(ChestDTO ogDto){
        ChestEntity chest = new ChestEntity();
        if (ogDto != null) {
            if (ogDto.getIdChest() != null) chest.setIdChest(ogDto.getIdChest());
            if(ogDto.getDimensione()!=null)chest.setDimensione((ogDto.getDimensione()));
            if(ogDto.getLivello()!=null)chest.setLivello(ogDto.getLivello());
            if(ogDto.getRarita()!=null) chest.setRarita((ogDto.getRarita()));
            if(ogDto.getLoot()!=null)chest.setLoot(ogDto.getLoot());
            return chest;

        }
        return null;
    }
    public static ChestDTO entityToDto(ChestEntity chest) {

        ChestDTO dto = new ChestDTO();
        if(chest!=null) {
            if (chest.getIdChest()!=null) dto.setIdChest(chest.getIdChest());
            if(chest.getDimensione()!=null) dto.setDimensione(chest.getDimensione());
            if(chest.getLivello()!=null)dto.setLivello(chest.getLivello());
            if (chest.getRarita()!= null) dto.setRarita((chest.getRarita()));
            if(chest.getLoot()!=null)dto.setLoot(chest.getLoot());
        }
        return dto;
    }
}
