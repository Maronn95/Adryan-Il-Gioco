package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AvanzamentoStattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.InventarioEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.InventarioEquipaggiatoEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.RazzaEntity;
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
public class PgDTO {

    @JsonProperty("idPg")
    private Integer idPgDto;

    @JsonProperty("name")
    private String nameDto;

    @JsonProperty("stattsPureDTO")
    private StattsPureDTO stattsPureDTO;

    @JsonProperty("stattsCalcDto")
    private StattsCalcDto stattsCalcDto;

    @JsonProperty("avanzamentoStattsPure")
    private AvanzamentoStattsPureEntity avanzamentoStattsPure;

    @JsonProperty("razza")
    private RazzaEntity razzaDto;

    @JsonProperty("skillEntityList")
    private List<Integer> skillList;

    @JsonProperty("potereEntityList")
    private List<Integer> potereList;

    @JsonProperty("magiaEntityList")
    private List<Integer> magiaList;

    @JsonProperty("inventarioEntity")
    private InventarioEntity inventarioEntity;

    @JsonProperty("inventarioEquipaggiatoEntity")
    private InventarioEquipaggiatoEntity inventarioEquipaggiatoEntity;
}