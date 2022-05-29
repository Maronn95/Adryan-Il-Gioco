package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONrepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONtests.pgRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class PgJSONServiceImpl implements PgJSONservice {






    final String JSONtable = "PG";



    @Override
    public PgNewJSONresp newPg(PgNewJSONreq pgNewJSONreq) throws IOException, ParseException {
        JSONcrudRepository Jrep = new JSONcrudRepository();
        return (PgNewJSONresp) Jrep.create(pgNewJSONreq, new PgNewJSONresp(), this.JSONtable);
    }
}
