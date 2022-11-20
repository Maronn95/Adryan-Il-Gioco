package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsCalcNewJSONresp {

    @JsonProperty
    private Integer idStattsCalc;

    @JsonProperty
    private int utilizzoArmaX;
    @JsonProperty
    private int ca;
    @JsonProperty
    private int vitaAttuale;
    @JsonProperty
    private Integer vitaMax;

    public StattsCalcNewJSONresp(StattsCalcEntity stattsCalcEntity) {
        this.idStattsCalc = Math.toIntExact(stattsCalcEntity.getIdStattsCalc());
        this.utilizzoArmaX = stattsCalcEntity.getUtilizzoArmaX();
        this.ca = stattsCalcEntity.getCa();
        this.vitaAttuale = stattsCalcEntity.getVitaAttuale();
        this.vitaMax = stattsCalcEntity.getVitaMax();
    }
}