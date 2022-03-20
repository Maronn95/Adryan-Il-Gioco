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
@Table(name = "pg")
public class PgEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idPg")
    private Long idPg;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "idStattsPure")
    private StattsPureEntity stattsPureEntity;

}
