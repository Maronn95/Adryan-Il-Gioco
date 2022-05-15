package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PgEntity {

    private Long idPg;

    private String name;

    private StattsPureEntity stattsPureEntity;

    public PgEntity getPg(Long idPg) {

        switch (Math.toIntExact(idPg)) {
            case 1:
                PgEntity pg1 = new PgEntity();
                pg1.setIdPg(idPg);
                pg1.setName("Zezzone");
                pg1.setStattsPureEntity(new StattsPureEntity(1L));
                return pg1;

            case 2:
                PgEntity pg2 = new PgEntity();
                pg2.setIdPg(idPg);
                pg2.setName("Cafone");
                pg2.setStattsPureEntity(new StattsPureEntity(2L));
                return pg2;

            case 3:
                PgEntity pg3 = new PgEntity();
                pg3.setIdPg(idPg);
                pg3.setName("Cujone");
                pg3.setStattsPureEntity(new StattsPureEntity(3L));
                return pg3;

        }
System.out.println("sei passato da qua");
        return null;

    }
}
