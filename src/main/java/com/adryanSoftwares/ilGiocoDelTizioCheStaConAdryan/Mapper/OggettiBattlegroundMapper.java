package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiBattlegroundEntityDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;

public class OggettiBattlegroundMapper {

    public static OggettiBattlegroundEntityDto entityToDto(OggettiBattlegroundEntity oggettiBattlegroundEntity){
        OggettiBattlegroundEntityDto oggettiBattlegroundEntityDto= new OggettiBattlegroundEntityDto();
        if(oggettiBattlegroundEntity!=null){
            if(oggettiBattlegroundEntity.getOggettoBattegroundId()!=null) oggettiBattlegroundEntityDto.setOggettoBattlegroundId(oggettiBattlegroundEntity.getOggettoBattegroundId());
            if(oggettiBattlegroundEntity.getDescrizione()!=null)oggettiBattlegroundEntityDto.setDescrizione(oggettiBattlegroundEntity.getDescrizione());

            if(oggettiBattlegroundEntity.getLoot()!=null)oggettiBattlegroundEntityDto.setLoot(oggettiBattlegroundEntity.getLoot());
            if(oggettiBattlegroundEntity.getRandomLoot()!=null)oggettiBattlegroundEntityDto.setRandomLoot((oggettiBattlegroundEntity.getRandomLoot()));
            if(oggettiBattlegroundEntity.getCopertura()!=null)oggettiBattlegroundEntityDto.setCopertura((oggettiBattlegroundEntity.getCopertura()));
            if(oggettiBattlegroundEntity.getValoreCopertura()!=null)oggettiBattlegroundEntityDto.setValoreCopertura((oggettiBattlegroundEntity.getValoreCopertura()));

        }
        return oggettiBattlegroundEntityDto;
    }

    public static OggettiBattlegroundEntity dtoToEntity(OggettiBattlegroundEntityDto dto){
        OggettiBattlegroundEntity OBE= new OggettiBattlegroundEntity();
        if(dto!=null){
            if(dto.getOggettoBattlegroundId()!=null) OBE.setOggettoBattegroundId(dto.getOggettoBattlegroundId());
            if(dto.getDescrizione()!=null)OBE.setDescrizione(dto.getDescrizione());
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
