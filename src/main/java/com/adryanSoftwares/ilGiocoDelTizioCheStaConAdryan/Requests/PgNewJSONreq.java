package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsCalcDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Razze.Razza;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private StattsPureEntity stattsPure;

    @JsonProperty
    private StattsCalcEntity stattsCalc;

    @JsonProperty
    private Razza razza;

    @JsonProperty
    private List<Poteri> poteri;

    @JsonProperty
    private List<Magia> magie;

    @JsonProperty
    private Inventario inventario;

    @JsonProperty
    private List<Skills> skills;

}
