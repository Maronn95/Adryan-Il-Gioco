package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ProtezioniIndossabiliNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ProtezioniIndossabiliNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ProtezioniIndossabiliDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ProtezioniIndossabiliMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabili;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ProtezioniIndossabiliJSONservice;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.ProtezioniIndossabiliServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/protezioni")
public class ProtezioniIndossabiliController {

    @Autowired
    ProtezioniIndossabiliServiceImpl PIS;

    @Autowired
    ProtezioniIndossabiliJSONservice ProtezioniJSON;

    @RequestMapping(value="/protezioni")
    public List<ProtezioniIndossabiliDto> getProtezioni(){
        ProtezioniIndossabiliMapper PIM = new ProtezioniIndossabiliMapper();
        List<ProtezioniIndossabili> protezioni=PIS.getProtezioni();
        List<ProtezioniIndossabiliDto> protezioniDto =new ArrayList<ProtezioniIndossabiliDto>();
        for(ProtezioniIndossabili a:protezioni)
            protezioniDto.add( PIM.entityToDto(a));
        return protezioniDto;
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ProtezioniIndossabiliDto getProtezioneById(@PathVariable Long id)
    {
        ProtezioniIndossabiliMapper PIM = new ProtezioniIndossabiliMapper();
        ProtezioniIndossabili a =PIS.getProtezioneById(id).get();
        ProtezioniIndossabiliDto protezioneDto =PIM.entityToDto(a);
        return protezioneDto ;
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.POST)
    public void SaveOrUpdate(@RequestBody ProtezioniIndossabiliDto protezioneDto) {
        ProtezioniIndossabiliMapper PIM = new ProtezioniIndossabiliMapper();
        ProtezioniIndossabili a = new ProtezioniIndossabili();
        if (protezioneDto.getProtezioniIndossabiliId() != null) {
            a = PIM.dtoUpdateEntity(protezioneDto);
        } else {
            a = PIM.dtoToEntity(protezioneDto);
        }
        PIS.CreateProtezione(a);
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.PUT)
    public void Update(@RequestBody ProtezioniIndossabiliDto protezioneDto) {
        ProtezioniIndossabiliMapper PIM = new ProtezioniIndossabiliMapper();
        ProtezioniIndossabili a = new ProtezioniIndossabili();
        if (protezioneDto.getProtezioniIndossabiliId() != null) {
            a = PIM.dtoUpdateEntity(protezioneDto);
        } else {
            a = PIM.dtoToEntity(protezioneDto);
        }
        PIS.CreateProtezione(a);
    }


    @RequestMapping(value="/delete/{id}", method =  RequestMethod.DELETE)
    public void Delete(@PathVariable Long id){
        PIS.DeleteProtezione(id);
    }


    @RequestMapping(value ="/newProtezioniIndossabili", method= RequestMethod.GET)
    public ProtezioniIndossabiliNewJSONresp newProtezioneIndossabile (@RequestBody ProtezioniIndossabiliNewJSONreq ProtezioneDto) throws IOException, ParseException, org.json.simple.parser.ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return ProtezioniJSON.newProtezioneIndossabile( ProtezioneDto);
    }
}

