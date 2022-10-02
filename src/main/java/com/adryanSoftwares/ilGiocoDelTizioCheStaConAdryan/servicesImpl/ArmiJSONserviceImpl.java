package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class ArmiJSONserviceImpl implements ArmiJSONservice {

    @Autowired
    private ArmiRepository armiRepository;

    @Override
    public ArmiEntity newArmi(ArmiNewJSONreq req) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ArmiEntity) armiRepository.creates(req);

    }

     @Override
     public ArmiEntity selectArmi(Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
         return (ArmiEntity) armiRepository.selectById(idArma);
     }

}
