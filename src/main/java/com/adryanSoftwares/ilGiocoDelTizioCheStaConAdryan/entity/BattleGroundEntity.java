package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BattleGroundEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idBattleGround")
    private Long idBattleGround;

    @Column(name = "mapCode")
    private String mapCode;

    @Column(name = "mapSize")
    private String mapSize;

    @Column ( name = "ambientazione")
    private String ambientazione;

    @Column(name = "weather")
    private String weather;

    @OneToOne
    @JoinColumn(name="idOggetto") //chiaveApplicativo
    private OggettiEntity oggetto;
}