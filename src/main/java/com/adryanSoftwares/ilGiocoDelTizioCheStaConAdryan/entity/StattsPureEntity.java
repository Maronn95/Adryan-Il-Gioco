package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.StattsPureNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.StattsPureNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsPureEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONstattsPure\\";
    private String table="StattsPure";
    private StattsPureNewJSONreq req;
    private StattsPureNewJSONresp resp;

    private Integer idStattsPure;

    private int forza;
    private int costituzione;
    private int destrezza;
    private int intelligenza;
    private int carisma;
    private int saggezza;
    private int vitaPura;
    private int trash;

}
