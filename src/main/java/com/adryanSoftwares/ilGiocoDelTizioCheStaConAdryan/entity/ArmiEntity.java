package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArmiEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONarmi\\";
    private String table="Armi";

    private Integer idArmi;

    private String name;

    private Boolean armaADistanza;

    private String dannoTipo;

    private Double danno;

    private Double gittata;

    private Double moltiplicatoreCritico;

    private Double probabilitaCriticoArma;

    private String descrizione;

    private Rarita rarita;

    private Integer valoreRarita;

    private Integer livello;

}
