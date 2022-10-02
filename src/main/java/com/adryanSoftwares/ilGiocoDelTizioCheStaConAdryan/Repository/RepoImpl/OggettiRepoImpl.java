package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Repository
public class OggettiRepoImpl implements OggettiRepository {

    @Autowired
    JSONcrudRepository JCRUD;
    @Override
    public OggettiEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (OggettiEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public OggettiEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettiEntity) JCRUD.creates(entity);
    }

    @Override
    public OggettiEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettiEntity) JCRUD.delete(id);
    }

    @Override
    public OggettiEntity update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettiEntity) JCRUD.update(entity);
    }

    @Override
    public List findAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return JCRUD.findAll();
    }
}
