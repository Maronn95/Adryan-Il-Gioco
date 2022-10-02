package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class PgJSONServiceImpl implements PgJSONservice {

    @Autowired
    PGRepository PpgRepository;

    private PgEntity reqDtoToEntity(PgNewJSONreq entityRequest) {
        PgEntity entity = new PgEntity();
        entity.setName(entityRequest.getName());
        entity.setStattsPureEntity(entityRequest.getStattsPure());
        entity.setRazzaEntity(entityRequest.getRazza());
        entity.setStattsCalcEntity(entityRequest.getStattsCalc());
        entity.setPoteriEntity(entityRequest.getPoteri());
        entity.setInventarioEntity(entityRequest.getInventario());
        entity.setSkillsEntity(entityRequest.getSkills());
        entity.setPoteriEntity(entityRequest.getPoteri());
        entity.setMagieEntity(entityRequest.getMagie());
        return entity;
    }

    @Override
    public PgNewJSONresp newPg(PgNewJSONreq entityRequest) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        PgEntity entity = reqDtoToEntity(entityRequest);
        PgEntity newEntity = (PgEntity) PpgRepository.creates(entity);
        PgNewJSONresp newResp = new PgNewJSONresp(newEntity);

        return newResp;
    }

    @Override
    public PgNewJSONresp selectPg(Integer idPg) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        PgEntity pgEntity = (PgEntity) PpgRepository.selectById(idPg);
        PgNewJSONresp newResp = new PgNewJSONresp(pgEntity);
        return newResp;
    }
    @Override
    public PgEntity selectPgentette( Integer idPg) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        PgEntity pgEntity = (PgEntity) PGrep.selectById(idPg);
        return pgEntity;
    }

    @Override
    public PgNewJSONresp delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        PgEntity entity = (PgEntity) PpgRepository.delete(id);
        PgNewJSONresp newResp = new PgNewJSONresp(entity);
        return newResp;
    }

    @Override
    public PgNewJSONresp update(PgNewJSONreq pgJSON) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return new PgNewJSONresp((PgEntity) PpgRepository.update(pgJSON));
    }
}
