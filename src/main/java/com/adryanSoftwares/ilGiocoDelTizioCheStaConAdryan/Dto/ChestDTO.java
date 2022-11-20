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
    private Long idChest;
    @JsonProperty("dimensione")
    private String dimensione;
    @JsonProperty("livello")
    private Integer livello;
    @JsonProperty("rarita")
    private Rarita rarita;
    @JsonProperty("loot")
    private List<Integer> loot;
}
