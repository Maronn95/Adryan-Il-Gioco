package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.SkillsEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkillsNewJSONreq {


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

    public SkillsNewJSONreq(SkillsEntity skillsEntity) {
        this.idSkill = Math.toIntExact(skillsEntity.getIdSkill());
        this.name = skillsEntity.getName();
        this.buff1 = skillsEntity.getBuff1();
        this.buff2 = skillsEntity.getBuff2();
        this.value1 = skillsEntity.getValue1();
        this.value2 = skillsEntity.getValue2();
    }
}
