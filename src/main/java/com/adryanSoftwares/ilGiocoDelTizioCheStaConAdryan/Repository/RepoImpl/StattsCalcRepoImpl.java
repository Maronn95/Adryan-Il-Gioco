package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.StattsCalcRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Repository
public class StattsCalcRepoImpl implements StattsCalcRepository {

    @Autowired
    JSONcrudRepository JCRUD;

    @Override
    public StattsCalcEntity selectById(Integer idStattsCalc) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (StattsCalcEntity) JCRUD.selectById(idStattsCalc);
    }

    @Override
    public StattsCalcEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsCalcEntity) JCRUD.creates(entity);
    }

    @Override
    public StattsCalcEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsCalcEntity) JCRUD.delete(id);
    }

    @Override
    public Object update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        System.out.println("RepoImpl");
        return JCRUD.update( entity);
    }

}
