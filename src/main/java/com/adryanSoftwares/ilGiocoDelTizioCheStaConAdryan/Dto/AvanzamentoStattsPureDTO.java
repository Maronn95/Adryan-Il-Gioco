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
public class AvanzamentoStattsPureDTO {

    @JsonProperty("idAvanzamentoStattsPure")
    private Integer idAvanzamentoStattsPure;

    @JsonProperty("avanzamentoForza")
    private int avanzamentoForza;

    @JsonProperty("avanzamentoCostituzione")
    private int avanzamentoCostituzione;

    @JsonProperty("avanzamentoDestrezza")
    private int avanzamentoDestrezza;

    @JsonProperty("avanzamentoIntelligenza")
    private int avanzamentoIntelligenza;

    @JsonProperty("avanzamentoCarisma")
    private int avanzamentoCarisma;

    @JsonProperty("avanzamentoSaggezza")
    private int avanzamentoSaggezza;

    @JsonProperty("avanzamentoTrash")
    private int avanzamentoTrash;

    @JsonProperty("avanzamentoVitaMax")
    private int avanzamentoVitaMax;

}
