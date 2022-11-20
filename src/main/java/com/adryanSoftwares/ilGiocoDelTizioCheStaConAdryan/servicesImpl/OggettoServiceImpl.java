package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Service
public class OggettoServiceImpl implements OggettiService {
@Autowired
private OggettiRepository oggettiRepository;

    @Override
    public OggettiEntity newOggetto(OggettiDTO oggetto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettiEntity) oggettiRepository.creates(OggettoMapper.DtoNewEntity(oggetto));
    }

    @Override
    public OggettiEntity selectOggetto(Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (OggettiEntity) oggettiRepository.selectById(id);
    }

    @Override
    public OggettiEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettiEntity) oggettiRepository.delete(id);
    }

    @Override
    public OggettiEntity update(OggettiDTO dto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettiEntity oggetto = (OggettiEntity) oggettiRepository.selectById(dto.getIdOggetti());
        return (OggettiEntity) oggettiRepository.update(OggettoMapper.dtoUpdateEntity(dto,oggetto));
    }

    @Override
    public List<OggettiEntity> getAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return oggettiRepository.findAll();
    }

    @Override
    public List<OggettiEntity> selectByLevelAndRarity(Integer valoreRarita, Integer livello) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        List<OggettiEntity> oggetti = oggettiRepository.findAll();
        List<OggettiEntity>oggettiFiltrati = new ArrayList<>();
        for(OggettiEntity oggetto : oggetti ){
            if( oggetto.getValoreRarita()<= valoreRarita
                && oggetto.getLivello() == livello
                ||oggetto.getValoreRarita()<= valoreRarita && (oggetto.getLivello()+1 != 5 && oggetto.getLivello() == livello+1)
                ||oggetto.getValoreRarita()<= valoreRarita && (oggetto.getLivello()-1 != 0 && oggetto.getLivello() == livello-1)
            ){
                oggettiFiltrati.add(oggetto);
            }
        }
        return oggettiFiltrati;
    }


}

