package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StattsPureDTO {

    @NotNull
    private Long id;

    @Column(name = "vita", nullable = false)
    private int vita;

    @Column(name = "forza", nullable = false)
    private int forza;
    @Column(name = "costituzione", nullable = false)
    private int costituzione;
    @Column(name = "destrezza", nullable = false)
    private int destrezza;
    @Column(name = "intelligenza", nullable = false)
    private int intelligenza;
    @Column(name = "carisma", nullable = false)
    private int carisma;
    @Column(name = "saggezza", nullable = false)
    private int saggezza;
    @Column(name = "utilizzoArmaX", nullable = false)
    private int utilizzoArmaX;
    @Column(name = "vitaMax", nullable = false)
    private int vitaMax;
    @Column(name = "vitaAttuale", nullable = false)
    private int vitaAttuale;
    @Column(name = "cA")
    private int ca;
}
