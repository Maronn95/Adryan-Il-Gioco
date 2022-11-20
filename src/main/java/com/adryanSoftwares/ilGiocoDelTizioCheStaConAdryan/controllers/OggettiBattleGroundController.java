package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoBattleGroundDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ArmiMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettiBattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoBattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettoBattleGroundService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.OggettoBattlegroundServiceImpl;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/oggetti_battleground")
public class OggettiBattleGroundController {

    @Autowired
    OggettoBattleGroundService OBS;



    @RequestMapping(value="/Oggetti")
    public List<OggettoBattleGroundDTO> GetOggettiBattleground() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettiBattlegroundMapper OBM = new OggettiBattlegroundMapper();
        List<OggettoBattleGroundEntity>oggetti=OBS.getAll();
        List<OggettoBattleGroundDTO> oggettiDto =new ArrayList<OggettoBattleGroundDTO>();
        for(OggettoBattleGroundEntity obj:oggetti)
           oggettiDto.add( OBM.entityToDto(obj));
        return oggettiDto;
    }
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public OggettoBattleGroundEntity getOggettiById(@PathVariable Integer id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        OggettiBattlegroundMapper OBM = new OggettiBattlegroundMapper();
      OggettoBattleGroundEntity oggetto =OBS.selectOggetto(id);
     // OggettoBattleGroundDTO oggettoDto =OBM.entityToDto(oggetto);
        return oggetto ;
        }



    @RequestMapping(value="/create", method= RequestMethod.POST)
    public OggettoBattleGroundEntity create(@RequestBody OggettoBattleGroundDTO oggettiDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettoBattleGroundEntity oggetto= OBS.newOggetto( oggettiDto);
        return oggetto;    }

    @RequestMapping(value="/update", method= RequestMethod.PUT)
    public OggettoBattleGroundDTO Update(@RequestBody OggettoBattleGroundDTO oggettiDto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettoBattleGroundDTO dto = OggettiBattlegroundMapper.entityToDto(OBS.update(oggettiDto));
        return dto;
    }

    @RequestMapping(value="/delete/{id}", method =  RequestMethod.DELETE)
    public void Delete(@PathVariable Integer id) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
                OBS.delete(id);
            }
    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    public List<OggettoBattleGroundDTO> getAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        List<OggettoBattleGroundEntity> oggetti = new ArrayList<>();
        oggetti = OBS.getAll();
        List<OggettoBattleGroundDTO> oggetti1 = new ArrayList<>();
        for (OggettoBattleGroundEntity oggetto : oggetti) {
            oggetti1.add(OggettiBattlegroundMapper.entityToDto(oggetto));
        }
        return oggetti1;

    }
}
