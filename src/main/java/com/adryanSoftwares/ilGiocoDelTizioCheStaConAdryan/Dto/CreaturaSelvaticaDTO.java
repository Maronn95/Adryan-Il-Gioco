package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AvanzamentoStattsPureEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreaturaSelvaticaDTO {

    @JsonProperty("idCreaturaSelvatica")
    private Integer idCreaturaSelvatica;

    @JsonProperty("name")
    private String nameDto;

    @JsonProperty("stattsPureDTO")
    private StattsPureDTO stattsPureDTO;

    @JsonProperty("stattsCalcDto")
    private StattsCalcDto stattsCalcDto;

    @JsonProperty("avanzamentoStattsPure")
    private AvanzamentoStattsPureEntity avanzamentoStattsPure;

    @JsonProperty("skillEntityList")
    private List<Integer> skillList;

    @JsonProperty("potereEntityList")
    private List<Integer> potereList;

    @JsonProperty("magiaEntityList")
    private List<Integer> magiaList;

    @JsonProperty("pattern")
    private List<String> pattern;

}
