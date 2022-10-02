package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;

import java.util.ArrayList;

public class BattleGroundMapper {

    public static BattleGroundDto entityToDto(BattleGroundEntity BattleGround) {

        BattleGroundDto dto = new BattleGroundDto();
        if(BattleGround!=null) {
            if (BattleGround.getIdBattleGround()!=null) dto.setIdBattleGround(BattleGround.getIdBattleGround());
            if (BattleGround.getMapCode()!=null) dto.setMapCode(BattleGround.getMapCode());
            if (BattleGround.getWeather()!=null) dto.setWeather(BattleGround.getWeather());
            if (BattleGround.getAmbientazione()!=null) dto.setAmbientazione(BattleGround.getAmbientazione());
            if (BattleGround.getMapSize()!=null) dto.setMapSize(BattleGround.getMapSize());
        }
        return dto;
    }

    public static BattleGroundEntity DtoUpdateEntity(BattleGroundDto bgDto) {
        BattleGroundEntity bgEntity = new BattleGroundEntity();
        if (bgDto != null) {
            if (bgDto.getIdBattleGround() != null) {
                if (bgDto.getIdBattleGround() != null) bgEntity.setIdBattleGround(bgDto.getIdBattleGround());
                if (bgDto.getMapCode() != null) bgEntity.setMapCode(bgDto.getMapCode());
                if (bgDto.getWeather() != null) bgEntity.setWeather(bgDto.getWeather());
                if (bgDto.getAmbientazione() != null) bgEntity.setAmbientazione(bgDto.getAmbientazione());
                if (bgDto.getMapSize() != null) bgEntity.setMapSize(bgDto.getMapSize());
                return bgEntity;
            }
        }
        return null;
    }
    public static BattleGroundEntity dtoToEntity(BattleGroundDto bgDto){
        BattleGroundEntity bgEntity = new BattleGroundEntity();

            if (bgDto.getIdBattleGround() != null) bgEntity.setIdBattleGround(bgDto.getIdBattleGround());
            if (bgDto.getMapCode() != null) bgEntity.setMapCode(bgDto.getMapCode());
            if (bgDto.getWeather() != null) bgEntity.setWeather(bgDto.getWeather());
            if (bgDto.getAmbientazione() != null) bgEntity.setAmbientazione(bgDto.getAmbientazione());
            if (bgDto.getMapSize() != null) bgEntity.setMapSize(bgDto.getMapSize());
            return bgEntity;
    }
        public static ArrayList DtoNewEntity2 (BattleGroundDto bgDto) {
        BattleGroundEntity bgEntity = new BattleGroundEntity();
        OggettiEntity oggettoEntity = new OggettiEntity();
        ArrayList paperini = new ArrayList();

        if (bgDto != null) {
            if (bgDto.getIdBattleGround() == null) {
                if (bgDto.getIdBattleGround() != null) bgEntity.setIdBattleGround(bgDto.getIdBattleGround());
                if (bgDto.getMapCode() != null) bgEntity.setMapCode(bgDto.getMapCode());
                if (bgDto.getWeather() != null) bgEntity.setWeather(bgDto.getWeather());
                if (bgDto.getAmbientazione() != null) bgEntity.setAmbientazione(bgDto.getAmbientazione());
                if (bgDto.getMapSize() != null) bgEntity.setMapSize(bgDto.getMapSize());
                if (bgDto.getOggetto() != null) oggettoEntity = bgDto.getOggetto();

            }
            paperini.add(bgEntity);
            paperini.add(oggettoEntity);
        }
        return  paperini;
    }
    public static BattleGroundEntity DtoNewEntity(BattleGroundDto bgDto){
        BattleGroundEntity bgEntity = new BattleGroundEntity();
        if (bgDto != null) {
            if (bgDto.getIdBattleGround() == null) {
                if (bgDto.getIdBattleGround() != null) bgEntity.setIdBattleGround(bgDto.getIdBattleGround());
                if (bgDto.getMapCode() != null) bgEntity.setMapCode(bgDto.getMapCode());
                if (bgDto.getWeather() != null) bgEntity.setWeather(bgDto.getWeather());
                if (bgDto.getAmbientazione() != null) bgEntity.setAmbientazione(bgDto.getAmbientazione());
                if (bgDto.getMapSize() != null) bgEntity.setMapSize(bgDto.getMapSize());
                if(bgDto.getOggetto()!= null) bgEntity.setOggetto(bgDto.getOggetto());
                return bgEntity;
            }
        }
        return null;
    }
}
