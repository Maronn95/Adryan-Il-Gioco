package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.InventarioNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.InventarioNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InventarioEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONInventario\\";
    private String table="Inventario";
    private InventarioNewJSONreq req;
    private InventarioNewJSONresp resp;

    private Integer idInventario;

    private int base = 1;

    private int altezza = 1;

    private Long proprietario;

    private List<OggettoInventarioEntity> oggetti = new ArrayList<OggettoInventarioEntity>();

    private int [] [] slotGriglia = new int [altezza] [base];











}


