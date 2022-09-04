package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FightDTO {

    @JsonProperty("idJSONfight")
    private Long idJSONfight;

    @JsonProperty("idPg")
    private List<Long> idPg;

    @JsonProperty("battleGroundDto")
    private BattleGroundDto battleGroundDto;

}
