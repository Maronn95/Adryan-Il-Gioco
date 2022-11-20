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

    @JsonProperty("idOggettoInventario")
    private Integer idOggettoInventario;

    @JsonProperty("idArmi")
    private Integer idArmi;

    @JsonProperty("idOggetto")
    private Integer idOggetto;

    @JsonProperty("idProtezione")
    private Integer idProtezione;

    @JsonProperty("descrizione")
    private String descrizione;

    @JsonProperty("name")
    private String name;

    @JsonProperty("base")
    private Integer base;

    @JsonProperty("altezza")
    private Integer altezza;

    @JsonProperty("peso")
    private Double peso;

    @JsonProperty("oggettoMagico")
    private Boolean oggettoMagico;

    @JsonProperty("rarita")
    private Rarita rarita;

    @JsonProperty("valoreRarita")
    private Integer valoreRarita;

    @JsonProperty("livello")
    private Integer livello;




}
