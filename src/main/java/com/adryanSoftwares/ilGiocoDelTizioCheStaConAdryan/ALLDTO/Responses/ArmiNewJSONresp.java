package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArmiNewJSONresp {


    @JsonProperty
    private int idArmi;

    @JsonProperty
    private String name;

}
