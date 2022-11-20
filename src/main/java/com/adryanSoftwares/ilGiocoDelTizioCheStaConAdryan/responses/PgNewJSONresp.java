package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

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
    private InventarioEquipaggiatoEntity inventarioEquipaggiato;

    @JsonProperty
    private AvanzamentoStattsPureEntity avanzamentoStattsPure;

    @JsonProperty
    private RazzaEnum razzaEnum;

    public PgNewJSONresp(PgEntity pgEntity) {
        this.idPG= Math.toIntExact(pgEntity.getIdPG());
        this.name=pgEntity.getName();
        this.stattsPure = pgEntity.getStattsPureEntity();
        this.stattsCalc =pgEntity.getStattsCalcEntity();
        this.razzaEnum = pgEntity.getRazzaEnum();
        this.inventario = pgEntity.getInventarioEntity();
        this.inventarioEquipaggiato = pgEntity.getInventarioEquipaggiatoEntity();
        this.skillList = pgEntity.getSkillList();
        this.potereList = pgEntity.getPotereList();
        this.magiaList = pgEntity.getMagiaList();
        this.avanzamentoStattsPure = pgEntity.getAvanzamentoStattsPureEntity();

    }
    @JsonProperty
    private List<Integer> potereList;

    @JsonProperty
    private List<Integer> magiaList;

    @JsonProperty
    private InventarioEntity inventario;

    @JsonProperty
    private List<Integer> skillList;

}
