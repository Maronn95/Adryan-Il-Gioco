package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.PgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pg")
public class PgController {


    @Autowired
    PgJSONservice pgJSONs;




    @RequestMapping(value="/newJSONpg", method= RequestMethod.GET)
    public PgNewJSONresp creaPGinJSON(@RequestBody PgNewJSONreq pgJSON) throws Exception {
        System.out.println("sono nel controller");
        return pgJSONs.newPg(pgJSON);

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
