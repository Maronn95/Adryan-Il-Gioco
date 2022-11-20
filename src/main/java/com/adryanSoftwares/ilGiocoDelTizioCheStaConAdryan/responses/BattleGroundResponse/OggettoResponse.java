package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattleGroundResponse;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
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
public class OggettoResponse {

    @JsonProperty("data")
    private List<OggettiDTO> Data;

    @JsonProperty("id")
    private Long id;
}
