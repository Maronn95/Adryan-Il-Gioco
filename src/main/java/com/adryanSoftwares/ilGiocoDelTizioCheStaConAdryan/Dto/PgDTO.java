package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.MagiaEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.RazzaEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.SkillsEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PoteriEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PgDTO {

    @JsonProperty("idPg")
    private Long idPg;

    @JsonProperty("name")
    private String name;

    @JsonProperty("stattsPureDTO")
    private StattsPureDTO stattsPureDTO;

    @JsonProperty("stattsCalcDto")
    private StattsCalcDto stattsCalcDto;

    @JsonProperty("razza")
    private RazzaEntity razza;

    @JsonProperty("skills")
    private List<SkillsEntity> skills;

    @JsonProperty("poteri")
    private List<PoteriEntity> poteri;

    @JsonProperty("magia")
    private List<MagiaEntity> magie;


}
