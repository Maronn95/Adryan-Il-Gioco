package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.OggettoInventarioNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.OggettoInventarioNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
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
    private OggettoInventarioNewJSONreq req;
    private OggettoInventarioNewJSONresp resp;

    private Integer oggettoInventarioid;

     private String descrizione;

     private Integer base;

    private Integer altezza;

    private Double peso;

    private Boolean oggettoMagico;

    private Rarita rarita;


}












