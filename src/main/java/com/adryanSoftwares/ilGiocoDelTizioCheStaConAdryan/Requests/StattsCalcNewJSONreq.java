package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsCalcNewJSONreq {


    @JsonProperty
    private Integer idStattsCalc;


    @JsonProperty
    private int utilizzoArmaX;
    @JsonProperty
    private int ca;
    @JsonProperty
    private int vitaAttuale;

}
