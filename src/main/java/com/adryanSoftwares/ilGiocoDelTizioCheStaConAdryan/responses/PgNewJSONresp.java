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
    private StattsPureEntity stattsPure;

    @JsonProperty
    private StattsCalcEntity stattsCalc;

    @JsonProperty
    private RazzaEntity razza;

    public PgNewJSONresp(PgEntity pgEntity) {
        this.idPG= Math.toIntExact(pgEntity.getIdPG());
        this.name=pgEntity.getName();
        this.stattsPure = pgEntity.getStattsPureEntity();
        this.stattsCalc =pgEntity.getStattsCalcEntity();
        this.razza = pgEntity.getRazzaEntity();
        this.inventario = pgEntity.getInventarioEntity();
        this.skills = pgEntity.getSkillsEntity();
        this.poteri = pgEntity.getPoteriEntity();
        this.magie = pgEntity.getMagieEntity();

    }
    @JsonProperty
    private List<PoteriEntity> poteri;

    @JsonProperty
    private List<MagiaEntity> magie;

    @JsonProperty
    private InventarioEntity inventario;

    @JsonProperty
    private List<SkillsEntity> skills;

}
