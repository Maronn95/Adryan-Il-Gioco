package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsCalcDto {

    @JsonProperty("idStattsCalc")
    private Integer idStattsCalc;
    @JsonProperty("utilizzoArmaX")
    private Integer utilizzoArmaX;
    @JsonProperty("ca")
    private Integer ca;
    @JsonProperty("vitaAttuale")
    private Integer vitaAttuale;
    @JsonProperty("vitaMax")
    private Integer vitaMax;

}
