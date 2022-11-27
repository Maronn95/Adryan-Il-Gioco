package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.restController;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.BattleGroundService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping(value="/RestBattleGround")
public class BattlegroundRestController {

    @Autowired
    BattleGroundService battleGroundService;

    @GetMapping("/getBattleGround/{id}")
    public BattlegroundDto getBattleground (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {

        BattlegroundDto dto =battleGroundService.selectBattleGround(id);
        return dto;
    }
    @PostMapping("/newBattleGround")
    public BattlegroundDto create (@RequestBody BattlegroundDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        BattlegroundDto newDto =( BattlegroundMapper.entityToDto(battleGroundService.newBattleGround(dto)));
        return newDto;
    }

    @PutMapping("/update")
    public BattlegroundDto update (@RequestBody BattlegroundDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {
        BattlegroundDto newDto = (BattlegroundMapper.entityToDto(battleGroundService.update(dto)));
        return newDto;
    }

    @DeleteMapping("/delete/{id}")
    public BattlegroundDto delete (@PathVariable("id") Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException, InterruptedException {

        BattlegroundDto dto =( BattlegroundMapper.entityToDto(battleGroundService.delete(id)));
        return dto;
    }



    }



