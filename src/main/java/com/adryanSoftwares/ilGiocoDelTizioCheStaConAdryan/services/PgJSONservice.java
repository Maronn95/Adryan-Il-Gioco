package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public interface PgJSONservice {

  PgNewJSONresp newPg(PgNewJSONreq entityRequest) throws IOException, ParseException;

  PgNewJSONresp selectPg( Integer idPg) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException;
}
