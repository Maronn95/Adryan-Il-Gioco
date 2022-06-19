package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONtoken;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Repository
public class PGrepoImpl implements PGRepository {

    @Autowired
    JSONcrudRepository JCRUD;

    JSONtoken jTok;

    public PGrepoImpl() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        PgEntity entity = new PgEntity();
        this.jTok = new JSONcrudRepository().newToken(entity);
    }


    @Override
    public  PgEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return (PgEntity) JCRUD.selectById(jTok, idJSONreq);
    }


    @Override
    public PgEntity creates(Object entity) throws IOException, ParseException {
        return (PgEntity) JCRUD.creates(jTok, entity);
    }


    /*@Override
    public PgEntity creates(PgEntity entity) throws IOException, ParseException {
        return (PgEntity) JCRUD.creates(entity);
    }*/
}
