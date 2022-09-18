package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.BattleGroundService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
@RestController
@RequestMapping(value="/Battleground")
public class BattlegroundController {
    @Autowired
    BattleGroundService BGS;


    @GetMapping("/getBattleground/{idBattleground}")
    public Optional<BattlegroundDto> getBattleground (@PathVariable("idBattleground") Long idBattleground) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return BGS.findBGById(idBattleground);
    }


    @RequestMapping(value="/newBattleground", method= RequestMethod.POST)
    public void creaBattleground(@RequestBody BattlegroundDto dto) throws Exception {
        BattlegroundDto entity = BGS.saveOrUpdatePostman(dto);
        getBattleground(entity.getIdBattleground());

    }

    @DeleteMapping(value="/deleteBattleground/{idBattlegrounbd}")
    public void deleteBattleground (@PathVariable("idBattleground") Long idBattleground) throws Exception {
        BGS.deleteBG(idBattleground);
    }

    @RequestMapping(value="/updateBattleground", method = RequestMethod.POST)
    public void updatePG ( @RequestBody BattlegroundDto dto) throws Exception {
         BGS.saveOrUpdatePostman(dto);
    }
}
