package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.IOException;

 @Service
public class ArmiJSONserviceImpl implements ArmiJSONservice {
    final  String JSONtable = "Armi";

    @Override
    public ArmiNewJSONresp newArmi(ArmiNewJSONreq req) throws IOException, ParseException {
      //  return (ArmiNewJSONresp) Jrep.creates(req, new ArmiNewJSONresp(), this.JSONtable);
        return null;
    }
}
