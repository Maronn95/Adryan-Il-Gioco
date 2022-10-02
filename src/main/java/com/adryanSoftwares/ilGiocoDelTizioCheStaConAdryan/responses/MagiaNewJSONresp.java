package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MagiaNewJSONresp {

    @JsonProperty
    private Integer idMagia;

    @JsonProperty
    private String name;

    @JsonProperty
    private String buff1;

    @JsonProperty
    private String buff2;

    @JsonProperty
    private int value1;

    @JsonProperty
    private int value2;

}
