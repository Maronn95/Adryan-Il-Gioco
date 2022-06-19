package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Razze.Razza;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RazzaDTO {

    @JsonProperty("name")
    private String name;

    @JsonProperty("bonus")
    private String bonus;

    @JsonProperty("malus")
    private String malus;

    StattsPureDTO stattsPureDTO = new StattsPureDTO();

    public RazzaDTO (PgDTO pgDTO, Razza razza) {

        switch (razza.getName()) {
            case ("sbirro"):
                stattsPureDTO = pgDTO.getStattsPureDTO();

                //malus
                stattsPureDTO.setSaggezza(stattsPureDTO.getSaggezza() - 1);
                stattsPureDTO.setCarisma(stattsPureDTO.getCarisma() - 1);

                //bonus
                stattsPureDTO.setForza(stattsPureDTO.getForza() + 1);
                stattsPureDTO.setCostituzione(stattsPureDTO.getCostituzione() + 1);

                pgDTO.setStattsPureDTO(stattsPureDTO);

                razza.setName("sbirro");
                razza.setBonus("forza,costituzione");
                razza.setMalus("saggezza,carisma");

                return;

            case ("trashMan"):
                stattsPureDTO = pgDTO.getStattsPureDTO();

                //malus
                stattsPureDTO.setSaggezza(stattsPureDTO.getSaggezza() - 1);
                stattsPureDTO.setIntelligenza(stattsPureDTO.getIntelligenza() - 1);

                //bonus
                stattsPureDTO.setTrash(stattsPureDTO.getTrash() + 2);

                razza.setName("trashMan");
                razza.setBonus("trash");
                razza.setMalus("saggezza,intelligenza");

                return;

            case ("nobilUomo"):
                stattsPureDTO = pgDTO.getStattsPureDTO();

                //malus
                stattsPureDTO.setForza(stattsPureDTO.getForza() - 1);
                stattsPureDTO.setCostituzione(stattsPureDTO.getCostituzione() - 1);

                //bonus
                stattsPureDTO.setSaggezza(stattsPureDTO.getSaggezza() + 1);
                stattsPureDTO.setIntelligenza(stattsPureDTO.getIntelligenza() + 1);

                pgDTO.setStattsPureDTO(stattsPureDTO);

                razza.setName("nobilUomo");
                razza.setBonus("saggezza,intelligenza");
                razza.setMalus("forza,costituzione");

                return;
        }

    }
}
