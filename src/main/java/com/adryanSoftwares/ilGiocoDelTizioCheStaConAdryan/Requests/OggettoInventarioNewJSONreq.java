package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OggettoInventarioNewJSONreq {

    @JsonProperty
    private Integer idOggettoInventarioid;
    @JsonProperty
    private String descrizione;
    @JsonProperty
    private Integer base;
    @JsonProperty
    private Integer altezza;
    @JsonProperty
    private Double peso;
    @JsonProperty
    private Boolean oggettoMagico;
    @JsonProperty
    private Rarita rarita;
    @JsonProperty
    private Integer valoreRarita;
    @JsonProperty
    private Integer livello;
    @JsonProperty
    private String tipoOggetto;
}
