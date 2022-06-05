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

    @JsonProperty("utilizzoArmaX")
    private int utilizzoArmaX;
    @JsonProperty("ca")
    private int ca;
    @JsonProperty("vitaAttuale")
    private int vitaAttuale;



}
