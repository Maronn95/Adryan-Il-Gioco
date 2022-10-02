package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
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


    @Override
    public  PgEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (PgEntity) JCRUD.selectById( idJSONreq);
    }


    @Override
    public PgEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (PgEntity) JCRUD.creates( entity);
    }

    @Override
    public PgEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (PgEntity) JCRUD.delete(id);
    }

    @Override
    public PgEntity update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (PgEntity) JCRUD.update( entity);
    }

}
