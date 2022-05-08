package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OggettiBattlegroundEntity  {

    private Long oggettoBattegroundId;


    private String descrizione;


    private String dimensioneBattleground;


    private Boolean copertura;


    private Double valoreCopertura;


    private Boolean loot;


    private Double randomLoot;

    public OggettiBattlegroundEntity(Long oggettoBattegroundId){
     switch(Math.toIntExact(oggettoBattegroundId)){
         case 1:
             this.oggettoBattegroundId = oggettoBattegroundId;
             this.descrizione = "Albero semplice";
             this.dimensioneBattleground= "1X1";
             this.copertura= true;
             this.valoreCopertura = 30.00;
             this.loot = true;
             this.randomLoot= 10.00;
             break;
         case 2:
             this.oggettoBattegroundId= oggettoBattegroundId;
             this.descrizione= "Masso grande";
             this.dimensioneBattleground= "2X2";
             this.copertura = true;
             this.valoreCopertura = 50.00;
             this.loot = false;
             this.randomLoot = 0.00;
             break;
         case 3:
             this.oggettoBattegroundId = oggettoBattegroundId;
             this.descrizione = "Forziere piccolo";
             this.dimensioneBattleground = "1X1";
             this.copertura = false;
             this.valoreCopertura = 0.00;
             this.loot = true;
             this.randomLoot = 70.00;
             break;
         case 4:
             this.oggettoBattegroundId = oggettoBattegroundId;
             this.descrizione = "Forziere medio";
             this.dimensioneBattleground = "1X1";
             this.copertura = false;
             this.valoreCopertura = 0.00;
             this.loot = true;
             this.randomLoot = 70.00;
             break;
         case 5:
             this.oggettoBattegroundId = oggettoBattegroundId;
             this.descrizione = "Forziere grande";
             this.dimensioneBattleground= "2X2";
             this.copertura = false;
             this.valoreCopertura = 0.00;
             this.loot = true;
             this.randomLoot = 70.00;
             break;
     }
    }
}















