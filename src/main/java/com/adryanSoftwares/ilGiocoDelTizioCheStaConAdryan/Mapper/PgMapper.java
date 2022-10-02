package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;

public class PgMapper {

    public static PgEntity respToEntity(PgNewJSONresp pgNewJSONresp){

        PgEntity pgEntity= new PgEntity();

        if(pgNewJSONresp.getName()!=null){
            pgEntity.setName(pgNewJSONresp.getName());
        }

        if(pgNewJSONresp.getStattsPure()!=null){
            pgEntity.setStattsPureEntity(pgNewJSONresp.getStattsPure());
        }

        if(pgNewJSONresp.getStattsCalc() != null){
            pgEntity.setStattsCalcEntity(pgNewJSONresp.getStattsCalc());
        }
        if(pgNewJSONresp.getIdPG()!=0){
            pgEntity.setIdPG(pgNewJSONresp.getIdPG());
        }
        if(pgNewJSONresp.getRazza()!=null){
            pgEntity.setRazzaEntity(pgNewJSONresp.getRazza());
        }
        if(pgNewJSONresp.getInventario()!=null){
            pgEntity.setInventarioEntity(pgNewJSONresp.getInventario());
        }
        if(pgNewJSONresp.getSkills()!=null){
            pgEntity.setSkillsEntity(pgNewJSONresp.getSkills());
        }
        if(pgNewJSONresp.getPoteri()!=null){
            pgEntity.setPoteriEntity(pgNewJSONresp.getPoteri());
        }
        if(pgNewJSONresp.getMagie()!=null){
            pgEntity.setMagieEntity(pgNewJSONresp.getMagie());
        }

        return pgEntity;
    }

}
