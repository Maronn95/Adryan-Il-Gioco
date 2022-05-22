package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsCalcEntity {

    private int utilizzoArmaX;
    private int ca;

    public StattsCalcEntity calcolaStattsCalc (int forza,
                                               int costituzione,
                                               int destrezza,
                                               int intelligenza,
                                               int carisma,
                                               int saggezza,
                                               int vita,
                                               int vitaMax,
                                               int vitaAttuale){

        StattsCalcEntity stattsCalcEntity = new StattsCalcEntity();

        stattsCalcEntity.setCa(costituzione+10);
        stattsCalcEntity.setUtilizzoArmaX(forza+3);

        return stattsCalcEntity;
    }

}
