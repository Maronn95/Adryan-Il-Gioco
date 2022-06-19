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
    PGRepository PGrep;

    private PgEntity reqDtoToEntity (PgNewJSONreq entityRequest){
        PgEntity entity = new PgEntity();
        entity.setName(entityRequest.getName());
        entity.setStattsPure(entityRequest.getStattsPure());
        entity.setRazza(entityRequest.getRazza());
        return entity;
    }

    @Override
    public PgNewJSONresp newPg(PgNewJSONreq entityRequest) throws IOException, ParseException {

        PgEntity entity = reqDtoToEntity(entityRequest);
        PgEntity newEntity= (PgEntity) PGrep.creates(entity);
        PgNewJSONresp newResp = new PgNewJSONresp(newEntity);

        return newResp;
    }

    @Override
    public PgNewJSONresp selectPg( Integer idPg) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        PgEntity pgEntity = (PgEntity) PGrep.selectById(idPg);
        PgNewJSONresp newResp = new PgNewJSONresp(pgEntity);
        return newResp;
    }
}
