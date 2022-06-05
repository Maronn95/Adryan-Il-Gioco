package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
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
