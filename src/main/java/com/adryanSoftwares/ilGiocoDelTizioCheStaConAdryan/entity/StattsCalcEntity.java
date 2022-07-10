package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsCalcolateService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsCalcEntity {

    private int utilizzoArmaX;
    private int ca;
    private int vitaAttuale;

    @Autowired
    StattsCalcolateService stattsCalcolateService;

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
