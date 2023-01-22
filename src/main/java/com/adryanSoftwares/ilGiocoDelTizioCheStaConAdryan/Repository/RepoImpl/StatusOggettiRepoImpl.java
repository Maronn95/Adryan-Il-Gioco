package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.StatusOggettiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StatusOggettiEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Repository
public class StatusOggettiRepoImpl implements StatusOggettiRepository {


    @Autowired
    JSONcrudRepository JCRUD;


    @Override
    public StatusOggettiEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (StatusOggettiEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public StatusOggettiEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StatusOggettiEntity) JCRUD.creates(entity);
    }

    @Override
    public Object delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return JCRUD.delete(id);
    }

    @Override
    public StatusOggettiEntity update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StatusOggettiEntity) JCRUD.update(entity);
    }

    @Override
    public List findAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return null;
    }
}
