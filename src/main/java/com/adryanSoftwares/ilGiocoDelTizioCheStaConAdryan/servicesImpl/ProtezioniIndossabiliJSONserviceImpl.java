package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.ProtezioniIndossabiliNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.ProtezioniIndossabiliNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ProtezioniIndossabiliJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class ProtezioniIndossabiliJSONserviceImpl implements ProtezioniIndossabiliJSONservice {

    final  String JSONtable = "ProtInd";

    @Override
    public ProtezioniIndossabiliNewJSONresp newProtezioneIndossabile(ProtezioniIndossabiliNewJSONreq req) throws IOException, ParseException {
        JSONcrudRepository Jrep = new JSONcrudRepository();
        return (ProtezioniIndossabiliNewJSONresp) Jrep.create(req, new ProtezioniIndossabiliNewJSONresp(), this.JSONtable);
    }
}
