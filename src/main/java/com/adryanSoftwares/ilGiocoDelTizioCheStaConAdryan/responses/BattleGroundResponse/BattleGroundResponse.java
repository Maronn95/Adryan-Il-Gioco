package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattleGroundResponse;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.OggettoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BattleGroundResponse {

    @JsonProperty("data")
    private List<BattleGroundDto> Data;

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

