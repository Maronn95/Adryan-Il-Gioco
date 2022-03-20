package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PgDTO {

    private Long idPg;

    private String name;

    private StattsPureEntity stattsPureEntity;
}
