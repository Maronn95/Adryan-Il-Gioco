package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
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
public class ChestDTO {
    @JsonProperty("idChest")
    private Integer idChest;
    @JsonProperty("dimensione")
    private Integer dimensione;
    @JsonProperty("livello")
    private Integer livello;
    @JsonProperty("rarita")
    private Rarita rarita;
    @JsonProperty("valoreRarita")
    private Integer valoreRarita;
    @JsonProperty("loot")
    private Integer[] loot;
}
