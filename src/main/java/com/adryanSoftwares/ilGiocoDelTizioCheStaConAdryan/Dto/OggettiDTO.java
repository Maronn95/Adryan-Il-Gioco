package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.TipoOggetto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OggettiDTO {

    @JsonProperty("idOggetti")
    private Integer idOggetti;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("descrizione")
    private String descrizione;
    @JsonProperty("livello")
    private Integer livello;
    @JsonProperty("tipo")
    private TipoOggetto tipo;
    @JsonProperty("rarita")
    private Rarita rarita;
    @JsonProperty("valoreRarita")
    private Integer valoreRarita;

}
