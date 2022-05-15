package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.PgDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.PgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pg")
public class PgController {

    @Autowired
    PgServiceImpl pgServiceImpl;

    @GetMapping("/getPg/{idPg}")
    public PgEntity getPg (@PathVariable("idPg") Long idPg){
        return this.pgServiceImpl.getPg(idPg);
    }

    @PostMapping("/setPg")
    public PgDTO setPg(@RequestBody PgDTO pgDTO){
        return  this.pgServiceImpl.setPg(pgDTO);
    }

    @GetMapping("/getAll")
    public List<PgDTO> getAllPg(){
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
