package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArmiNewJSONreq {

        @JsonProperty
        private String name;
        @JsonProperty
        private Boolean armaADistanza;
        @JsonProperty
        private String dannoTipo;
        @JsonProperty
        private Double danno;
        @JsonProperty
        private Double gittata;
        @JsonProperty
        private Double moltiplicatoreCritico;
        @JsonProperty
        private Double probabilitaCriticoArma;

}
