package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ArmiMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.ArmiServiceImpl;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/Armi")
public class ArmiController {

    @Autowired
    ArmiServiceImpl armiServiceImpl;

    @Autowired
    ArmiJSONservice armiJSON;



    @RequestMapping(value ="/newArma", method= RequestMethod.GET)
    public ArmiDto newArma (@RequestBody ArmiDto armaDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        System.out.println("orcoddio");
        ArmiDto dto= ArmiMapper.entityToDto(armiJSON.newArmi( armaDto));
        return dto;
    }

    @GetMapping("/getArma/{idArma}")
    public ArmiEntity getPg (@PathVariable("idArma") Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return armiJSON.selectArmi(idArma);
    }

    @PutMapping("/update")
    public ArmiDto update (@RequestBody ArmiDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InterruptedException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ArmiDto arma = ArmiMapper.entityToDto(armiJSON.update(dto));
        return arma;
    }
    @RequestMapping(value="/delete/{id}", method =  RequestMethod.DELETE)
    public void Delete(@PathVariable Integer id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InterruptedException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        armiJSON.delete(id);
    }

    @GetMapping("/byLevelAndRarity/{rarita}/{livello}")
    public List<ArmiDto> selectByLevelAndRarity(@PathVariable("rarita") Integer rarita, @PathVariable("livello")Integer livello) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        List<ArmiDto> armiFiltrate = new ArrayList<>();
        List<ArmiEntity> armi = armiJSON.selectByLevelAndRarity(rarita,livello);
        for(ArmiEntity arma : armi){
            armiFiltrate.add((ArmiMapper.entityToDto(arma)));
        }
        return armiFiltrate;
    }
    @GetMapping("/getArmi")
    public List<ArmiDto> getAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
       List<ArmiEntity> armi = new ArrayList<>();
       armi= armiJSON.getAll();
       List<ArmiDto> armi1 = new ArrayList<>();
       for(ArmiEntity arma : armi){
           armi1.add(ArmiMapper.entityToDto(arma));
       }
        return armi1;

    }
}
