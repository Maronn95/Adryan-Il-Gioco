package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/pg")
public class PgController {

    @Autowired
    PgJSONservice pgJSONs;

    @GetMapping("/getPg/{idPg}")
    public PgNewJSONresp getPg (@PathVariable("idPg") Integer idPg) throws IOException, ParseException {
        return pgJSONs.selectPg(idPg);
    }

    @RequestMapping(value="/newJSONpg", method= RequestMethod.GET)
    public PgNewJSONresp creaPGinJSON(@RequestBody PgNewJSONreq pgJSON) throws Exception {
        return pgJSONs.newPg(pgJSON);
    }

}
