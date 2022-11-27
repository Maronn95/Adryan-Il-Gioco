package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PotereDTO {

    @JsonProperty("idPotere")
    private Integer idPotere;

    @JsonProperty("name")
    private String name;

    @JsonProperty("buff1")
    private String buff1;

    @JsonProperty("value1")
    private int value1;

    @JsonProperty("buff2")
    private String buff2;

    @JsonProperty("value2")
    private int value2;

}

