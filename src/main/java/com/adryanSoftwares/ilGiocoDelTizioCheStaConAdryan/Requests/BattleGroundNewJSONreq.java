package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BattleGroundNewJSONreq {

    @JsonProperty
    private Integer idBattleGround;

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
