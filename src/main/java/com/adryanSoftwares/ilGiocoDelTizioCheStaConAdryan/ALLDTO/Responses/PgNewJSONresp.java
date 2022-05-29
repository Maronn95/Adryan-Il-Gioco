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
public class PgNewJSONresp {

    @JsonProperty
    private int idPG;

    @JsonProperty
    private String name;

    @JsonProperty
    private StattsPureDTO stattsPureDTO;

}
