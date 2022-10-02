package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
    private StattsPureEntity stattsPureEntity;

    @JsonProperty
    private StattsCalcEntity stattsCalc;

    @JsonProperty
    private Razza razza;

    public PgNewJSONresp(PgEntity pgEntity) {
        this.idPG= Math.toIntExact(pgEntity.getIdPG());
        this.name=pgEntity.getName();
        this.stattsPureEntity = pgEntity.getStattsPureEntity();
        this.poteri = pgEntity.getPoteri();
        this.razza = pgEntity.getRazza();
        this.skills = pgEntity.getSkills();
    }
    @JsonProperty
    private List<Poteri> poteri;

    @JsonProperty
    private List<Magia> magie;

    @JsonProperty
    private Inventario inventario;

    @JsonProperty
    private List<Skills> skills;

}
