package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class AzioniEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    public AzioniEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
