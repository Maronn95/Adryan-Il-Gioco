package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;

public interface StattsCalcolateService {

    StattsPureEntity tXc();

    StattsPureDTO calcoloCa(long idPg);

    StattsPureEntity vita(int vita);

    StattsPureEntity vitaMax();

    StattsPureEntity vitaAttuale();

}
