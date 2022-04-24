package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiBattlegroundEntityDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;

public class OggettiBattlegroundMapper {

    public static OggettiBattlegroundEntityDto entityToDto(OggettiBattlegroundEntity OBE){
        OggettiBattlegroundEntityDto dto= new OggettiBattlegroundEntityDto();
        if(OBE!=null){
            if(OBE.getOggettoBattegroundId()!=null) dto.setOggettoBattlegroundId(OBE.getOggettoBattegroundId());
            if(OBE.getDescrizione()!=null)dto.setDescrizione(OBE.getDescrizione());
            if(OBE.getDimensioneBattleground()!=null)dto.setDimensioneBattleground((OBE.getDimensioneBattleground()));
            if(OBE.getLoot()!=null)dto.setLoot(OBE.getLoot());
            if(OBE.getRandomLoot()!=null)dto.setRandomLoot((OBE.getRandomLoot()));
            if(OBE.getCopertura()!=null)dto.setCopertura((OBE.getCopertura()));
            if(OBE.getValoreCopertura()!=null)dto.setValoreCopertura((OBE.getValoreCopertura()));

        }
        return dto;
    }

    public static OggettiBattlegroundEntity dtoToEntity(OggettiBattlegroundEntityDto dto){
        OggettiBattlegroundEntity OBE= new OggettiBattlegroundEntity();
        if(dto!=null){
            if(dto.getOggettoBattlegroundId()!=null) OBE.setOggettoBattegroundId(dto.getOggettoBattlegroundId());
            if(dto.getDescrizione()!=null)OBE.setDescrizione(dto.getDescrizione());
            if(dto.getDimensioneBattleground()!=null)OBE.setDimensioneBattleground((dto.getDimensioneBattleground()));
            if(dto.getLoot()!=null)OBE.setLoot(dto.getLoot());
            if(dto.getRandomLoot()!=null)OBE.setRandomLoot((dto.getRandomLoot()));
            if(dto.getCopertura()!=null)OBE.setCopertura((dto.getCopertura()));
            if(dto.getValoreCopertura()!=null)OBE.setValoreCopertura((dto.getValoreCopertura()));


        }
        return OBE;
    }

    public static OggettiBattlegroundEntity dtoUpdateEntity(OggettiBattlegroundEntityDto bgDto) {
        OggettiBattlegroundEntity OBE= new OggettiBattlegroundEntity();
        if(bgDto!=null){
            if (bgDto.getOggettoBattlegroundId() != null) {
                OBE.setOggettoBattegroundId(bgDto.getOggettoBattlegroundId());
                if(bgDto.getDescrizione()!=null)OBE.setDescrizione(bgDto.getDescrizione());
                if(bgDto.getDimensioneBattleground()!=null)OBE.setDimensioneBattleground((bgDto.getDimensioneBattleground()));
                if(bgDto.getLoot()!=null)OBE.setLoot(bgDto.getLoot());
                if(bgDto.getRandomLoot()!=null)OBE.setRandomLoot((bgDto.getRandomLoot()));
                if(bgDto.getCopertura()!=null)OBE.setCopertura((bgDto.getCopertura()));
                if(bgDto.getValoreCopertura()!=null)OBE.setValoreCopertura((bgDto.getValoreCopertura()));
                return OBE;
            }
        }
        return null;
    }

}
