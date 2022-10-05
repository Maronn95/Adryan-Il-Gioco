package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattleGroundResponse;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.OggettoDTO;
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
public class BattleGroundResponse {

    @JsonProperty("data")
    private List<BattlegroundDto> Data;

    @JsonProperty("idBattleGround")
    private Long idBattleGround;

    @JsonProperty("mapCode")
    private String mapCode;

    @JsonProperty("mapSize")
    private String mapSize;

    @JsonProperty("ambientazione")
    private String ambientazione;

    @JsonProperty("weather")
    private String weather;

    @JsonProperty ("oggetto")
    private OggettoDTO oggetto;
 }

