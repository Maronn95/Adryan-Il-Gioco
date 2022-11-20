package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.EffettiMagiciDifensivi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Locazione;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ProtezioniIndossabiliNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ProtezioniIndossabiliNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProtezioniIndossabiliEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONProtezioniIndossabili\\";
    private String table="ProtezioniIndossabili";


    private Integer idProtezioniIndossabili;

    private String nome;

    private String descrizione;

    private Locazione locazione;

    private EffettiMagiciDifensivi efd;

    private Boolean oggettoMagico;



    private Double valoreProtettivo;


    private Double durabilita;



}


