package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.CreaturaSelvaticaRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.CreaturaSelvaticaEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Repository
public class CreaturaSelvaticaRepoImpl implements CreaturaSelvaticaRepository {

    @Autowired
    JSONcrudRepository JCRUD;

    @Override
    public CreaturaSelvaticaEntity selectById(Integer idJSONreq) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (CreaturaSelvaticaEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public CreaturaSelvaticaEntity creates(Object JsonReq) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (CreaturaSelvaticaEntity) JCRUD.creates(JsonReq);
    }

    @Override
    public CreaturaSelvaticaEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (CreaturaSelvaticaEntity) JCRUD.delete(id);
    }

    @Override
    public CreaturaSelvaticaEntity update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (CreaturaSelvaticaEntity) JCRUD.update(entity);
    }

    @Override
    public List findAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (List) JCRUD.findAll();
    }
}
