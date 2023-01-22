package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;

import java.util.ArrayList;

public class BattlegroundMapper {

    public static BattlegroundDto entityToDto(BattlegroundEntity BattleGround) {

        BattlegroundDto dto = new BattlegroundDto();
        if(BattleGround!=null) {
            if (BattleGround.getIdBattleground()!=null) dto.setIdBattleground(BattleGround.getIdBattleground());
            if (BattleGround.getWeather()!=null) dto.setWeather(BattleGround.getWeather());
            if (BattleGround.getAmbientazione()!=null) dto.setAmbientazione(BattleGround.getAmbientazione());
            if (BattleGround.getOggetto()!=null) dto.setOggetto(BattleGround.getOggetto());
        }
        return dto;
    }


    public static BattlegroundEntity dtoToEntity(BattlegroundDto bgDto){
        BattlegroundEntity bgEntity = new BattlegroundEntity();

            if (bgDto.getIdBattleground() != null) bgEntity.setIdBattleground(bgDto.getIdBattleground());
            if (bgDto.getWeather() != null) bgEntity.setWeather(bgDto.getWeather());
            if (bgDto.getAmbientazione() != null) bgEntity.setAmbientazione(bgDto.getAmbientazione());
            if (bgDto.getOggetto() != null) bgEntity.setOggetto(bgDto.getOggetto());
            return bgEntity;
    }


        public static ArrayList DtoNewEntity2 (BattlegroundDto bgDto) {
        BattlegroundEntity bgEntity = new BattlegroundEntity();
        OggettiEntity oggettoEntity = new OggettiEntity();
        ArrayList paperini = new ArrayList();

        if (bgDto != null) {
            if (bgDto.getIdBattleground() == null) {
                if (bgDto.getIdBattleground() != null) bgEntity.setIdBattleground(bgDto.getIdBattleground());
                if (bgDto.getWeather() != null) bgEntity.setWeather(bgDto.getWeather());
                if (bgDto.getAmbientazione() != null) bgEntity.setAmbientazione(bgDto.getAmbientazione());
                if (bgDto.getOggetto() != null) bgEntity.setOggetto(bgDto.getOggetto());


            }
            paperini.add(bgEntity);
            paperini.add(oggettoEntity);
        }
        return  paperini;
    }
    public static BattlegroundEntity DtoNewEntity(BattlegroundDto bgDto){
        BattlegroundEntity bgEntity = new BattlegroundEntity();
        if (bgDto != null) {
            if (bgDto.getIdBattleground() == null) {
                if (bgDto.getIdBattleground() != null) bgEntity.setIdBattleground(bgDto.getIdBattleground());
                if (bgDto.getWeather() != null) bgEntity.setWeather(bgDto.getWeather());
                if (bgDto.getAmbientazione() != null) bgEntity.setAmbientazione(bgDto.getAmbientazione());
                if (bgDto.getOggetto() != null)bgEntity.setOggetto(bgDto.getOggetto());

                return bgEntity;
            }
        }
        return null;
    }
}
