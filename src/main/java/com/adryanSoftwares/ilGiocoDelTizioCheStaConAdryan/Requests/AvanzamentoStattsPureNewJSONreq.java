package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AvanzamentoStattsPureNewJSONreq {

    @JsonProperty
    private Integer idAvanzamentoStattsPure;

    @JsonProperty
    private int avanzamentoForza;

    @JsonProperty
    private int avanzamentoCostituzione;

    @JsonProperty
    private int avanzamentoDestrezza;

    @JsonProperty
    private int avanzamentoIntelligenza;

    @JsonProperty
    private int avanzamentoCarisma;

    @JsonProperty
    private int avanzamentoSaggezza;

    @JsonProperty
    private int avanzamentoTrash;

    @JsonProperty
    private int avanzamentoVitaMax;
}
