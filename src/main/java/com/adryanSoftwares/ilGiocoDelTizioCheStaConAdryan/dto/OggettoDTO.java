package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OggettoDTO {
    @JsonProperty("data")
    private List<OggettiEntity> data;

    @JsonProperty("id")
    private Long id;

}
