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

    @JsonProperty("utilizzoArmaX")
    private int utilizzoArmaX;
    @JsonProperty("ca")
    private int ca;
    @JsonProperty("vitaAttuale")
    private int vitaAttuale;

}
