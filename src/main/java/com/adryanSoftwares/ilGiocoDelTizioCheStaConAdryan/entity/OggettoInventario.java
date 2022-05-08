package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OggettoInventario {

    private Long OggettoInventarioid;

    private String descrizione;


    private String dimensioneInventario;

    private Boolean oggettoMagico;


    private Rarita rarita;


}












