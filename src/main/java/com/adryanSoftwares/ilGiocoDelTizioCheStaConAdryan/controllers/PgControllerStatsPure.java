package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsPureService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/stattsPure")
public class PgControllerStatsPure {

    @Autowired
    StattsPureService stattsPureService;

    @PostMapping("/updateStatt")
    public StattsPureEntity update(@RequestBody StattsPureDTO stattsPureDto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return stattsPureService.update(stattsPureDto);
    }

    @GetMapping("/getStattById/{idPg}")
    public StattsPureEntity selectById(@PathVariable("idPg") Integer idPg) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return this.stattsPureService.selectById(idPg);
    }

    @GetMapping("/newStatt")
    public StattsPureEntity create(@RequestBody StattsPureDTO stattsPureDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return this.stattsPureService.create(stattsPureDto);
    }

    @GetMapping("/deleteStattCalc/{idPg}")
    public StattsPureEntity delete(@PathVariable("idStattsCalc") Integer idStattsPure) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {
        return this.stattsPureService.delete(idStattsPure);
    }

}