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
@AllArgsConstructor
@NoArgsConstructor
public class PgDTO {

    @JsonProperty("idPg")
    private Long idPgDto;

    @JsonProperty("name")
    private String nameDto;

    @JsonProperty("stattsPureDTO")
    private StattsPureDTO stattsPureDTO;

    @JsonProperty("stattsCalcDto")
    private StattsCalcDto stattsCalcDto;

    @JsonProperty("razza")
    private RazzaEntity razzaDto;

    @JsonProperty("skills")
    private List<SkillsEntity> skillsDto;

    @JsonProperty("poteri")
    private List<PoteriEntity> poteriDto;

    @JsonProperty("magia")
    private List<MagiaEntity> magieDto;
}
