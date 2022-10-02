package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.RazzaEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RazzaNewJSONresp {

    @JsonProperty
    private Integer idRazza;

    @JsonProperty
    private String name;

    @JsonProperty
    private String bonus;

    @JsonProperty
    private String malus;

    public RazzaNewJSONresp(RazzaEntity razzaEntity) {
        this.idRazza = Math.toIntExact(razzaEntity.getIdRazza());
        this.name = razzaEntity.getName();
        this.bonus = razzaEntity.getBonus();
        this.malus = razzaEntity.getMalus();
    }
}
