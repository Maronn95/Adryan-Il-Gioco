package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoBattleGroundDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoBattleGroundEntity;

public class OggettiBattlegroundMapper {

    public static OggettoBattleGroundDTO entityToDto(OggettoBattleGroundEntity OBE){
        OggettoBattleGroundDTO dto= new OggettoBattleGroundDTO();
        if(OBE!=null){
            if(OBE.getIdOggettoBattleGround()!=null) dto.setIdOggettoBattleGround(OBE.getIdOggettoBattleGround());
            if(OBE.getOggettiEntity()!=null)dto.setOggettiEntity(OBE.getOggettiEntity());
            if(OBE.getChestEntity()!=null)dto.setChestEntity(OBE.getChestEntity());
            if(OBE.getProtezioniIndossabiliEntity()!=null)dto.setProtezioniIndossabiliEntity(OBE.getProtezioniIndossabiliEntity());
            if(OBE.getStatusList()!=null) dto.setStatusList(OBE.getStatusList());
            return dto;
        }
        return null;
    }

    public static OggettoBattleGroundEntity dtoToEntity(OggettoBattleGroundDTO dto){
        OggettoBattleGroundEntity OBE= new OggettoBattleGroundEntity();
        if(dto!=null){
            if(dto.getIdOggettoBattleGround()!=null) OBE.setIdOggettoBattleGround(dto.getIdOggettoBattleGround());
            if(dto.getOggettiEntity()!=null)OBE.setOggettiEntity(dto.getOggettiEntity());
            if(dto.getChestEntity()!=null)OBE.setChestEntity(dto.getChestEntity());
            if(dto.getProtezioniIndossabiliEntity()!=null)OBE.setProtezioniIndossabiliEntity(dto.getProtezioniIndossabiliEntity());
            if(dto.getStatusList()!=null)OBE.setStatusList(dto.getStatusList());
            return OBE;
        }
        return null;
    }

    public static OggettoBattleGroundEntity dtoUpdateEntity(OggettoBattleGroundDTO bgDto) {
        OggettoBattleGroundEntity OBE= new OggettoBattleGroundEntity();
        if(bgDto!=null){
            if (bgDto.getIdOggettoBattleGround() != null) {
                OBE.setIdOggettoBattleGround(bgDto.getIdOggettoBattleGround());
                if(bgDto.getOggettiEntity()!=null)OBE.setOggettiEntity(bgDto.getOggettiEntity());
                if(bgDto.getChestEntity()!=null)OBE.setChestEntity(bgDto.getChestEntity());
                if(bgDto.getProtezioniIndossabiliEntity()!=null)OBE.setProtezioniIndossabiliEntity(bgDto.getProtezioniIndossabiliEntity());
                return OBE;
            }
        }
        return null;
    }

}
