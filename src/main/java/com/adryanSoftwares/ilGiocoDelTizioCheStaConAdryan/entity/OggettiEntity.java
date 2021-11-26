package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class OggettiEntity {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

}
