package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MagieNewJSONreq {

    @JsonProperty("name")
    private String name;

    @JsonProperty("buff1")
    private String buff1;

    @JsonProperty("buff2")
    private String buff2;

    @JsonProperty("value1")
    private int value1;

    @JsonProperty("value2")
    private int value2;

}
