package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PoteriNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PoteriNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PoteriEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONpoteri\\";
    private String table="Poteri";
    private PoteriNewJSONreq req;
    private PoteriNewJSONresp resp;


    private Integer idPotere;

    private String name;

    private String buff1;

    private String buff2;

    private int value1;

    private int value2;

}
