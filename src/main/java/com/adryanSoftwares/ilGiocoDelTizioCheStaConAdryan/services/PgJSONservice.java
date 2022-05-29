package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.PgNewJSONresp;
import org.json.simple.parser.ParseException;


import java.io.IOException;

public interface PgJSONservice {

  PgNewJSONresp newPg(PgNewJSONreq pgNewJSONreq) throws IOException, ParseException;
}
