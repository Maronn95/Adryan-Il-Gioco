package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ArmiMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettiInventarioMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.ArmiServiceImpl;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.OggettoInventarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/armi")
public class ArmiController {

    @Autowired
    ArmiServiceImpl AR;

    @RequestMapping(value="/armi")
    public List<ArmiDto> GetArmi(){
        ArmiMapper AM = new ArmiMapper();
        List<Armi> armi=AR.getArmi();
        List<ArmiDto> armiDto =new ArrayList<ArmiDto>();
        for(Armi a:armi)
            armiDto.add( AM.entityToDto(a));
        return armiDto;
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ArmiDto getOggettiById(@PathVariable Long id)
    {
        ArmiMapper AM = new ArmiMapper();
        Armi arma =AR.getArmaById(id).get();
        ArmiDto armaDto =AM.entityToDto(arma);
        return armaDto ;
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.POST)
    public void SaveOrUpdate(@RequestBody ArmiDto armaDto) {
        ArmiMapper AM = new ArmiMapper();
        Armi arma = new Armi();
        if (armaDto.getArmiId() != null) {
            arma = AM.dtoUpdateEntity(armaDto);
        } else {
            arma = AM.dtoToEntity(armaDto);
        }
        AR.CreateArma(arma);
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.PUT)
    public void Update(@RequestBody ArmiDto armaDto) {
        ArmiMapper AM = new ArmiMapper();
        Armi arma = new Armi();
        if (armaDto.getArmiId() != null) {
            arma = AM.dtoUpdateEntity(armaDto);
        } else {
            arma = AM.dtoToEntity(armaDto);
        }
        AR.CreateArma(arma);
    }


    @RequestMapping(value="/delete/{id}", method =  RequestMethod.DELETE)
    public void Delete(@PathVariable Long id){
        AR.DeleteArma(id);
    }
}
