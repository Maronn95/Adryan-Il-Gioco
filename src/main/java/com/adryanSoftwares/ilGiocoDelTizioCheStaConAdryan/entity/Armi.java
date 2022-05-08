package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Armi {

    private Long ArmiId;


    private String descrizione;

    private Boolean armaADistanza;

    private String dannoTipo;

    private Double danno;


    private Double gittata;


    private Boolean attaccoMultiplo;


    private Double probabilitaAttaccoMultiplo;


    private Double moltiplicatoreCritico;


    private Double probabilitaCriticoArma;

}


