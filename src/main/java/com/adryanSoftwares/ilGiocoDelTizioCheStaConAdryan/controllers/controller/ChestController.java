package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ChestDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ChestMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ChestService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/chest")
public class ChestController {

    @Autowired
    private ChestService chestService;

    @GetMapping("/getChest/{id}")
    public ChestDTO getChest (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {

        ChestDTO dto =(ChestMapper.entityToDto(chestService.selectChest(id)));
        return dto;
    }

    @PostMapping("/newChest")
    public ChestDTO create (@RequestBody ChestDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        ChestDTO newDto =( ChestMapper.entityToDto(chestService.newChest(dto)));
        return newDto;
    }
    @PutMapping("/update")
    public ChestDTO update (@RequestBody ChestDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {
        ChestDTO newDto = (ChestMapper.entityToDto(chestService.update(dto)));
        return newDto;
    }
    @DeleteMapping("/delete/{id}")
    public ChestDTO delete (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException, InterruptedException {

        ChestDTO dto =( ChestMapper.entityToDto(chestService.delete(id)));
        return dto;
    }
    @GetMapping("/loot/{id}")
    public ChestDTO generatingLoot (@PathVariable("id")Integer id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ChestDTO dto= (ChestMapper.entityToDto(chestService.selectChest(id)));
        dto.setLoot(chestService.generatingLoot(dto.getDimensione(),dto.getValoreRarita(),dto.getLivello()));
        return dto;
    }
}
