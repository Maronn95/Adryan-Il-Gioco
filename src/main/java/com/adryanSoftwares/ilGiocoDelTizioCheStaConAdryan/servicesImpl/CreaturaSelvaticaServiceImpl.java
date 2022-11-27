package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.CreatureSelvaticheMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.CreaturaSelvaticaRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.CreaturaSelvaticaNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.CreaturaSelvaticaEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.CreaturaSelvaticaNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.CreaturaSelvaticaService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class CreaturaSelvaticaServiceImpl implements CreaturaSelvaticaService {

    @Autowired
    CreaturaSelvaticaRepository creaturaSelvaticaRepository;

    @Override
    public CreaturaSelvaticaNewJSONresp create(CreaturaSelvaticaNewJSONreq creaturaSelvaticaReq) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return CreatureSelvaticheMapper.entityToResp((CreaturaSelvaticaEntity) creaturaSelvaticaRepository.creates(creaturaSelvaticaReq));
    }

    @Override
    public CreaturaSelvaticaNewJSONresp select(Integer idCreaturaSelvatica) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (CreaturaSelvaticaNewJSONresp) creaturaSelvaticaRepository.selectById(idCreaturaSelvatica);
    }

    @Override
    public CreaturaSelvaticaNewJSONresp delete(Integer idCreaturaSelvatica) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (CreaturaSelvaticaNewJSONresp) creaturaSelvaticaRepository.delete(idCreaturaSelvatica);
    }

    @Override
    public CreaturaSelvaticaNewJSONresp update(CreaturaSelvaticaNewJSONreq creaturaSelvaticaNewJSONreq) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (CreaturaSelvaticaNewJSONresp) creaturaSelvaticaRepository.update(creaturaSelvaticaNewJSONreq);
    }
}
