package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.StattsPureRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Repository
public class StattsPureRepoImpl implements StattsPureRepository {

    @Autowired
    JSONcrudRepository JCRUD;

    @Override
    public StattsPureEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (StattsPureEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public Object creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return JCRUD.creates(entity);
    }

    @Override
    public StattsPureEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsPureEntity) JCRUD.delete(id);
    }

    @Override
    public Object update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return JCRUD.update(entity);
    }

}