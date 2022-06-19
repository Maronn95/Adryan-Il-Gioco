package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

 @Service
public class ArmiJSONserviceImpl implements ArmiJSONservice {
    final  String JSONtable = "Armi";

    @Autowired
    private ArmiRepository Arep;

    @Override
    public ArmiNewJSONresp newArmi(ArmiNewJSONreq req) throws IOException, ParseException {
        return (ArmiNewJSONresp) Arep.creates(req, new ArmiNewJSONresp(), this.JSONtable);

    }
}
