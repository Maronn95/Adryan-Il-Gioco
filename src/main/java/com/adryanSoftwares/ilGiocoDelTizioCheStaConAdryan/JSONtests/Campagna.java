package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONtests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Campagna {
    @JsonProperty
    String cane;
    @JsonProperty
    String gatto;
    @JsonProperty
    String sedia;
    @JsonProperty
    String tavolo;

}
