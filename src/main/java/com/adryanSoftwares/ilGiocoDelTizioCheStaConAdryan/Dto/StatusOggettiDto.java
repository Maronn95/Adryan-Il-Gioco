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
public class StatusOggettiDto {

    @JsonProperty("idStatusOggetti")
    private Integer idStatusOggetti;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("categoria")
    private String categoria;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("turnoMax")
    private int turnoMax;

    @JsonProperty("turnoAttuale")
    private int turnoAttuale;

    @JsonProperty("effetto")
    private String effetto;

    @JsonProperty("descrizione")
    private String descrizione;

}
