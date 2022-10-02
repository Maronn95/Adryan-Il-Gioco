package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OggettiEntity {
    private Integer oggettoId;

    private String nome;

    private String descrizione;

    private TipoOggetto tipo;

    private Rarita rarita;


}
