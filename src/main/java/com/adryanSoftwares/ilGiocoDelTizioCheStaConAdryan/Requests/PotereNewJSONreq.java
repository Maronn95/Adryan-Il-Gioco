package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PotereEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PotereNewJSONreq {

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

    public PotereNewJSONreq(PotereEntity potereEntity) {
        this.idPotere = Math.toIntExact(potereEntity.getIdPotere());
        this.name = potereEntity.getName();
        this.buff1 = potereEntity.getBuff1();
        this.buff2 = potereEntity.getBuff2();
        this.value1 = potereEntity.getValue1();
        this.value2 = potereEntity.getValue2();
    }

}

