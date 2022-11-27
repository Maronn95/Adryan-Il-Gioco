package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

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
public class StattsPureNewJSONreq {

    @JsonProperty
    private Integer idStattsPure;
    @JsonProperty
    private int forza;
    @JsonProperty
    private int costituzione;
    @JsonProperty
    private int destrezza;
    @JsonProperty
    private int intelligenza;
    @JsonProperty
    private int carisma;
    @JsonProperty
    private int saggezza;
    @JsonProperty
    private int trash;
    @JsonProperty
    private int vitaPura;

    public StattsPureNewJSONreq(StattsPureEntity stattsPureEntity) {
        this.idStattsPure = Math.toIntExact(stattsPureEntity.getIdStattsPure());
        this.forza = stattsPureEntity.getForza();
        this.costituzione = stattsPureEntity.getCostituzione();
        this.destrezza = stattsPureEntity.getDestrezza();
        this.intelligenza = stattsPureEntity.getIntelligenza();
        this.carisma = stattsPureEntity.getCarisma();
        this.saggezza = stattsPureEntity.getSaggezza();
        this.trash = stattsPureEntity.getTrash();
        this.vitaPura = stattsPureEntity.getVitaPura();
    }

}
