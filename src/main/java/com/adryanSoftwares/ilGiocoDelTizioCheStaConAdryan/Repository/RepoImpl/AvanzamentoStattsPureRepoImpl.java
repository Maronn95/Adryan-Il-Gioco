package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.AvanzamentoStattsPureRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AvanzamentoStattsPureEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Repository
public class AvanzamentoStattsPureRepoImpl implements AvanzamentoStattsPureRepository {

    @Autowired
    JSONcrudRepository JCRUD;



    @Override
    public AvanzamentoStattsPureEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (AvanzamentoStattsPureEntity) JCRUD.selectById( idJSONreq);
    }

    @Override
    public AvanzamentoStattsPureEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (AvanzamentoStattsPureEntity) JCRUD.creates( entity);
    }

    @Override
    public AvanzamentoStattsPureEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (AvanzamentoStattsPureEntity) JCRUD.delete(id);
    }

    @Override
    public AvanzamentoStattsPureEntity update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (AvanzamentoStattsPureEntity) JCRUD.update( entity);
    }

    @Override
    public List findAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (List) JCRUD.findAll();
    }

}
