package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProtezioniIndossabiliNewJSONresp {

    @JsonProperty
    private int idProtInd;

    @JsonProperty
    private String name;
}
