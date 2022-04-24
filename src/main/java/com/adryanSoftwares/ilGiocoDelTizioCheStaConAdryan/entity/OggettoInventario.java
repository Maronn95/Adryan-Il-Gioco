package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OggettoInventario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "OggettoInventarioid")
    private Long OggettoInventarioid;

    @Column(name = "Descrizione")
    private String descrizione;

    @Column(name="DimensioneInventario")
    private String dimensioneInventario;

    @Column(name= "OggettoMagico")
    private Boolean oggettoMagico;

    @Column(name="Rarita")
    private Rarita rarita;

    @OneToOne
    @JoinColumn(name="ArmiId")
    private Armi arma;

    @OneToOne
    @JoinColumn(name="ProtezioniIndossabiliId")
    private ProtezioniIndossabili protezioneIndossabile;








}
