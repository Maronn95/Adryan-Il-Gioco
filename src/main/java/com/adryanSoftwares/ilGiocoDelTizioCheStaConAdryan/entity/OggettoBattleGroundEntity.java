package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OggettoBattleGroundEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONOggettoBattleGround\\";
    private String table="OggettoBattleGround";

    private Integer idOggettoBattleGround;

    private OggettiEntity oggettiEntity;

    private ArmiEntity armiEntity;

    private ProtezioniIndossabiliEntity protezioniIndossabiliEntity;

    private ChestEntity chestEntity;

    private List<Integer> statusList;
}