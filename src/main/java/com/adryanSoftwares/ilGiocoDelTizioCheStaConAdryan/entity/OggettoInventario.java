package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OggettoInventario {

    private Long OggettoInventarioid;

     private String descrizione;

     private int base;

    private int altezza;

    private Double peso;

    private Boolean oggettoMagico;

    private Rarita rarita;


}












