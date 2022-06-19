package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Magia.Magia;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Razze.Razza;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Skills.Skills;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.poteri.Poteri;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PgEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONpg\\";
    private String table="PG";
    private PgNewJSONreq req;
    private PgNewJSONresp resp;


    Long idPG;
     String name;

    private StattsPureEntity stattsPure;

    private StattsCalcEntity stattsCalc;

    private Razza razza;

    private List<Skills> skills;

    private List<Poteri> poteri;

    private List<Magia> magie;

}
