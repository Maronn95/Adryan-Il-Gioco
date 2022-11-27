package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

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
public class RazzaNewJSONreq {


    @JsonProperty
    private Integer idRazza;

    @JsonProperty
    private String name;

    @JsonProperty
    private String bonus;

    @JsonProperty
    private String malus;

    public RazzaNewJSONreq(RazzaEntity razzaEntity) {
        this.idRazza = Math.toIntExact(razzaEntity.getIdRazza());
        this.name = razzaEntity.getName();
        this.bonus = razzaEntity.getBonus();
        this.malus = razzaEntity.getMalus();
    }

}
