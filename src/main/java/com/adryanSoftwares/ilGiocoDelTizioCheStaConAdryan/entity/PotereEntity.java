package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PotereNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PotereNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PotereEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONpoteri\\";
    private String table="Poteri";
    private PotereNewJSONreq req;
    private PotereNewJSONresp resp;


    private Integer idPotere;

    private String name;

    private String buff1;

    private String buff2;

    private int value1;

    private int value2;

}
