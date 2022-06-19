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
public class StattsPureDTO {

    @JsonProperty("idStattsPure")
    private Long idStattsPure;
    @JsonProperty("forza")
    private int forza;
    @JsonProperty("costituzione")
    private int costituzione;
    @JsonProperty("destrezza")
    private int destrezza;
    @JsonProperty("intelligenza")
    private int intelligenza;
    @JsonProperty("carisma")
    private int carisma;
    @JsonProperty("saggezza")
    private int saggezza;
    @JsonProperty("trash")
    private int trash;
    @JsonProperty("vitaMax")
    private int vitaMax;

}