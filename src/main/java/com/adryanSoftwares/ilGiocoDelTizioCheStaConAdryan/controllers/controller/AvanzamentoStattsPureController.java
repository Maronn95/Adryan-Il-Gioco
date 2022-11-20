package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.AvanzamentoStattsPureNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.AvanzamentoStattsPureNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.AvanzamentoStattsPureService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
@RestController
@RequestMapping("/AvanzamentiStattsPure")
public class AvanzamentoStattsPureController {

    @Autowired
    AvanzamentoStattsPureService avanzamentoStattsPureService;

    @GetMapping("/getAvanzamentoStattsPure/{idAvanzamentoStattsPure}")
    public AvanzamentoStattsPureNewJSONresp getavanzamentoStattsPure (@PathVariable("idAvanzamentoStattsPure") Integer idAvanzamentoStattsPure) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return avanzamentoStattsPureService.selectAvanzamentoStattsPure(idAvanzamentoStattsPure);
    }


    @RequestMapping(value="/newAvanzamentoStattsPure", method= RequestMethod.GET)
    public AvanzamentoStattsPureNewJSONresp creaPGinJSON(@RequestBody AvanzamentoStattsPureNewJSONreq avanzamentoStattsPureNewJSONreq) throws Exception {
        return avanzamentoStattsPureService.newAvanzamentoStattsPure(avanzamentoStattsPureNewJSONreq);

    }

    @DeleteMapping(value="/deleteAvanzamentoStattsPure/{idAvanzamentoStattsPure}")
    public AvanzamentoStattsPureNewJSONresp deleteAvanzamentoStattsPure (@PathVariable("idAvanzamentoStattsPure") Integer idAvanzamentoStattsPure) throws Exception {
        return avanzamentoStattsPureService.deleteAvanzamentoStattsPure(idAvanzamentoStattsPure);
    }

    @RequestMapping(value="/updateAvanzamentoStattsPure")
    public AvanzamentoStattsPureNewJSONresp updateAvanzamentoStattsPure ( @RequestBody AvanzamentoStattsPureNewJSONreq avanzamentoStattsPureNewJSONreq) throws Exception {
        return avanzamentoStattsPureService.updateAvanzamentoStattsPure(avanzamentoStattsPureNewJSONreq);
    }
}
