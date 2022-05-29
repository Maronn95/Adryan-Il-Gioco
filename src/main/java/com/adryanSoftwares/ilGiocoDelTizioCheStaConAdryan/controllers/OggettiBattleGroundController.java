package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiBattlegroundEntityDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONtests.JSONtest;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettiBattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.OggettoBattlegroundServiceImpl;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/oggetti_battleground")
public class OggettiBattleGroundController {

    @Autowired
    OggettoBattlegroundServiceImpl OBS;

    @Autowired
    JSONtest JT;


    @RequestMapping(value="/JSONprint", method= RequestMethod.GET)
    public JSONObject timeToPrint() throws Exception {
        return JT.loadData();
    }



    //private OggettiBattlegroundMapper OBM = new OggettiBattlegroundMapper();


    //private OggettBattlegroundServiceImpl OBS= new OggettBattlegroundServiceImpl();
    @RequestMapping(value="/Oggetti")
    public List<OggettiBattlegroundEntityDto> GetOggettiBattleground(){
        OggettiBattlegroundMapper OBM = new OggettiBattlegroundMapper();
        List<OggettiBattlegroundEntity>oggetti=OBS.getOggetti();
        List<OggettiBattlegroundEntityDto> oggettiDto =new ArrayList<OggettiBattlegroundEntityDto>();
        for(OggettiBattlegroundEntity obj:oggetti)
           oggettiDto.add( OBM.entityToDto(obj));
        return oggettiDto;
    }
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public OggettiBattlegroundEntityDto getOggettiById(@PathVariable Long id)
    {
        OggettiBattlegroundMapper OBM = new OggettiBattlegroundMapper();
      OggettiBattlegroundEntity oggetto =OBS.getOggettiById(id).get();
      OggettiBattlegroundEntityDto oggettoDto =OBM.entityToDto(oggetto);
        return oggettoDto ;
        }



    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.POST)
    public void SaveOrUpdate(@RequestBody OggettiBattlegroundEntityDto oggettiDto){
        OggettiBattlegroundMapper OBM = new OggettiBattlegroundMapper();
        OggettiBattlegroundEntity oggetto= new OggettiBattlegroundEntity();
        if(oggettiDto.getOggettoBattlegroundId()!=null){
         oggetto  = OBM.dtoUpdateEntity(oggettiDto);
        }
        else{
            oggetto=OBM.dtoToEntity(oggettiDto);
        }
        OBS.CreateOggetto(oggetto);



        /*

        new mapper mapeer
        OggettiBG enitityOBG = mapper.dtotoentity(oggettDto)

        saveorupdate(entityOBG);

         *
        * getById(request int){
        new mapper
        enityt= findById(int)
        dto= mapper.entitytodto(entity)
        return dto
        }
        *
        **/}

    @RequestMapping(value="/SaveOrUpdate", method= RequestMethod.PUT)
    public void Update(@RequestBody OggettiBattlegroundEntityDto oggettiDto) {
        OggettiBattlegroundMapper OBM = new OggettiBattlegroundMapper();
        OggettiBattlegroundEntity oggetto = new OggettiBattlegroundEntity();
        if (oggettiDto.getOggettoBattlegroundId() != null) {
            oggetto = OBM.dtoUpdateEntity(oggettiDto);
        } else {
            oggetto = OBM.dtoToEntity(oggettiDto);
        }
        OBS.CreateOggetto(oggetto);
    }
    @RequestMapping(value="/delete/{id}", method =  RequestMethod.DELETE)
    public void Delete(@PathVariable Long id){
                OBS.DeleteOggetto(id);
            }


}
