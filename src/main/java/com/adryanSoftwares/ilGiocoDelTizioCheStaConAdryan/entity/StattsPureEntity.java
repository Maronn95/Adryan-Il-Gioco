package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsPureService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsPureEntity {

    private Long idStattsPure;

    private int forza;
    private int costituzione;
    private int destrezza;
    private int intelligenza;
    private int carisma;
    private int saggezza;
    private int vita;
    private int vitaMax;
    private int vitaAttuale;
    private StattsCalcEntity stattsCalcEntity;

    @Autowired
    StattsPureService stattsPureService;

    /*public StattsPureEntity(Long idStattsPure) {

        switch (Math.toIntExact(idStattsPure)) {
            case 1 :
                this.idStattsPure=idStattsPure;
                this.forza = 10;
                this.costituzione = 10;
                this.destrezza = 10;
                this.intelligenza = 10;
                this.carisma = 10;
                this.saggezza = 10;
                this.vita = 10;
                //this.utilizzoArmaX = 10;
                this.vitaMax = 10;
                this.vitaAttuale = 10;
                StattsCalcEntity stattsCalcEntity1 = new StattsCalcEntity();
                this.stattsCalcEntity = stattsCalcEntity1.calcolaStattsCalc(this.forza,
                                                                            this.costituzione,
                                                                            this.destrezza,
                                                                            this.intelligenza,
                                                                            this.carisma,
                                                                            this.saggezza,
                                                                            this.vita,
                                                                            this.vitaMax,
                                                                            this.vitaAttuale);
                //this.ca = 10;
                break;

            case 2 :
                this.idStattsPure=idStattsPure;
                this.forza = 11;
                this.costituzione = 11;
                this.destrezza = 11;
                this.intelligenza = 11;
                this.carisma = 11;
                this.saggezza = 11;
                this.vita = 11;
                //this.utilizzoArmaX = 11;
                this.vitaMax = 11;
                this.vitaAttuale = 11;
                //this.ca = 11;
                StattsCalcEntity stattsCalcEntity2 = new StattsCalcEntity();
                this.stattsCalcEntity = stattsCalcEntity2.calcolaStattsCalc(this.forza,
                                                                            this.costituzione,
                                                                            this.destrezza,
                                                                            this.intelligenza,
                                                                            this.carisma,
                                                                            this.saggezza,
                                                                            this.vita,
                                                                            this.vitaMax,
                                                                            this.vitaAttuale);
                break;

            case 3 :
                this.idStattsPure=idStattsPure;
                this.forza = 12;
                this.costituzione = 12;
                this.destrezza = 12;
                this.intelligenza = 12;
                this.carisma = 12;
                this.saggezza = 12;
                this.vita = 12;
                //this.utilizzoArmaX = 12;
                this.vitaMax = 12;
                this.vitaAttuale = 12;
                //this.ca = 12;
                StattsCalcEntity stattsCalcEntity3 = new StattsCalcEntity();
                this.stattsCalcEntity = stattsCalcEntity3.calcolaStattsCalc(this.forza,
                                                                            this.costituzione,
                                                                            this.destrezza,
                                                                            this.intelligenza,
                                                                            this.carisma,
                                                                            this.saggezza,
                                                                            this.vita,
                                                                            this.vitaMax,
                                                                            this.vitaAttuale);
                break;
        }
    }*/
}
