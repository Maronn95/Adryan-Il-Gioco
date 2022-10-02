package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ArmiMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.DaProofService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.ArmiServiceImpl;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/armi")
public class ArmiController {

   // @Autowired
   // ArmiRepository armiServiceImpl;

   // @Autowired
  //  ArmiJSONservice armiJSON;

    @Autowired
    DaProofService proovingService;


    @RequestMapping (value ="/proofMe", method = RequestMethod.GET)
    public PgNewJSONresp guessWhat (@RequestBody ArmiNewJSONreq prooveMe) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        PgEntity livingProof = proovingService.gedDaProof(prooveMe);
        PgNewJSONresp proof = new PgNewJSONresp(livingProof);

        return proof;
    }
/*
    @RequestMapping(value="/armi")
    public List<ArmiDto> GetArmi(){
        ArmiMapper AM = new ArmiMapper();
        List<ArmiEntity> armi=armiServiceImpl.getArmi();
        List<ArmiDto> armiDto =new ArrayList<ArmiDto>();
        for(ArmiEntity a:armi)
            armiDto.add( AM.entityToDto(a));
        return armiDto;
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ArmiDto getOggettiById(@PathVariable Integer id)
    {
        ArmiMapper AM = new ArmiMapper();
        ArmiEntity arma =armiServiceImpl.getArmaById(id).get();
        ArmiDto armaDto =AM.entityToDto(arma);
        return armaDto ;
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.POST)
    public void SaveOrUpdate(@RequestBody ArmiDto armaDto) {
        ArmiMapper AM = new ArmiMapper();
        ArmiEntity arma = new ArmiEntity();
        if (armaDto.getArmiId() != null) {
            arma = AM.dtoUpdateEntity(armaDto);
        } else {
            arma = AM.dtoToEntity(armaDto);
        }
        armiServiceImpl.CreateArma(arma);
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.PUT)
    public void Update(@RequestBody ArmiDto armaDto) {
        ArmiMapper AM = new ArmiMapper();
        ArmiEntity arma = new ArmiEntity();
        if (armaDto.getArmiId() != null) {
            arma = AM.dtoUpdateEntity(armaDto);
        } else {
            arma = AM.dtoToEntity(armaDto);
        }
        armiServiceImpl.CreateArma(arma);
    }

    @RequestMapping(value ="/newArma", method= RequestMethod.GET)
    public ArmiNewJSONresp newArma (@RequestBody ArmiNewJSONreq armaDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        System.out.println("orcoddio");
        return armiJSON.newArmi( armaDto);
    }

    @GetMapping("/getArma/{idArma}")
    public ArmiNewJSONresp getPg (@PathVariable("idArma") Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return armiJSON.selectArmi(idArma);
    }

    @RequestMapping(value="/delete/{id}", method =  RequestMethod.DELETE)
    public void Delete(@PathVariable Long id){
        armiServiceImpl.DeleteArma(id);
    }

 */
}
