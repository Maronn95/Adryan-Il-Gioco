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
public class PgEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "vita", nullable = false)
    private int vita;

    @Column(name = "forza", nullable = false)
    private int Forza;
    @Column(name = "costituzione", nullable = false)
    private int Costituzione;
    @Column(name = "destrezza", nullable = false)
    private int Destrezza;
    @Column(name = "intelligenza", nullable = false)
    private int Intelligenza;
    @Column(name = "carisma", nullable = false)
    private int Carisma;
    @Column(name = "saggezza", nullable = false)
    private int Saggezza;

}
