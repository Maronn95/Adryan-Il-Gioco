package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO;

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

    @JsonProperty
    private int utilizzoArmaX;
    @JsonProperty
    private int ca;

    public  int getca() {
        return this.ca;
    }
}
