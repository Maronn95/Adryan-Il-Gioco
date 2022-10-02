package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

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
public class PgNewJSONreq {

    @JsonProperty
    private String name;

    @JsonProperty
    private Integer idPG;

    @JsonProperty
    private StattsPureEntity stattsPure;

    @JsonProperty
    private StattsCalcEntity stattsCalc;

    @JsonProperty
    private RazzaEntity razza;

    @JsonProperty
    private List<PoteriEntity> poteri;

    @JsonProperty
    private List<MagiaEntity> magie;

    @JsonProperty
    private InventarioEntity inventario;

    @JsonProperty
    private List<SkillsEntity> skills;

    public PgNewJSONreq(PgEntity pgEntity) {
        this.idPG = Math.toIntExact(pgEntity.getIdPG());
        this.name = pgEntity.getName();
        this.stattsPure = pgEntity.getStattsPureEntity();
        this.stattsCalc = pgEntity.getStattsCalcEntity();
        this.razza = pgEntity.getRazzaEntity();
        this.inventario = pgEntity.getInventarioEntity();
        this.skills = pgEntity.getSkillsEntity();
        this.poteri = pgEntity.getPoteriEntity();
        this.magie = pgEntity.getMagieEntity();
    }

}
