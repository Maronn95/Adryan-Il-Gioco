package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Armi {

    private Integer armiId;

    private String name;

    private String descrizione;

    private Boolean armaADistanza;

    private String dannoTipo;

    private Double danno;

    private Double gittata;

    private Double moltiplicatoreCritico;

    private Double probabilitaCriticoArma;

    public Armi(Integer armiId) {

       switch (armiId){
           case 1:
               this.armiId=1;
               this.name="Spada Zezza";
               this.descrizione="È proprio una spada de merda";
               this.armaADistanza=false;
               this.dannoTipo="Tagliente";
               this.danno=10.0;
               this.gittata=1.0;
               this.moltiplicatoreCritico=1.5;
               this.probabilitaCriticoArma=20.0;
               break;

            case 2:
                this.armiId=2;
                this.name="Martello Zezzo";
                this.descrizione="Proprio un martello de merda";
                this.armaADistanza=false;
                this.dannoTipo="Contundente";
                this.danno=12.0;
                this.gittata=1.0;
                this.moltiplicatoreCritico=1.5;
                this.probabilitaCriticoArma=21.0;
                break;

           case 3:
               this.armiId=3;
               this.name="Arco Zezzo";
               this.descrizione="Non ci pii un cazzo con què";
               this.armaADistanza=true;
               this.dannoTipo="Perforante";
               this.danno=6.0;
               this.gittata=5.0;
               this.moltiplicatoreCritico=1.2;
               this.probabilitaCriticoArma=16.0;
               break;
        }
    }
}
