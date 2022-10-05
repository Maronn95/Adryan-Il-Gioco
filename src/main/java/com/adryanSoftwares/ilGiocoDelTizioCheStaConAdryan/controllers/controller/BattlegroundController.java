package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattlegroundEntity;
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


    @RequestMapping(value="/newBattleground", method= RequestMethod.POST)
    public void creaBattleground(@RequestBody BattlegroundDto dto) throws Exception {
        BattlegroundEntity entity = battleGroundService.update(dto);
        getBattleground(entity.getIdBattleground());

    }

    @DeleteMapping(value="/deleteBattleground/{idBattlegrounbd}")
    public void deleteBattleground (@PathVariable("idBattleground") Integer idBattleground) throws Exception {
        battleGroundService.delete(idBattleground);
    }

    @RequestMapping(value="/updateBattleground", method = RequestMethod.POST)
    public void updatePG ( @RequestBody BattlegroundDto dto) throws Exception {
         battleGroundService.update(dto);
    }
}
