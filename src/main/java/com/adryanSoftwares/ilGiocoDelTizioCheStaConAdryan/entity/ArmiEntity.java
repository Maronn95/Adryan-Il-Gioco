package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArmiEntity extends OggettoInventarioEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONarmi\\";
    private String table="Armi";
    /*private ArmiNewJSONreq req;
    private ArmiNewJSONresp resp;*/

    private Integer idArmi;

    private String descrizione;

    private String name;

    private Boolean armaADistanza;

    private String dannoTipo;

    private Double danno;

    private Double gittata;

    private Double moltiplicatoreCritico;

    private Double probabilitaCriticoArma;

    private Boolean attaccoMultiplo;

    private Double probabilitaAttaccoMultiplo;


    private Integer base;

    private Integer altezza;

    private Double peso;

    private Boolean oggettoMagico;

    private Rarita rarita;



}
