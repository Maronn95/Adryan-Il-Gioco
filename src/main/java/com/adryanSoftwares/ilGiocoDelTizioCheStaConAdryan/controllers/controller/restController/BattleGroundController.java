package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.restController;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattleGroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.BattleGroundService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping(value="/BattleGround")
public class BattleGroundController {

    @Autowired
    BattleGroundService battleGroundService;

    @GetMapping("/getBattleGround/{id}")
    public BattleGroundDto getBattleground (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {

        BattleGroundDto dto =( BattleGroundMapper.entityToDto(battleGroundService.selectBattleGround(id)));
        return dto;
    }
    @PostMapping("/newBattleGround")
    public BattleGroundDto create (@RequestBody BattleGroundDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        BattleGroundDto newDto =( BattleGroundMapper.entityToDto(battleGroundService.newBattleGround(dto)));
        return newDto;
    }

    @PutMapping("/update")
    public BattleGroundDto update (@RequestBody BattleGroundDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {
        BattleGroundDto newDto = (BattleGroundMapper.entityToDto(battleGroundService.update(dto)));
        return newDto;
    }

    @DeleteMapping("/delete/{id}")
    public BattleGroundDto delete (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException, InterruptedException {

        BattleGroundDto dto =( BattleGroundMapper.entityToDto(battleGroundService.delete(id)));
        return dto;
    }



    }



