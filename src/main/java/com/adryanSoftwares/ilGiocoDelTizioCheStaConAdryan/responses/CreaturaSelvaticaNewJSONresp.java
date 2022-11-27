package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AvanzamentoStattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
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
public class CreaturaSelvaticaNewJSONresp {

    @JsonProperty
    private Integer idCreaturaSelvatica;

    @JsonProperty
    private String name;

    @JsonProperty
    private StattsPureEntity stattsPureEntity;

    @JsonProperty
    private AvanzamentoStattsPureEntity avanzamentoStattsPureEntity;

    @JsonProperty
    private StattsCalcEntity stattsCalcEntity;

    @JsonProperty
    private List<Integer> skillList;

    @JsonProperty
    private List<Integer> potereList;

    @JsonProperty
    private List<Integer> magiaList;

    @JsonProperty
    private List<String> pattern;
}
