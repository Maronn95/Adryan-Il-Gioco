package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.StattsCalcNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.StattsCalcNewJSONresp;
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

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONstattsCalc\\";
    private String table="StattsCalc";
    private StattsCalcNewJSONreq req;
    private StattsCalcNewJSONresp resp;

    private Integer idStattsCalc;

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
