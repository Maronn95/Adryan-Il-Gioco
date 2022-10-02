package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.MetodoB1DTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.FightNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.FightNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.FightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fight")
public class FightControllerTest {

    @Autowired
    FightService fightService;

    @RequestMapping(value="/metodoB1", method= RequestMethod.GET)
    public FightNewJSONresp metodoB1(@RequestBody MetodoB1DTO metodoB1DTO) throws Exception {
        return fightService.metodoB1(metodoB1DTO);
    }

    @RequestMapping(value="/prepJsonFight", method= RequestMethod.GET)
    public FightNewJSONresp metodoA(@RequestBody FightNewJSONreq entityRequest) throws Exception {
        return fightService.newFight(entityRequest);
    }


}
