package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ProtezioniIndossabiliNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ProtezioniIndossabiliNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ProtezioniIndossabiliDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ProtezioniIndossabiliMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabiliEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ProtezioniIndossabiliJSONservice;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ProtezioniIndossabiliService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.ProtezioniIndossabiliServiceImpl;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/protezioni")
public class ProtezioniIndossabiliController {



    @Autowired
    ProtezioniIndossabiliService protezioniIndossabiliService;

    @GetMapping("/getProtezione/{id}")
    public ProtezioniIndossabiliDTO getProtezione (@PathVariable("id") Integer id) throws IOException, org.json.simple.parser.ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {

        ProtezioniIndossabiliDTO dto =(ProtezioniIndossabiliMapper.entityToDto(protezioniIndossabiliService.selectProtezione(id)));
        return dto;
    }

    @PostMapping("/newProtezione")
    public ProtezioniIndossabiliDTO create (@RequestBody ProtezioniIndossabiliDTO dto) throws IOException, org.json.simple.parser.ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        ProtezioniIndossabiliDTO newDto =( ProtezioniIndossabiliMapper.entityToDto(protezioniIndossabiliService.newProtezione(dto)));
        return newDto;
    }
    @PutMapping("/update")
    public ProtezioniIndossabiliDTO update (@RequestBody ProtezioniIndossabiliDTO dto) throws IOException, org.json.simple.parser.ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {
        ProtezioniIndossabiliDTO newDto = (ProtezioniIndossabiliMapper.entityToDto(protezioniIndossabiliService.update(dto)));
        return newDto;
    }
    @DeleteMapping("/delete/{id}")
    public ProtezioniIndossabiliDTO delete (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException, InterruptedException {

        ProtezioniIndossabiliDTO dto =( ProtezioniIndossabiliMapper.entityToDto(protezioniIndossabiliService.delete(id)));
        return dto;
    }

}

