package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PotereEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PotereNewJSONresp {

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

    public PotereNewJSONresp(PotereEntity potereEntity) {
        this.idPotere = Math.toIntExact(potereEntity.getIdPotere());
        this.name = potereEntity.getName();
        this.buff1 = potereEntity.getBuff1();
        this.buff2 = potereEntity.getBuff2();
        this.value1 = potereEntity.getValue1();
        this.value2 = potereEntity.getValue2();
    }

}

