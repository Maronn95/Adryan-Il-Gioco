package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ArmiNewJSONresp;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface ArmiJSONservice {

    ArmiNewJSONresp newArmi (ArmiNewJSONreq req) throws IOException, ParseException;

}
