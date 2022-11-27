package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.CreaturaSelvaticaNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.CreaturaSelvaticaEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.CreaturaSelvaticaNewJSONresp;

public class CreatureSelvaticheMapper {

    public static CreaturaSelvaticaNewJSONresp entityToResp(CreaturaSelvaticaEntity entity){

        CreaturaSelvaticaNewJSONresp creaturaSelvaticaNewJSONresp= new CreaturaSelvaticaNewJSONresp();

        if(entity.getName()!=null){
            creaturaSelvaticaNewJSONresp.setName(entity.getName());
        }

        if(entity.getStattsPureEntity()!=null){
            creaturaSelvaticaNewJSONresp.setStattsPureEntity(entity.getStattsPureEntity());
        }

        if(entity.getStattsCalcEntity() != null){
            creaturaSelvaticaNewJSONresp.setStattsCalcEntity(entity.getStattsCalcEntity());
        }
        if(entity.getIdCreaturaSelvatica()!=0){
            creaturaSelvaticaNewJSONresp.setIdCreaturaSelvatica(entity.getIdCreaturaSelvatica());
        }
        if(entity.getSkillList()!=null){
            creaturaSelvaticaNewJSONresp.setSkillList(entity.getSkillList());
        }
        if(entity.getPotereList()!=null){
            creaturaSelvaticaNewJSONresp.setPotereList(entity.getPotereList());
        }
        if(entity.getMagiaList()!=null){
            creaturaSelvaticaNewJSONresp.setMagiaList(entity.getMagiaList());
        }
        if(entity.getAvanzamentoStattsPureEntity()!=null){
            creaturaSelvaticaNewJSONresp.setAvanzamentoStattsPureEntity(entity.getAvanzamentoStattsPureEntity());
        }

        if(entity.getPattern()!=null) {
            creaturaSelvaticaNewJSONresp.setPattern(entity.getPattern());
        }

        return creaturaSelvaticaNewJSONresp;
    }

    public static CreaturaSelvaticaNewJSONresp reqToResp(CreaturaSelvaticaNewJSONreq req){

        CreaturaSelvaticaNewJSONresp creaturaSelvaticaNewJSONresp= new CreaturaSelvaticaNewJSONresp();

        if(req.getName()!=null){
            creaturaSelvaticaNewJSONresp.setName(req.getName());
        }

        if(req.getStattsPureEntity()!=null){
            creaturaSelvaticaNewJSONresp.setStattsPureEntity(req.getStattsPureEntity());
        }

        if(req.getStattsCalcEntity() != null){
            creaturaSelvaticaNewJSONresp.setStattsCalcEntity(req.getStattsCalcEntity());
        }
        if(req.getIdCreaturaSelvatica()!=0){
            creaturaSelvaticaNewJSONresp.setIdCreaturaSelvatica(req.getIdCreaturaSelvatica());
        }
        if(req.getSkillList()!=null){
            creaturaSelvaticaNewJSONresp.setSkillList(req.getSkillList());
        }
        if(req.getPotereList()!=null){
            creaturaSelvaticaNewJSONresp.setPotereList(req.getPotereList());
        }
        if(req.getMagiaList()!=null){
            creaturaSelvaticaNewJSONresp.setMagiaList(req.getMagiaList());
        }
        if(req.getAvanzamentoStattsPureEntity()!=null){
            creaturaSelvaticaNewJSONresp.setAvanzamentoStattsPureEntity(req.getAvanzamentoStattsPureEntity());
        }
        if(req.getPattern()!=null) {
            creaturaSelvaticaNewJSONresp.setPattern(req.getPattern());
        }

        return creaturaSelvaticaNewJSONresp;
    }
}
