package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.cazzoDuro.Rarita;
import lombok.*;


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












