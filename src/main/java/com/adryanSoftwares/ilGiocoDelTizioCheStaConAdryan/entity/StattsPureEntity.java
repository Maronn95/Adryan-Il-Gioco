package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private int utilizzoArmaX;
    private int vitaMax;
    private int vitaAttuale;
    private int ca;

    public StattsPureEntity(Long idStattsPure) {

        switch (Math.toIntExact(idStattsPure)) {
            case 1 :
                this.idStattsPure = 1L;
                this.forza = 10;
                this.costituzione = 10;
                this.destrezza = 10;
                this.intelligenza = 10;
                this.carisma = 10;
                this.saggezza = 10;
                this.vita = 10;
                this.utilizzoArmaX = 10;
                this.vitaMax = 10;
                this.vitaAttuale = 10;
                this.ca = 10;
                break;

            case 2 :
                this.idStattsPure = 2L;
                this.forza = 11;
                this.costituzione = 11;
                this.destrezza = 11;
                this.intelligenza = 11;
                this.carisma = 11;
                this.saggezza = 11;
                this.vita = 11;
                this.utilizzoArmaX = 11;
                this.vitaMax = 11;
                this.vitaAttuale = 11;
                this.ca = 11;
                break;

            case 3 :
                this.idStattsPure = 3L;
                this.forza = 12;
                this.costituzione = 12;
                this.destrezza = 12;
                this.intelligenza = 12;
                this.carisma = 12;
                this.saggezza = 12;
                this.vita = 12;
                this.utilizzoArmaX = 12;
                this.vitaMax = 12;
                this.vitaAttuale = 12;
                this.ca = 12;
                break;
        }
    }
}
