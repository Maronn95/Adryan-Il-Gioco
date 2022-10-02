package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BattlegroundNewJSONresp {

    @JsonProperty
    private Integer idBattleground;

    @JsonProperty
    private String mapCode;

    @JsonProperty
    private String mapSize;

    @JsonProperty
    private String ambientazione;

    @JsonProperty
    private String weather;

    @JsonProperty
    private List<BattleGroundEntity> data;

    @JsonProperty
    private OggettiEntity oggetto;
}
