package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PoteriRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PoteriEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Repository
public class PoteriRepoImpl implements PoteriRepository {

    @Autowired
    JSONcrudRepository JCRUD;

    @Override
    public PoteriEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (PoteriEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public PoteriEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (PoteriEntity) JCRUD.creates( entity);
    }

    @Override
    public PoteriEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (PoteriEntity) JCRUD.delete(id);
    }

    @Override
    public Object update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (PoteriEntity) JCRUD.update( entity);
    }
}
