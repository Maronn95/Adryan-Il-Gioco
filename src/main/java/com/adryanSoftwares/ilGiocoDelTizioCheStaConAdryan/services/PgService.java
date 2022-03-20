package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.PgDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;

import java.util.List;

public interface PgService {

    PgDTO setPg(PgDTO pgDTO);

    List<PgDTO> getAllPg();

    PgEntity getPg(Long idPg);

    PgEntity setStattPure(Long idPg, Long idStattsPure);
}