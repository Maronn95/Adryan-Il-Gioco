package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StattsPureNewJSONresp {

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
    private int trash;
    @JsonProperty
    private int vitaMax;

}
