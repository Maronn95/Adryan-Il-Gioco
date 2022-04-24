package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "stattsPureEntity")
public class StattsPureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idStattsPure")
    private Long idStattsPure;

    @Column(name = "forza")
    private int forza;
    @Column(name = "costituzione")
    private int costituzione;
    @Column(name = "destrezza")
    private int destrezza;
    @Column(name = "intelligenza")
    private int intelligenza;
    @Column(name = "carisma")
    private int carisma;
    @Column(name = "saggezza")
    private int saggezza;
    @Column(name = "vita")
    private int vita;
    @Column(name = "utilizzoArmaX")
    private int utilizzoArmaX;
    @Column(name = "vitaMax")
    private int vitaMax;
    @Column(name = "vitaAttuale")
    private int vitaAttuale;
    @Column(name = "ca")
    private int ca;
}
