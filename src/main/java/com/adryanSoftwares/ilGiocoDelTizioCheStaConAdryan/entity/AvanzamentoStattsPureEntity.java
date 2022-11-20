package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.AvanzamentoStattsPureNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.AvanzamentoStattsPureNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AvanzamentoStattsPureEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONavanzamentoStattsPure\\";
    private String table="AvanzamentoStattsPure";
    private AvanzamentoStattsPureNewJSONreq req;
    private AvanzamentoStattsPureNewJSONresp resp;

    private Integer idAvanzamentoStattsPure;
    private int avanzamentoForza;
    private int avanzamentoCostituzione;
    private int avanzamentoDestrezza;
    private int avanzamentoIntelligenza;
    private int avanzamentoCarisma;
    private int avanzamentoSaggezza;
    private int avanzamentoVitaMax;
    private int avanzamentoTrash;
}
