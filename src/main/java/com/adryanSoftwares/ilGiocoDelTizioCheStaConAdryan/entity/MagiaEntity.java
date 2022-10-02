package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.MagiaNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.MagiaNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MagiaEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONmagia\\";
    private String table="Magia";
    private MagiaNewJSONreq req;
    private MagiaNewJSONresp resp;

    private String name;

    private String buff1;

    private String buff2;

    private int value1;

    private int value2;

}
