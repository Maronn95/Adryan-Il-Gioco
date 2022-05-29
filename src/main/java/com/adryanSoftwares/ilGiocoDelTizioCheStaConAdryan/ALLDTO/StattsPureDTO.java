package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO;

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
public class StattsPureDTO {
    @JsonProperty
    private Long idStattsPure;
    @JsonProperty
    private int forza;
    @JsonProperty
    private int costituzione;
    @JsonProperty
    private int destrezza;
    @JsonProperty
    private int intelligenza;
    @JsonProperty
    private int carisma;
    @JsonProperty
    private int saggezza;
    @JsonProperty
    private int vita;
    //private int utilizzoArmaX;
    @JsonProperty
    private int vitaMax;
    @JsonProperty
    private int vitaAttuale;
    @JsonProperty
    private StattsCalcDto stattsCalcDto;
}
