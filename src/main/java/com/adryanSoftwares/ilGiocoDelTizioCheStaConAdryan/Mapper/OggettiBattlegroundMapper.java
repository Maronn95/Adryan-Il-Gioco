package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoBattleGroundDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoBattleGroundEntity;

public class OggettiBattlegroundMapper {

    public static OggettoBattleGroundDTO entityToDto(OggettoBattleGroundEntity OBE){
        OggettoBattleGroundDTO dto= new OggettoBattleGroundDTO();
        if(OBE!=null){
            if(OBE.getIdOggettoBattleGround()!=null) dto.setIdOggettoBattleGround(OBE.getIdOggettoBattleGround());

            if(OBE.getDescrizione()!=null)dto.setDescrizione(OBE.getDescrizione());
            if(OBE.getDimensioniBattleGround()!=null)dto.setDimensioneBattleground(OBE.getDimensioniBattleGround());
            if(OBE.getLoot()!=null)dto.setLoot(OBE.getLoot());
            if(OBE.getBase()!=null)dto.setBase(OBE.getBase());
            if(OBE.getAltezza()!=null)dto.setAltezza(OBE.getAltezza());
            if(OBE.getNome()!=null)dto.setNome(OBE.getNome());
            if(OBE.getRandomLoot()!=null)dto.setRandomLoot((OBE.getRandomLoot()));
            if(OBE.getCopertura()!=null)dto.setCopertura((OBE.getCopertura()));
            if(OBE.getValoreCopertura()!=null)dto.setValoreCopertura((OBE.getValoreCopertura()));
            if(OBE.getRarita()!=null)dto.setRarita(OBE.getRarita());
            if(OBE.getValoreRarita()!=null)dto.setValoreRarita(OBE.getValoreRarita());
            if(OBE.getLivello()!=null)dto.setLivello(OBE.getLivello());

        }
        return dto;
    }

    public static OggettoBattleGroundEntity dtoToEntity(OggettoBattleGroundDTO dto){
        OggettoBattleGroundEntity OBE= new OggettoBattleGroundEntity();
        if(dto!=null){
            if(dto.getIdOggettoBattleGround()!=null) OBE.setIdOggettoBattleGround(dto.getIdOggettoBattleGround());
            if(dto.getDescrizione()!=null)OBE.setDescrizione(dto.getDescrizione());
            if(dto.getDimensioneBattleground()!=null)OBE.setDimensioniBattleGround(dto.getDimensioneBattleground());
            if(dto.getLoot()!=null)OBE.setLoot(dto.getLoot());
            if(dto.getBase()!=null)OBE.setBase(dto.getBase());
            if(dto.getNome()!=null)OBE.setNome(dto.getNome());
            if(dto.getAltezza()!=null)OBE.setAltezza(dto.getAltezza());
            if(dto.getRandomLoot()!=null)OBE.setRandomLoot((dto.getRandomLoot()));
            if(dto.getCopertura()!=null)OBE.setCopertura((dto.getCopertura()));
            if(dto.getValoreCopertura()!=null)OBE.setValoreCopertura((dto.getValoreCopertura()));
            if(dto.getRarita()!=null)OBE.setRarita(dto.getRarita());
            if(dto.getValoreRarita()!=null)OBE.setValoreRarita(dto.getValoreRarita());
            if(dto.getLivello()!=null)OBE.setLivello(dto.getLivello());


        }
        return OBE;
    }

    public static OggettoBattleGroundEntity dtoUpdateEntity(OggettoBattleGroundDTO bgDto) {
        OggettoBattleGroundEntity OBE= new OggettoBattleGroundEntity();
        if(bgDto!=null){
            if (bgDto.getIdOggettoBattleGround() != null) {
                OBE.setIdOggettoBattleGround(bgDto.getIdOggettoBattleGround());
                if(bgDto.getDescrizione()!=null)OBE.setDescrizione(bgDto.getDescrizione());
                if(bgDto.getLoot()!=null)OBE.setLoot(bgDto.getLoot());
                if(bgDto.getNome()!=null)OBE.setNome(bgDto.getNome());
                if(bgDto.getRandomLoot()!=null)OBE.setRandomLoot((bgDto.getRandomLoot()));
                if(bgDto.getCopertura()!=null)OBE.setCopertura((bgDto.getCopertura()));
                if(bgDto.getValoreCopertura()!=null)OBE.setValoreCopertura((bgDto.getValoreCopertura()));
                return OBE;
            }
        }
        return null;
    }

}