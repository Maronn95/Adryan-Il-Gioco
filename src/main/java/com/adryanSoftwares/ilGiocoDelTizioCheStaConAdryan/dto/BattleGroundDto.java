package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class BattleGroundDto {

    @JsonProperty("idBattleGround")
    private Long idBattleGround;

    @JsonProperty("mapCode")
    private String mapCode;

    @JsonProperty("mapSize")
    private String mapSize;

    @JsonProperty("ambientazione")
    private String ambientazione;

    @JsonProperty("weather")
    private String weather;

    @JsonProperty("data")
    private List<BattleGroundEntity> data;



}
