package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.EffettiMagiciDifensivi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Locazione;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProtezioniIndossabiliDTO {

    @JsonProperty("idProtezioniIndossabili")
    private Integer idProtezioniIndossabili;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("descrizione")
    private String descrizione;

    @JsonProperty("oggettoMagico")
    private Boolean oggettoMagico;

    @JsonProperty("effettoMagicoDifensivo")
    private EffettiMagiciDifensivi efd;

    @JsonProperty("locazione")
    private Locazione locazione;

    @JsonProperty("valoreProtettivo")
    private Double valoreProtettivo;

    @JsonProperty("durabilita")
    private Double durabilita;
}
