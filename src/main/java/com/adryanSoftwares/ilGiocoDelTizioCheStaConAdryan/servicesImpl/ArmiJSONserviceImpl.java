package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

 @Service
public class ArmiJSONserviceImpl implements ArmiJSONservice {
    final  String JSONtable = "Armi";

    @Override
    public ArmiNewJSONresp newArmi(ArmiNewJSONreq req) throws IOException, ParseException {
        JSONcrudRepository Jrep = new JSONcrudRepository();
        return (ArmiNewJSONresp) Jrep.create(req, new ArmiNewJSONresp(), this.JSONtable);
    }
}
