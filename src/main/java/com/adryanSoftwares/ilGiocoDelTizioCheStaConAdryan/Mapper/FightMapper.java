package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.FightEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.FightNewJSONresp;

public class FightMapper {

    public static FightNewJSONresp entityToResp(FightEntity fightEntity){
        FightNewJSONresp fightNewJSONresp= new FightNewJSONresp();
        if(fightEntity.getIdFight()!=null){
            fightNewJSONresp.setIdFight(fightEntity.getIdFight());
        }
        if(fightEntity.getIdPg().size()<0){
            fightNewJSONresp.setIdPg(fightEntity.getIdPg());
        }
        if(fightEntity.getBattlegroundEntity()!=null){
            fightNewJSONresp.setBattlegroundDto(BattlegroundMapper.entityToDto(fightEntity.getBattlegroundEntity()));
        }
        return fightNewJSONresp;
    }



}
