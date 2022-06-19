package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiBattlegroundEntityDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettiBattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettiInventarioMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabili;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.ArmiServiceImpl;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.OggettoInventarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/oggetti_inventario")
public class OggettiInventarioController {

   @Autowired
   OggettoInventarioServiceImpl OIS;
   @Autowired
   ArmiServiceImpl ASI;

    @RequestMapping(value="/oggetti")
    public List<OggettiInventarioDto>GetOggettiBattleground(){
        OggettiInventarioMapper OIM = new OggettiInventarioMapper();
        List<OggettoInventario> oggetti=OIS.getOggetti();
        List<OggettiInventarioDto> oggettiDto =new ArrayList<OggettiInventarioDto>();
        for(OggettoInventario obj:oggetti)
            oggettiDto.add( OIM.entityToDto(obj));
        return oggettiDto;
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public OggettiInventarioDto getOggettiById(@PathVariable Long id)
    {
        OggettiInventarioMapper OIM = new OggettiInventarioMapper();
        OggettoInventario oggetto =OIS.getOggettiById(id).get();
        OggettiInventarioDto oggettoDto =OIM.entityToDto(oggetto);
        return oggettoDto ;
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.POST)
    public void SaveOrUpdate(@RequestBody OggettiInventarioDto oggettiDto) {
        OggettiInventarioMapper OIM = new OggettiInventarioMapper();
        OggettoInventario oggetto = new OggettoInventario();
        Armi arma = new Armi();
        if (oggettiDto.getOggettoInventarioId() != null) {
            oggetto = OIM.dtoUpdateEntity(oggettiDto);
        } else {
            if(oggettiDto.getArmaId()!=null) {

                arma = ASI.getArmaById(oggettiDto.getArmaId()).get();
            }
            oggetto = OIM.dtoToEntity(oggettiDto);
        }
        OIS.CreateOggetto(oggetto);
    }

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.PUT)
    public void Update(@RequestBody OggettiInventarioDto oggettiDto) {
        OggettiInventarioMapper OIM = new OggettiInventarioMapper();
        OggettoInventario oggetto = new OggettoInventario();
        if (oggettiDto.getOggettoInventarioId() != null) {

            oggetto = OIM.dtoUpdateEntity(oggettiDto);
        } else {

            oggetto = OIM.dtoToEntity(oggettiDto);

        }
        OIS.CreateOggetto(oggetto);
    }


    @RequestMapping(value="/delete/{id}", method =  RequestMethod.DELETE)
    public void Delete(@PathVariable Long id){
        OIS.DeleteOggetto(id);
    }
}
