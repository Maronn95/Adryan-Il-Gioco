package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsPureService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.StattsPureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stattsPure")
public class PgControllerStatsPure {

    @Autowired
    StattsPureService stattsPureServiceImpl;

    @GetMapping("/getAll")
    public List<StattsPureDTO> getAllStatts(){

        return this.stattsPureServiceImpl.getAllStatts();
    }

    /*@GetMapping("/getStatt/{name}")
    public StattsPureDTO getStatt(@PathVariable("name") String name){

        return this.stattsPureServiceImpl.getStatt(name);
    }*/

    @PostMapping("/setStatt")
    public StattsPureDTO setStatt(@RequestBody StattsPureDTO stattsPureDTO){
        stattsPureServiceImpl.setStatt(stattsPureDTO);
        return stattsPureDTO;
    }

    @GetMapping("/getStattById/{idPg}")
    public StattsPureEntity getStattById(@PathVariable("idPg") Long idPg){

        return this.stattsPureServiceImpl.getStattById(idPg);
    }

}