package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Razze.Razza;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PgNewJSONresp {

    @JsonProperty
    private int idPG;

    @JsonProperty
    private String name;

    @JsonProperty
    private StattsPureEntity stattsPure;

    @JsonProperty
    private StattsCalcEntity stattsCalc;

    @JsonProperty
    private Razza razza;

    public PgNewJSONresp(PgEntity pgEntity) {
        this.idPG= Math.toIntExact(pgEntity.getIdPG());
        this.name=pgEntity.getName();
        this.stattsPure = pgEntity.getStattsPure();
       // ??? danie pensaci tu??? addo li vu mett ste stattcalc? this.stattsCalc = pgEntity.get?
        this.razza = pgEntity.getRazza();

    }
}
