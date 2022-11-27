package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsCalcDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;

public class StattsCalcMapper {

    public static StattsCalcEntity dtoToEntity (StattsCalcDto stattsCalcDto){
        StattsCalcEntity stattsCalcEntity= new StattsCalcEntity();
        if(stattsCalcDto.getIdStattsCalc()!=null){
            stattsCalcEntity.setIdStattsCalc(stattsCalcDto.getIdStattsCalc());
        }
        if(stattsCalcDto.getUtilizzoArmaX()!=null){
            stattsCalcEntity.setUtilizzoArmaX(stattsCalcDto.getUtilizzoArmaX());
        }
        if(stattsCalcDto.getVitaAttuale()!=null){
            stattsCalcEntity.setVitaAttuale((stattsCalcDto.getVitaAttuale()));
        }
        if(stattsCalcDto.getVitaMax()!=null){
            stattsCalcEntity.setVitaMax((stattsCalcDto.getVitaMax()));
        }
        if(stattsCalcDto.getCa()!=null){
            stattsCalcEntity.setCa((stattsCalcDto.getCa()));
        }
        return stattsCalcEntity;
    }

    public static StattsCalcDto entityToDto(StattsCalcEntity stattsCalcEntity) {
        StattsCalcDto stattsCalcDto= new StattsCalcDto();
        if(stattsCalcEntity.getIdStattsCalc()!=null){
            stattsCalcDto.setIdStattsCalc(stattsCalcEntity.getIdStattsCalc());
        }
        if(stattsCalcEntity.getUtilizzoArmaX()!=null){
            stattsCalcDto.setUtilizzoArmaX(stattsCalcEntity.getUtilizzoArmaX());
        }
        if(stattsCalcEntity.getVitaAttuale()!=null){
            stattsCalcDto.setVitaAttuale((stattsCalcEntity.getVitaAttuale()));
        }
        if(stattsCalcEntity.getVitaMax()!=null){
            stattsCalcDto.setVitaMax((stattsCalcEntity.getVitaMax()));
        }
        if(stattsCalcEntity.getCa()!=null){
            stattsCalcDto.setCa((stattsCalcEntity.getCa()));
        }
        return stattsCalcDto;
    }
}
