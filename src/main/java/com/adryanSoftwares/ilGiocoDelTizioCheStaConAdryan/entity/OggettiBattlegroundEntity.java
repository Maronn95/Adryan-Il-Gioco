package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OggettiBattlegroundEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "OggettoBattlegroundId")
    private Long OggettoBattegroundId;

    @Column(name = "Descrizione")
    private String descrizione;

    @Column(name ="DimensioneBattleground")
    private String dimensioneBattleground;

    @Column(name="Copertura")
    private Boolean copertura;

    @Column(name= "ValoreCopertura")
    private Double valoreCopertura;

    @Column(name="Loot")
    private Boolean loot;

    @Column(name="RandomLoot")
    private Integer randomLoot;

}


