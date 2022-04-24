package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Armi {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ArmiId")
    private Long ArmiId;

    @Column(name="Descrizione")
    private String descrizione;

    @Column(name="ArmaADistanza")
    private Boolean armaADistanza;

    @Column(name="DannoTipo")
    private String dannoTipo;

    @Column(name="Danno")
    private Double danno;

    @Column(name="Gittata")
    private Double gittata;

    @Column(name="AttaccoMultiplo")
    private Boolean attaccoMultiplo;

    @Column(name="ProbabilitaAttaccoMultiplo")
    private Double probabilitaAttaccoMultiplo;

    @Column(name="MoltiplicatoreCritico")
    private Double moltiplicatoreCritico;

    @Column(name="ProbabilitaCriticoArma")
    private Double probabilitaCriticoArma;

}
