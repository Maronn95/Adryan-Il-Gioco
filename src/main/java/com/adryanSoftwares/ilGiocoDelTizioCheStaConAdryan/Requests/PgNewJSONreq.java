package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.RazzaEnum;
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
    private StattsPureEntity stattsPureEntity;

    @JsonProperty
    private StattsCalcEntity stattsCalc;

    @JsonProperty
    private InventarioEquipaggiatoEntity inventarioEquipaggiato;

    @JsonProperty
    private RazzaEnum razzaEnum;

    @JsonProperty
    private List<Integer> potereList;

    @JsonProperty
    private List<Integer> magiaList;

    @JsonProperty
    private InventarioEntity inventario;

    @JsonProperty
    private List<Integer> skillList;

    @JsonProperty
    private AvanzamentoStattsPureEntity avanzamentoStattsPure;

    public PgNewJSONreq(PgEntity pgEntity) {
        this.idPG = Math.toIntExact(pgEntity.getIdPG());
        this.name = pgEntity.getName();
        this.stattsPureEntity = pgEntity.getStattsPureEntity();
        this.stattsCalc = pgEntity.getStattsCalcEntity();
        this.razzaEnum = pgEntity.getRazzaEnum();
        this.inventario = pgEntity.getInventarioEntity();
        this.inventarioEquipaggiato = pgEntity.getInventarioEquipaggiatoEntity();
        this.skillList = pgEntity.getSkillList();
        this.potereList = pgEntity.getPotereList();
        this.magiaList = pgEntity.getMagiaList();
        this.avanzamentoStattsPure = pgEntity.getAvanzamentoStattsPureEntity();
    }

}
