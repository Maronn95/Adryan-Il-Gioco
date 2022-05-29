package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.PgNewJSONresp;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface ArmiJSONservice {

    ArmiNewJSONresp newArmi (ArmiNewJSONreq req) throws IOException, ParseException;

}
