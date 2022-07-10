package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/pg")
public class PgController {


    @Autowired
    PgJSONservice pgJSONs;

    @GetMapping("/getPg/{idPg}")
    public PgNewJSONresp getPg (@PathVariable("idPg") Integer idPg) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return pgJSONs.selectPg(idPg);
    }


    @RequestMapping(value="/newJSONpg", method= RequestMethod.GET)
    public PgNewJSONresp creaPGinJSON(@RequestBody PgNewJSONreq pgJSON) throws Exception {
        return pgJSONs.newPg(pgJSON);

    }

    @DeleteMapping(value="/deletePG/{idPg}")
    public PgNewJSONresp deletePG (@PathVariable("idPg") Integer idPg) throws Exception {
        return pgJSONs.delete(idPg);
    }

    @RequestMapping(value="/updatePG")
    public PgNewJSONresp updatePG ( @RequestBody PgNewJSONreq pgJSON) throws Exception {
        return pgJSONs.update(pgJSON);
    }




/*

    @GetMapping("/getPg/{idPg}")
    public PgEntity getPg (@PathVariable("idPg") Long idPg){
        return this.pgServiceImpl.getPg(idPg);
    }

    @PostMapping("/setPg")
    public PgNewJSONreq setPg(@RequestBody PgNewJSONreq pgNewJSONreq){
        return  this.pgServiceImpl.setPg(pgNewJSONreq);
    }

    @GetMapping("/getAll")
    public List<PgNewJSONreq> getAllPg(){
        return this.pgServiceImpl.getAllPg();
    }

    @PostMapping("/setStattPure/{idPg}/{idStattsPure}")
    public PgEntity setStattPure (@PathVariable(value="idPg") Long idPg,@PathVariable Long idStattsPure){
        return this.pgServiceImpl.setStattPure(idPg,idStattsPure);
    }
/*
    @PostMapping("/setStatt")
    public StattsPureDTO setStatt(@RequestBody StattsPureDTO stattsPureDTO){
        stattsPureServiceImpl.setStatt(stattsPureDTO);
        return stattsPureDTO;
    }*/


}
