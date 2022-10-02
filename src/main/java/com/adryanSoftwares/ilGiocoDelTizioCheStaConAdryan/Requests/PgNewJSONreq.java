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
    private String idPG;

    @JsonProperty
    private StattsPureEntity stattsPureEntity;

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

}
