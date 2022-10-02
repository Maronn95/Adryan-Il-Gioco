package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.FightNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.FightNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FightEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONfight\\";
    private String table="Fight";
    private FightNewJSONreq req;
    private FightNewJSONresp resp;

    private Integer idFight;

    private List<Long> idPg;

    private BattlegroundEntity battlegroundEntity;
}
