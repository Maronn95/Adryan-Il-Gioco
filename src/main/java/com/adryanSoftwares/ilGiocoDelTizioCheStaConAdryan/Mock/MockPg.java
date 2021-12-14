package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mock;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MockPg {

    private Long id;

    private String name;
    private int Forza;
    private int Costituzione;
    private int Destrezza;
    private int Intelligenza;
    private int Carisma;
    private int Saggezza;

    PgEntity pgEntity = new PgEntity ();

    public PgEntity carlo() {
        pgEntity.setName("Carlo");
        pgEntity.setForza(10);
        pgEntity.setDestrezza(10);
        pgEntity.setCostituzione(10);
        pgEntity.setIntelligenza(10);
        pgEntity.setCarisma(10);
        pgEntity.setSaggezza(10);
        return pgEntity;
    }

    public void printPg (){
        System.out.println(carlo().getId());
        System.out.println(carlo().getName());
        System.out.println(carlo().getForza());
        System.out.println(carlo().getDestrezza());
        System.out.println(carlo().getCostituzione());
        System.out.println(carlo().getIntelligenza());
        System.out.println(carlo().getCarisma());
        System.out.println(carlo().getSaggezza());
    }
}
