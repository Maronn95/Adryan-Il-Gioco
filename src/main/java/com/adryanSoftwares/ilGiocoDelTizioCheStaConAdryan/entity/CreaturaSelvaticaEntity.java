package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.CreaturaSelvaticaNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.CreaturaSelvaticaNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreaturaSelvaticaEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONcreaturaSelvatica\\";
    private String table="CreaturaSelvatica";
    private CreaturaSelvaticaNewJSONreq req;
    private CreaturaSelvaticaNewJSONresp resp;

    private Integer idCreaturaSelvatica;

    private String name;

    private StattsPureEntity stattsPureEntity;

    private AvanzamentoStattsPureEntity avanzamentoStattsPureEntity;

    private StattsCalcEntity stattsCalcEntity;

    private List<Integer> skillList;

    private List<Integer> potereList;

    private List<Integer> magiaList;

    private List<String> pattern;



}
