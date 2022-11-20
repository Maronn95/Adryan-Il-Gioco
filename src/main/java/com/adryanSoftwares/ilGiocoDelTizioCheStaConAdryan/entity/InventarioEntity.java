package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    private Integer idInventario;

    private int base;

    private int altezza;

    private Long proprietario;

    private List<OggettoInventarioEntity> oggetti = new ArrayList<OggettoInventarioEntity>();

    private int [] [] slotGriglia = new int [altezza] [base];











}


