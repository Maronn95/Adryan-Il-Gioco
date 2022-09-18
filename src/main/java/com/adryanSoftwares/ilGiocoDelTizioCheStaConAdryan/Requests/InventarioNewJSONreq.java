package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventarioEntity;
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
public class InventarioNewJSONreq {

    @JsonProperty
    private Long idInventario;

    @JsonProperty
    private int base;

    @JsonProperty
    private int altezza;

    @JsonProperty
    private Long proprietario;

    @JsonProperty
    private List<OggettoInventarioEntity> oggetti = new ArrayList<OggettoInventarioEntity>();


}


