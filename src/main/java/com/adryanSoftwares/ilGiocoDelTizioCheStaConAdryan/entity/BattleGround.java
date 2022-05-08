package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BattleGround {

    private Long idBattleGround;

    private String mapCode;

    private String mapSize;

    private String ambientazione;

    private String weather;

    private OggettiEntity oggetto;

    public BattleGround (Long id){
        switch (Math.toIntExact(id)){
            case 1:
                this.idBattleGround = Long.valueOf(1);
                this.mapCode = "[0x0,1][0x1,3][1x0,2][1x1,0]";
                this.mapSize = "2x2";
                this.ambientazione = "accazzo";
                this.weather = "accasso";
                break;
        }
    }
}