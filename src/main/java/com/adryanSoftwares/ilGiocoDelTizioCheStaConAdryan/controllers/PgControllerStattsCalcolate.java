package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsCalcDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsCalcService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/stattsCalcolate")
public class PgControllerStattsCalcolate {

    @Autowired
    StattsCalcService stattsCalcService;

    @PostMapping("/updateStatt")
    public StattsCalcEntity updateStatt(@RequestBody StattsCalcDto stattsCalcDto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return stattsCalcService.updateStatt(stattsCalcDto);
    }

    @GetMapping("/getStattById/{idPg}")
    public StattsCalcEntity getStattById(@PathVariable("idPg") Integer idPg) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return this.stattsCalcService.selectById(idPg);
    }

    @GetMapping("/newStatt")
    public StattsCalcEntity newStatt(@RequestBody StattsCalcDto stattsCalcDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return this.stattsCalcService.newStattCalc(stattsCalcDto);
    }

    @GetMapping("/deleteStattCalc/{idPg}")
    public StattsCalcEntity deleteStattCalc(@PathVariable("idStattsCalc") Integer idStattsCalc) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {
        return this.stattsCalcService.deleteStattCalc(idStattsCalc);
    }


}
