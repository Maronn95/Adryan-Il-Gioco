package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.Name;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PgEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    public PgEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
