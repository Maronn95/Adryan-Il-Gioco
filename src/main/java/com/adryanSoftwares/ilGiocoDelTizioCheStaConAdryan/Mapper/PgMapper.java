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
        if(pgNewJSONresp.getRazzaEnum()!=null){
            pgEntity.setRazzaEnum(pgNewJSONresp.getRazzaEnum());
        }
        if(pgNewJSONresp.getInventario()!=null){
            pgEntity.setInventarioEntity(pgNewJSONresp.getInventario());
        }
        if(pgNewJSONresp.getInventarioEquipaggiato()!=null){
            pgEntity.setInventarioEquipaggiatoEntity(pgNewJSONresp.getInventarioEquipaggiato());
        }
        if(pgNewJSONresp.getSkillList()!=null){
            pgEntity.setSkillList(pgNewJSONresp.getSkillList());
        }
        if(pgNewJSONresp.getPotereList()!=null){
            pgEntity.setPotereList(pgNewJSONresp.getPotereList());
        }
        if(pgNewJSONresp.getMagiaList()!=null){
            pgEntity.setMagiaList(pgNewJSONresp.getMagiaList());
        }
        if(pgNewJSONresp.getAvanzamentoStattsPure()!=null){
            pgEntity.setAvanzamentoStattsPureEntity(pgNewJSONresp.getAvanzamentoStattsPure());
        }

        return pgEntity;
    }

}
