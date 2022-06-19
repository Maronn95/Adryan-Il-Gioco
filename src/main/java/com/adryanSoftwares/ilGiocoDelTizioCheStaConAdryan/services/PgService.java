package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;

import java.util.List;


public interface PgService {

    PgNewJSONreq setPg(PgNewJSONreq pgNewJSONreq);

    List<PgNewJSONreq> getAllPg();

    PgEntity getPg(Long idPg);

    PgEntity setStattPure(Long idPg, Long idStattsPure);
}