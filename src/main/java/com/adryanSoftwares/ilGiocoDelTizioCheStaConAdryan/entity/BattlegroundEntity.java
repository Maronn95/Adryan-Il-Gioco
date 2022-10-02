package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.BattleGroundNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattlegroundNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BattlegroundEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONBattleground\\";
    private String table="Battleground";

    private BattleGroundNewJSONreq req;
    private BattlegroundNewJSONresp resp;

    private Integer idBattleGround;

    private String mapCode;

    private String mapSize;

    private String ambientazione;

    private String weather;

    private OggettiEntity oggetto;
}