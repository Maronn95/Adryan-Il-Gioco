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


    @JsonProperty("ArmiId")
    private Integer idArmi;
    @JsonProperty("Descrizione")
    private String descrizione;
    @JsonProperty
    private String name;
    @JsonProperty("ArmAADistanza")
    private Boolean armaADistanza;
    @JsonProperty("DannoTipo")
    private String dannoTipo;
    @JsonProperty("Danno")
    private Double danno;
    @JsonProperty("Gittata")
    private Double gittata;
    @JsonProperty("AttaccoMultiplo")
    private Boolean attaccoMultiplo;
    @JsonProperty("ProbabilitaAttaccoMultiplo")
    private Double probabilitaAttaccoMultiplo;
    @JsonProperty("MoltiplicatoreCritico")
    private Double moltiplicatoreCritico;
    @JsonProperty("ProbabilitaCriticoArma")
    private Double probabilitaCriticoArma;
    @JsonProperty("base")
    private int base;
    @JsonProperty("altezza")
    private int altezza;
    @JsonProperty("peso")
    private Double peso;
    @JsonProperty("oggettoMagico")
    private Boolean oggettoMagico;
    @JsonProperty("rarita")
    private Rarita rarita;
}
