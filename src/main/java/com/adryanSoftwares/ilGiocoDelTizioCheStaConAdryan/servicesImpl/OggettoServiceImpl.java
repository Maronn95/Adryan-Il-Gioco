package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettiService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class OggettoServiceImpl implements OggettiService {
@Autowired
private OggettiRepository oggettiRepository;

    @Override
    public OggettiEntity newOggetto(OggettiDTO oggetto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettiEntity) oggettiRepository.creates(com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper.DtoNewEntity(oggetto));
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
        return (OggettiEntity) oggettiRepository.update(com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper.DtoNewEntity(dto));
    }


    }

