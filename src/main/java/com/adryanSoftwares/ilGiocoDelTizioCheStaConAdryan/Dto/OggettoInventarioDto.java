package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OggettoInventarioDto {

    @JsonProperty("OggettoInventarioId")
    private Integer oggettoInventarioid;

    @JsonProperty("Descrizione")
    private String descrizione;

    @JsonProperty("base")
    private Integer base;

    @JsonProperty("altezza")
    private Integer altezza;

    @JsonProperty("peso")
    private Double peso;

    @JsonProperty("OggettoMagico")
    private Boolean oggettoMagico;

    @JsonProperty("Rarita")
    private Rarita rarita;




}
