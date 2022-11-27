package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.StattsCalcNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.StattsCalcNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsCalcEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONStattsCalc\\";
    private String table="StattsCalc";
    private StattsCalcNewJSONreq req;
    private StattsCalcNewJSONresp resp;

    private Integer idStattsCalc;
    private Integer utilizzoArmaX;
    private Integer ca;
    private Integer vitaAttuale;
    private Integer vitaMax;


//    public StattsCalcEntity calcolaStattsCalc (int forza,
//                                               int costituzione,
//                                               int destrezza,
//                                               int intelligenza,
//                                               int carisma,
//                                               int saggezza,
//                                               int vitaMax,
//                                               int vitaAttuale){
//            StattsCalcEntity stattsCalcEntity = new StattsCalcEntity();
//
//            stattsCalcEntity.setCa(costituzione+10);
//            stattsCalcEntity.setUtilizzoArmaX(forza+3);
//
//        return stattsCalcEntity;
//    }

}
