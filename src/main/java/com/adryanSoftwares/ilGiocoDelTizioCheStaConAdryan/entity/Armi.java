package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Armi extends OggettoInventario {

    private String name;

    private Boolean armaADistanza;

    private String dannoTipo;

    private Double danno;

    private Double gittata;

    private Double moltiplicatoreCritico;

    private Double probabilitaCriticoArma;





}
