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
public class MetodoB1DTO {

    @JsonProperty("azione")
    String azione;

    @JsonProperty("idPg1")
    Integer idPg1;

    @JsonProperty("idPg2")
    Integer idPg2;

    @JsonProperty("idFight")
    Integer idFight;
}
