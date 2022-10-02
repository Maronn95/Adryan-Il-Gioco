package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.InventarioRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.InventarioEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Repository
public class InventarioRepoImpl implements InventarioRepository {

    @Autowired
    JSONcrudRepository JCRUD;

    @Override
    public InventarioEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (InventarioEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public InventarioEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (InventarioEntity) JCRUD.creates( entity);
    }

    @Override
    public InventarioEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (InventarioEntity) JCRUD.delete(id);
    }

    @Override
    public Object update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (InventarioEntity) JCRUD.update( entity);
    }
}
