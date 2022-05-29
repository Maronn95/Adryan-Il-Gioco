package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PgNewJSONreq {

    @JsonProperty
    private String name;

    @JsonProperty
    private StattsPureDTO stattsPureDTO;

}
