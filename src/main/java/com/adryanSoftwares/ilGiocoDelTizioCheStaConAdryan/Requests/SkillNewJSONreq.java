package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.SkillEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkillNewJSONreq {


    @JsonProperty
    private Integer idSkill;

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

    public SkillNewJSONreq(SkillEntity skillEntity) {
        this.idSkill = Math.toIntExact(skillEntity.getIdSkill());
        this.name = skillEntity.getName();
        this.buff1 = skillEntity.getBuff1();
        this.buff2 = skillEntity.getBuff2();
        this.value1 = skillEntity.getValue1();
        this.value2 = skillEntity.getValue2();
    }
}
