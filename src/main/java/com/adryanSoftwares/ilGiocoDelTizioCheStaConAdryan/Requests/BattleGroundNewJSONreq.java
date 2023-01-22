package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

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
public class BattleGroundNewJSONreq {

    @JsonProperty
    private Integer idBattleground;

    @JsonProperty
    private String ambientazione;

    @JsonProperty
    private String weather;

    @JsonProperty
    private Integer[][] oggetto;


}
