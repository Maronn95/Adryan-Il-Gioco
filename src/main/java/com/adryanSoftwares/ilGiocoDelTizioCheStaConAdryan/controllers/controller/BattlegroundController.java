package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.BattleGroundService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
@RestController
@RequestMapping(value="/Battleground")
public class BattlegroundController {

    @Autowired
    BattleGroundService battleGroundService;


    @GetMapping("/getBattleground/{idBattleground}")
    public BattlegroundDto getBattleground (@PathVariable("idBattleground") Integer idBattleground) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return battleGroundService.selectBattleGround(idBattleground);
    }

    /*@RequestMapping(value="/newBattleground", method= RequestMethod.POST)
    public BattlegroundDto creaBattleground(@RequestBody BattlegroundDto dto) throws Exception {
         return BattlegroundMapper.entityToDto(battleGroundService.newBattleGround(dto));
    }*/

    @RequestMapping(value="/newBattleground", method= RequestMethod.POST)
    public BattlegroundDto creaBattlegroundDinamicamente(@RequestBody String ambientazione, String weather, int base, int altezza) throws Exception {
        return BattlegroundMapper.entityToDto(battleGroundService.newBattleGroundDinamico(ambientazione, weather, base, altezza));
    }

    @DeleteMapping(value="/deleteBattleground/{idBattlegrounbd}")
    public BattlegroundDto deleteBattleground (@PathVariable("idBattleground") Integer idBattleground) throws Exception {
        return BattlegroundMapper.entityToDto(battleGroundService.delete(idBattleground));
    }

    @RequestMapping(value="/updateBattleground", method = RequestMethod.POST)
    public BattlegroundDto updatePG ( @RequestBody BattlegroundDto dto) throws Exception {
        return BattlegroundMapper.entityToDto(battleGroundService.update(dto));
    }
}