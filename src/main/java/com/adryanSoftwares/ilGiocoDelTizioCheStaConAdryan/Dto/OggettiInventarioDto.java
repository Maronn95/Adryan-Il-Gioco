package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.cazzoDuro.Rarita;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OggettiInventarioDto {

    @JsonProperty("OggettoInventarioId")
    private Long OggettoInventarioId;

    @JsonProperty("Descrizione")
    private String descrizione;

    @JsonProperty("DimensioneInventario")
    private String dimensioneInventario;

    @JsonProperty("OggettoMagico")
    private Boolean oggettoMagico;

    @JsonProperty("Rarita")
    private Rarita rarita;

    @JsonProperty("ArmaId")
    private Long armaId;

    @JsonProperty("ProtezioniIndossabiliId")
    private Long protezioneIndossabileId;


}
