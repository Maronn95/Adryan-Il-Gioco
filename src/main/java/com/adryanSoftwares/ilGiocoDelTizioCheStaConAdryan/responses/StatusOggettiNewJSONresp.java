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
public class StatusOggettiNewJSONresp {

    @JsonProperty
    private Integer idStatusOggetti;

    @JsonProperty
    private String nome;

    @JsonProperty
    private String categoria;

    @JsonProperty
    private String tipo;

    @JsonProperty
    private int turnoMax;

    @JsonProperty
    private int turnoAttuale;

    @JsonProperty
    private String effetto;

    @JsonProperty
    private String descrizione;
}
