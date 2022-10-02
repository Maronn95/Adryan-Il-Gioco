package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

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
public class StattsCalcNewJSONreq {


    @JsonProperty
    private Integer idStattsCalc;

    @JsonProperty
    private Integer utilizzoArmaX;
    @JsonProperty
    private Integer ca;
    @JsonProperty
    private Integer vitaAttuale;

    public StattsCalcNewJSONreq(StattsCalcEntity stattsCalcEntity) {
        this.idStattsCalc = Math.toIntExact(stattsCalcEntity.getIdStattsCalc());
        this.utilizzoArmaX = stattsCalcEntity.getUtilizzoArmaX();
        this.ca = stattsCalcEntity.getCa();
        this.vitaAttuale = stattsCalcEntity.getVitaAttuale();
    }
}
