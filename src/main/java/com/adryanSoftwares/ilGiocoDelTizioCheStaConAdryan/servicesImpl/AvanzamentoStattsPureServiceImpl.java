package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.AvanzamentoStattsPureMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.AvanzamentoStattsPureRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.AvanzamentoStattsPureNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AvanzamentoStattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.AvanzamentoStattsPureNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.AvanzamentoStattsPureService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class AvanzamentoStattsPureServiceImpl implements AvanzamentoStattsPureService {

    @Autowired
    AvanzamentoStattsPureRepository avanzamentoStattsPureRepository;

    @Override
    public AvanzamentoStattsPureNewJSONresp newAvanzamentoStattsPure(AvanzamentoStattsPureNewJSONreq entityRequest) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        AvanzamentoStattsPureEntity entity = AvanzamentoStattsPureMapper.reqToEntity(entityRequest);
        AvanzamentoStattsPureEntity newEntity = (AvanzamentoStattsPureEntity) avanzamentoStattsPureRepository.creates(entity);
        AvanzamentoStattsPureNewJSONresp newResp = AvanzamentoStattsPureMapper.entityToResp(newEntity);
        return newResp;
    }

    @Override
    public AvanzamentoStattsPureNewJSONresp selectAvanzamentoStattsPure(Integer idAvanzamentoStattsPure) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {

        AvanzamentoStattsPureEntity entity = (AvanzamentoStattsPureEntity) avanzamentoStattsPureRepository.selectById(idAvanzamentoStattsPure);
        AvanzamentoStattsPureNewJSONresp newResp = AvanzamentoStattsPureMapper.entityToResp(entity);
        return newResp;
    }

    @Override
    public AvanzamentoStattsPureNewJSONresp deleteAvanzamentoStattsPure(Integer idAvanzamentoStattsPure) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        AvanzamentoStattsPureEntity entity = (AvanzamentoStattsPureEntity) avanzamentoStattsPureRepository.delete(idAvanzamentoStattsPure);
        AvanzamentoStattsPureNewJSONresp newResp = AvanzamentoStattsPureMapper.entityToResp(entity);
        return newResp;
    }

    @Override
    public AvanzamentoStattsPureNewJSONresp updateAvanzamentoStattsPure(AvanzamentoStattsPureNewJSONreq avanzamentoStattsPureJSON) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        AvanzamentoStattsPureEntity entity = (AvanzamentoStattsPureEntity) avanzamentoStattsPureRepository.update(avanzamentoStattsPureJSON);
        AvanzamentoStattsPureNewJSONresp newResp =AvanzamentoStattsPureMapper.entityToResp(entity);
        return newResp;
    }

}
