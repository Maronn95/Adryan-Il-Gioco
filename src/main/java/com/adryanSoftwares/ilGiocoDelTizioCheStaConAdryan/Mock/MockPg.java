package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mock;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.StattsCalcolateRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsCalcolateService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.StattsPureServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MockPg {

    private Long id;

  /*  private String name;
    private int forza;
    private int costituzione;
    private int destrezza;
    private int intelligenza;
    private int carisma;
    private int saggezza;

    private int vita;
    private int vitaMax;
    private int vitaAttuale;
    private int utilizzoArmaX;
    private int ca;
*/

    @Autowired
    StattsPureEntity stattsPureEntity;
    StattsPureEntity dido;
    PgEntity pgEntity;
    StattsCalcolateRepo stattsCalcolateRepo;

    public StattsPureEntity dido() {
        stattsPureEntity.setVita(20);
        stattsPureEntity.setVitaAttuale(20);
        stattsPureEntity.setVitaMax(20);

        pgEntity.setName("Dido");

        stattsPureEntity.setForza(10);
        stattsPureEntity.setDestrezza(10);
        stattsPureEntity.setCostituzione(10);
        stattsPureEntity.setIntelligenza(10);
        stattsPureEntity.setCarisma(10);
        stattsPureEntity.setSaggezza(10);

        stattsPureEntity.setUtilizzoArmaX(2);

        stattsPureEntity.setCa(0);

        stattsCalcolateRepo.save(dido);

        return dido;
    }

    public StattsPureEntity camp() {
        stattsPureEntity.setVita(20);
        stattsPureEntity.setVitaAttuale(20);
        stattsPureEntity.setVitaMax(20);

        pgEntity.setName("Camp");

        stattsPureEntity.setForza(10);
        stattsPureEntity.setDestrezza(10);
        stattsPureEntity.setCostituzione(10);
        stattsPureEntity.setIntelligenza(10);
        stattsPureEntity.setCarisma(10);
        stattsPureEntity.setSaggezza(10);

        stattsPureEntity.setUtilizzoArmaX(2);

        stattsPureEntity.setCa(0);

        return stattsPureEntity;
    }

    @Autowired
    StattsCalcolateService stattsCalcolateService;


}
