package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsCalcDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Magia;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Razza;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Skills;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Inventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Poteri;
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
    private StattsPureDTO stattsPureDTO;

    @JsonProperty
    private StattsCalcDto stattsCalcDto;

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
