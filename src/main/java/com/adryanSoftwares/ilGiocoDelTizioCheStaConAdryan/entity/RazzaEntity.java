package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RazzaEntity {

    private String name;

    private String bonus;

    private String malus;

//    StattsPureDTO stattsPureDTO = new StattsPureDTO();
//
//    public Razza(PgDTO pgDTO, Razza razza) {
//
//        switch (razza.getName()) {
//            case ("sbirro"):
//                stattsPureDTO = pgDTO.getStattsPureDTO();
//
//                //malus
//                stattsPureDTO.setSaggezza(stattsPureDTO.getSaggezza() - 1);
//                stattsPureDTO.setCarisma(stattsPureDTO.getCarisma() - 1);
//
//                //bonus
//                stattsPureDTO.setForza(stattsPureDTO.getForza() + 1);
//                stattsPureDTO.setCostituzione(stattsPureDTO.getCostituzione() + 1);
//
//                pgDTO.setStattsPureDTO(stattsPureDTO);
//
//                razza.setName("sbirro");
//                razza.setBonus("forza,costituzione");
//                razza.setMalus("saggezza,carisma");
//
//                return;
//
//            case ("trashMan"):
//                stattsPureDTO = pgDTO.getStattsPureDTO();
//
//                //malus
//                stattsPureDTO.setSaggezza(stattsPureDTO.getSaggezza() - 1);
//                stattsPureDTO.setIntelligenza(stattsPureDTO.getIntelligenza() - 1);
//
//                //bonus
//                stattsPureDTO.setTrash(stattsPureDTO.getTrash() + 2);
//
//                razza.setName("trashMan");
//                razza.setBonus("trash");
//                razza.setMalus("saggezza,intelligenza");
//
//                return;
//
//            case ("nobilUomo"):
//                stattsPureDTO = pgDTO.getStattsPureDTO();
//
//                //malus
//                stattsPureDTO.setForza(stattsPureDTO.getForza() - 1);
//                stattsPureDTO.setCostituzione(stattsPureDTO.getCostituzione() - 1);
//
//                //bonus
//                stattsPureDTO.setSaggezza(stattsPureDTO.getSaggezza() + 1);
//                stattsPureDTO.setIntelligenza(stattsPureDTO.getIntelligenza() + 1);
//
//                pgDTO.setStattsPureDTO(stattsPureDTO);
//
//                razza.setName("nobilUomo");
//                razza.setBonus("saggezza,intelligenza");
//                razza.setMalus("forza,costituzione");
//
//                return;
//        }
//
//    }
}