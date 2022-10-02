package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pgAzioniOffensive")
public class PgControllerAzioniOffensive {

    /*@Autowired
    private PgAzioniOffensiveJSONService pgaService;

    @RequestMapping(value="/fendenteLeggero/{idPg1}/{idPg2}/{idArma}", method= RequestMethod.GET)
    public List<Integer> fendenteLeggero(@PathVariable("pg1") PgEntity pg1, @PathVariable("idPg2") int idPg2, @PathVariable("idArma") int idArma ) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
       return pgaService.fendenteLeggero(pg1, idArma);

    }

    @RequestMapping(value="/fendentePesante/{idPg1}/{idPg2}/{idArma}", method= RequestMethod.GET)
    public List<Integer> fendentePesante(@PathVariable("pg1")PgEntity pg1, @PathVariable("idPg2") int idPg2, @PathVariable("idArma") int idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return pgaService.fendentePesante(pg1, idArma);
    }*/



}
