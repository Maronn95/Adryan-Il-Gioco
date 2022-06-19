package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AzioniEntity {

    private Long id;
    private String name;
    private Long obbiettivoIn;
    private int dannoIn;
    private String tipoDanno;


}
