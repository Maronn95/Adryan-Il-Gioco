package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

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
    private Integer ArmiId;
    @JsonProperty("Descrizione")
    private String descrizione;

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
}
