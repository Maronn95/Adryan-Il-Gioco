package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BattleGroundEntity {

    private Long idBattleGround;

    private String mapCode;

    private String mapSize;

    private String ambientazione;

    private String weather;

    private OggettiEntity oggetto;
}