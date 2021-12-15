package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mock;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MockPg {

    private Long id;

    private String name;
    private int forza;
    private int costituzione;
    private int destrezza;
    private int intelligenza;
    private int carisma;
    private int saggezza;

    private int vita;
    private int vitaMax;
    private int vitaAttuale;

    public int calcoloVita(){
        return vita;
    }

    PgEntity pgEntity = new PgEntity ();

    public PgEntity dido() {
        pgEntity.setVita(20);
        pgEntity.setName("Carlo");
        pgEntity.setForza(10);
        pgEntity.setDestrezza(10);
        pgEntity.setCostituzione(10);
        pgEntity.setIntelligenza(10);
        pgEntity.setCarisma(10);
        pgEntity.setSaggezza(10);

        return pgEntity;
    }

    public PgEntity camp() {
        pgEntity.setVita(20);
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
        System.out.println("Id "+dido().getId());
        System.out.println("Punti vita "+dido().getVita());
        System.out.println("Nome "+dido().getName());
        System.out.println("Forza "+dido().getForza());
        System.out.println("Destrezza "+dido().getDestrezza());
        System.out.println("Costituzione "+dido().getCostituzione());
        System.out.println("Intelligenza "+dido().getIntelligenza());
        System.out.println("Carisma "+dido().getCarisma());
        System.out.println("Saggezza "+dido().getSaggezza());
    }
}
