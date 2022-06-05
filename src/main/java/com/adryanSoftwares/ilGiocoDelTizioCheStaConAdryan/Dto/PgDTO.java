package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Magia.Magia;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Razze.Razza;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Skills.Skills;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.poteri.Poteri;
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
    private Long idPg;

    @JsonProperty("name")
    private String name;

    @JsonProperty("stattsPureDTO")
    private StattsPureDTO stattsPureDTO;

    @JsonProperty("stattsCalcDto")
    private StattsCalcDto stattsCalcDto;

    @JsonProperty("razza")
    private Razza razza;

    @JsonProperty("skills")
    private List<Skills> skills;

    @JsonProperty("poteri")
    private List<Poteri> poteri;

    @JsonProperty("magia")
    private List<Magia> magie;
}
