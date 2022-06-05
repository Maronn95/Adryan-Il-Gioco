package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;
import java.io.IOException;



public interface PgJSONservice {

  PgNewJSONresp newPg(PgNewJSONreq pgNewJSONreq) throws IOException, ParseException;

  PgNewJSONresp selectPg(Integer idPg) throws IOException, ParseException;
}
