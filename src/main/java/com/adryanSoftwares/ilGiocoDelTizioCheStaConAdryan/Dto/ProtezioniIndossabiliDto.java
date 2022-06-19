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
public class ProtezioniIndossabiliDto {

    @JsonProperty("ProtezioniIndossabiliId")
    private Long ProtezioniIndossabiliId;

    @JsonProperty("Descrizione")
    private String descrizione;

    @JsonProperty("OggettoMagico")
    private Boolean oggettoMagico;

    @JsonProperty("EffettoMagicoDifensivo")
    private EffettiMagiciDifensivi efd;

    @JsonProperty("Locazione")
    private Locazione locazione;

    @JsonProperty("ValoreProtettivo")
    private Double valoreProtettivo;

    @JsonProperty("Durabilita")
    private Double durabilita;
}
