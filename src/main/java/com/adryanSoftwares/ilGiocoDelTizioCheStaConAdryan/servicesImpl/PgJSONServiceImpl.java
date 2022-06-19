package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PgJSONServiceImpl implements PgJSONservice {


    final String JSONtable = "PG";

    @Autowired
    PGRepository PGrep;


    @Override
    public PgNewJSONresp newPg(PgNewJSONreq pgNewJSONreq) throws IOException, ParseException {
        return (PgNewJSONresp) PGrep.creates (pgNewJSONreq, new PgNewJSONresp(), this.JSONtable);
    }

    @Override
    public PgNewJSONresp selectPg(Integer idPg) throws IOException, ParseException {
        return (PgNewJSONresp) PGrep.selectById(idPg, new PgNewJSONresp(), this.JSONtable);
    }
}
