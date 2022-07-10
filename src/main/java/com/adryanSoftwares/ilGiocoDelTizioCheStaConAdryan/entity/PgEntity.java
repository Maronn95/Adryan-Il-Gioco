package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsCalcDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PgEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONpg\\";
    private String table="PG";
    private PgNewJSONreq req;
    private PgNewJSONresp resp;


    private Integer idPG;
    private String name;

    private StattsPureEntity stattsPureEntity;

    private StattsCalcDto stattsCalcDto;

    private StattsCalcEntity stattsCalc;

    private Razza razza;

    private List<Skills> skills;

    private List<Poteri> poteri;

    private List<Magia> magie;
}
