package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StattsPureNewJSONreq {

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
