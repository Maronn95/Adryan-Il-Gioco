package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MetodoB1DTO {

    @JsonProperty("azione")
    String azione;

    @JsonProperty("pgList")
    List<String> pgList;
    // come si popola questa lista?
    // risposta:
    // posizione 0 = stringa tipo personaggio
    // posizione 1 = id personaggio
    // posizione 2 = stringa tipo personaggio
    // posizione 3 = id personaggio
    // etcetera

    @JsonProperty("idFight")
    Integer idFight;

}
