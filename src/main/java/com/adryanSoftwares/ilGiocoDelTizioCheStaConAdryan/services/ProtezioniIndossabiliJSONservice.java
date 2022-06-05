package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.ProtezioniIndossabiliNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.ProtezioniIndossabiliNewJSONresp;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface ProtezioniIndossabiliJSONservice {
    ProtezioniIndossabiliNewJSONresp newProtezioneIndossabile (ProtezioniIndossabiliNewJSONreq req) throws IOException, ParseException;
}
