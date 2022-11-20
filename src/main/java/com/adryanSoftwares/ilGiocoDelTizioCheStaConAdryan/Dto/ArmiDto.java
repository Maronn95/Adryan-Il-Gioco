package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArmiDto {


    @JsonProperty("idArmi")
    private Integer idArmi;
    @JsonProperty("descrizione")
    private String descrizione;
    @JsonProperty("name")
    private String name;
    @JsonProperty("armaADistanza")
    private Boolean armaADistanza;
    @JsonProperty("dannoTipo")
    private String dannoTipo;
    @JsonProperty("danno")
    private Double danno;
    @JsonProperty("gittata")
    private Double gittata;
    @JsonProperty("moltiplicatoreCritico")
    private Double moltiplicatoreCritico;
    @JsonProperty("probabilitaCriticoArma")
    private Double probabilitaCriticoArma;
    @JsonProperty("rarita")
    private Rarita rarita;
    @JsonProperty("valoreRarita")
    private Integer valoreRarita;
    @JsonProperty("livello")
    private Integer livello;
}
