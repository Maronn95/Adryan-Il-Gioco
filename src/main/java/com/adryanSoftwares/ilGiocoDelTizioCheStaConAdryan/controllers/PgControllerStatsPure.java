package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsPureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stattsPure")
public class PgControllerStatsPure {

    @Autowired
    private StattsPureService stattsPureService;

    @GetMapping("/getAll")
    public List<StattsPureDTO> getAllStatts(){

        return this.stattsPureService.getAllStatts();
    }

    @GetMapping("/getStatt/{name}")
    public StattsPureDTO getStatt(@PathVariable("name") String name){

        return this.stattsPureService.getStatt(name);
    }

    @PutMapping("/getStatt/{id}")
    public StattsPureDTO setStatt(@PathVariable("id") Long id,@RequestBody StattsPureDTO stattsPureDTO){

        return  this.stattsPureService.setStatt(id, stattsPureDTO);
    }
}
