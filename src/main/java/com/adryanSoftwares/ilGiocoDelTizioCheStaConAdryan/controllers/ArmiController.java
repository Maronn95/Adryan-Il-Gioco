package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ArmiMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping(value="/armi")
public class ArmiController {

    @Autowired
    ArmiJSONservice armiJSON;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ArmiDto getOggettiById(@PathVariable Integer id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ArmiMapper AM = new ArmiMapper();
        ArmiEntity arma =armiJSON.selectArmi(id);
        ArmiDto armaDto =AM.entityToDto(arma);
        return armaDto ;
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.POST)
    public void SaveOrUpdate(@RequestBody ArmiDto armaDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        armiJSON.newArmi(ArmiMapper.dtoToReq(armaDto));
    }

    @RequestMapping(value ="/newArma", method= RequestMethod.GET)
    public ArmiEntity newArma (@RequestBody ArmiNewJSONreq armaDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        System.out.println("orcoddio");
        return armiJSON.newArmi( armaDto);
    }

    @GetMapping("/getArma/{idArma}")
    public ArmiEntity getArma (@PathVariable("idArma") Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return armiJSON.selectArmi(idArma);
    }
}
