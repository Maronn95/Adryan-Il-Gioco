package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoInventarioMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventarioEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettoInventarioService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping(value="/oggetti_inventario")
public class OggettiInventarioController {

   @Autowired
   OggettoInventarioService OIS;


   @GetMapping("/getOggettoInventario/{idOggettoInventario}")
   public OggettoInventarioEntity getPg (@PathVariable("idOggettoInventario") Integer idOggettoInventario) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
      return OIS.getOggettoInventario(idOggettoInventario);
   }


   @RequestMapping(value="/newOggettoInventario", method= RequestMethod.POST)
   public OggettoInventarioEntity creaPGinJSON(@RequestBody OggettoInventarioDto dto) throws Exception {
      OggettoInventarioEntity entity = OIS.createOggettoInventario(dto);
      return entity;

   }

   @DeleteMapping(value="/deleteOggettoInventario/{idOggettoInventario}")
   public void deleteOggettoInventario (@PathVariable("idOggettoInventario") Integer idOggettoInventario) throws Exception {
      OIS.deleteOggettoInventario(idOggettoInventario);
   }

   @RequestMapping(value="/updateOggettoInventario", method = RequestMethod.POST)
   public OggettoInventarioDto updatePG ( @RequestBody OggettoInventarioDto dto) throws Exception {
      return OggettoInventarioMapper.entityToDto( OIS.updateOggettoInventario(dto));
   }

}
