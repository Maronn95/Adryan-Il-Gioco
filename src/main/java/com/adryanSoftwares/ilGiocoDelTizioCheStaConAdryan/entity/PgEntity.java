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

    public PgEntity(Long idPg) {

        switch (Math.toIntExact(idPg)) {
            case 1:
                this.idPg = idPg;
                this.name = "Zezzone";
                this.stattsPureEntity = new StattsPureEntity(1L);
                break;

            case 2:
                this.idPg = idPg;
                this.name = "Cafone";
                this.stattsPureEntity = new StattsPureEntity(2L);
                break;

            case 3:
                this.idPg = idPg;
                this.name = "Cujone";
                this.stattsPureEntity = new StattsPureEntity(3L);
                break;
        }
    }
}
