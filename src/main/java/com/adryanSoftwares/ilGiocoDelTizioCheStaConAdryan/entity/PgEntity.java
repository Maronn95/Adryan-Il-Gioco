package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsCalcDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Magia.Magia;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Skills.Skills;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.poteri.Poteri;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PgEntity {

    private Long idPg;

    private String name;

    private StattsPureEntity stattsPureEntity;

    private StattsCalcDto stattsCalcDto;

    private String razza;

    private List<Skills> skills;

    private List<Poteri> poteri;

    private List<Magia> magie;
}
