package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PoteriEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PoteriNewJSONresp {

    @JsonProperty
    private Integer idPotere;

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

    public PoteriNewJSONresp(PoteriEntity poteriEntity) {
        this.idPotere = Math.toIntExact(poteriEntity.getIdPotere());
        this.name = poteriEntity.getName();
        this.buff1 = poteriEntity.getBuff1();
        this.buff2 = poteriEntity.getBuff2();
        this.value1 = poteriEntity.getValue1();
        this.value2 = poteriEntity.getValue2();
    }

}

