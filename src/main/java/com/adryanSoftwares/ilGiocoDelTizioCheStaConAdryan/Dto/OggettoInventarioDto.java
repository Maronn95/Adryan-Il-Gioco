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

    @JsonProperty("idOggettoInventarioid")
    private Integer idOggettoInventario;

    @JsonProperty("descrizione")
    private String descrizione;

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

    @JsonProperty("valoreLivelloRarita")
    private Integer livello;

    @JsonProperty("tipoOggetto")
    private String tipoOggetto;


}
