package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oggetti")
public class OggettoController {

    @Autowired
    OggettiService oggettiService;

    @GetMapping("/getOggetto/{id}")
    public OggettiDTO getOggetto (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {

        OggettiDTO dto =(OggettoMapper.entityToDto(oggettiService.selectOggetto(id)));
        return dto;
    }

    @PostMapping("/newOggetto")
    public OggettiDTO create (@RequestBody OggettiDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettiDTO newDto =( OggettoMapper.entityToDto(oggettiService.newOggetto(dto)));
        return newDto;
    }
    @PutMapping("/update")
    public OggettiDTO update (@RequestBody OggettiDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {
        OggettiDTO newDto = (OggettoMapper.entityToDto(oggettiService.update(dto)));
        return newDto;
    }
    @DeleteMapping("/delete/{id}")
    public OggettiDTO delete (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException, InterruptedException {

        OggettiDTO dto =( OggettoMapper.entityToDto(oggettiService.delete(id)));
        return dto;
    }
    @GetMapping("/byLevelAndRarity/{rarita}/{livello}")
    public List<OggettiDTO> selectByLevelAndRarity(@PathVariable("rarita") Integer rarita, @PathVariable("livello")Integer livello) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
    List<OggettiDTO> oggettiFiltrati = new ArrayList<>();
    List<OggettiEntity> oggetti = oggettiService.selectByLevelAndRarity(rarita,livello);
    for(OggettiEntity oggettiEntity : oggetti){
        oggettiFiltrati.add((OggettoMapper.entityToDto(oggettiEntity)));
    }
    return oggettiFiltrati;
    }

}
