package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.RazzaNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.RazzaNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RazzaEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONrazza\\";
    private String table="Razza";
    private RazzaNewJSONreq req;
    private RazzaNewJSONresp resp;

    private Integer idRazza;

    private String name;

    private String bonus;

    private String malus;

}