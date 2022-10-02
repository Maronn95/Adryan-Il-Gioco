package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.FightEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FightNewJSONresp {

    @JsonProperty
    private Integer idFight;

    @JsonProperty
    private List<Long> idPg;

    @JsonProperty
    private BattlegroundDto battlegroundDto;

    public FightNewJSONresp(FightEntity fightEntity) {
        this.idFight=fightEntity.getIdFight();
        this.idPg=fightEntity.getIdPg();
        this.battlegroundDto = BattlegroundMapper.entityToDto( fightEntity.getBattlegroundEntity());

    }

}
