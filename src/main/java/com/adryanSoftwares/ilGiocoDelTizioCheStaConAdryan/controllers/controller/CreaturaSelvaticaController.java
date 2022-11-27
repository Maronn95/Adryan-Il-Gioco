package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.CreaturaSelvaticaNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.CreaturaSelvaticaNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.CreaturaSelvaticaService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/creaturaSelvatica")
public class CreaturaSelvaticaController {

    @Autowired
    CreaturaSelvaticaService creaturaSelvaticaService;

    @RequestMapping(value="/create", method= RequestMethod.GET)
    public CreaturaSelvaticaNewJSONresp createCreaturaSelvatica(@RequestBody CreaturaSelvaticaNewJSONreq creaturaSelvaticaReq) throws Exception {
        return creaturaSelvaticaService.create(creaturaSelvaticaReq);
    }

    @GetMapping("/getCreaturaSelvatica/{idCreaturaSelvatica}")
    public CreaturaSelvaticaNewJSONresp getCreaturaSelvatica (@PathVariable("idCreaturaSelvatica") Integer idCreaturaSelvatica) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return creaturaSelvaticaService.select(idCreaturaSelvatica);
    }

    @DeleteMapping(value="/delete/{idCreaturaSelvatica}")
    public CreaturaSelvaticaNewJSONresp deleteCreaturaSelvatica (@PathVariable("idCreaturaSelvatica") Integer idCreaturaSelvatica) throws Exception {
        return creaturaSelvaticaService.delete(idCreaturaSelvatica);
    }

    @RequestMapping(value="/updatePG")
    public CreaturaSelvaticaNewJSONresp updateCreaturaSelvatica ( @RequestBody CreaturaSelvaticaNewJSONreq creaturaSelvaticaNewJSONreq) throws Exception {
        return creaturaSelvaticaService.update(creaturaSelvaticaNewJSONreq);
    }
}
