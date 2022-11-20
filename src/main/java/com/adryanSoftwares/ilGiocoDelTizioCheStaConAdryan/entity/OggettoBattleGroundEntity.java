package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    private String descrizione;

    private String nome;

    private String dimensioniBattleGround;

    private Integer base;

    private Integer altezza;

    private Boolean copertura;

    private Double valoreCopertura;

    private Boolean loot;

    private Double randomLoot;

    private Rarita rarita;

    private Integer valoreRarita;

    private Integer livello;


    }
















