package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.StatusOggettiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.StatusOggettiNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusOggettiEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONstatusOggetti\\";
    private String table="StatusOggetti";
    private StatusOggettiNewJSONreq req;
    private StatusOggettiNewJSONresp resp;

    private Integer idStatusOggetti;

    private String nome;

    private String categoria;

    private String tipo;

    private int turnoMax;

    private int turnoAttuale=0;

    private String effetto;

    private String descrizione;

}
