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
public class OggettoInventarioEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONOggettoInventario\\";
    private String table="OggettoInventario";

    private Integer idOggettoInventario;

    private OggettiEntity oggettiEntity;

    private ArmiEntity armiEntity;

    private ProtezioniIndossabiliEntity protezioniIndossabiliEntity;

    private String descrizione;

    private Integer base;

    private Integer altezza;

    private String name;

    private Double peso;

    private Boolean oggettoMagico;

    private Rarita rarita;

    private Integer valoreRarita;

    private Integer livello;

}












