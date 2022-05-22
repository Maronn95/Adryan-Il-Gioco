package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsPureDTO {

    private Long idStattsPure;

    private int forza;
    private int costituzione;
    private int destrezza;
    private int intelligenza;
    private int carisma;
    private int saggezza;
    private int vita;
    //private int utilizzoArmaX;
    private int vitaMax;
    private int vitaAttuale;
    private StattsCalcEntity stattsCalcEntity;
}
