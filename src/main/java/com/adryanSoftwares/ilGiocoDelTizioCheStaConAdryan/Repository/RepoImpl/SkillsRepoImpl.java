package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.SkillsRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.SkillsEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Repository
public class SkillsRepoImpl implements SkillsRepository {

    @Autowired
    JSONcrudRepository JCRUD;

    @Override
    public SkillsEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (SkillsEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public SkillsEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (SkillsEntity) JCRUD.creates( entity);
    }

    @Override
    public SkillsEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (SkillsEntity) JCRUD.delete(id);
    }

    @Override
    public Object update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (SkillsEntity) JCRUD.update( entity);
    }
}
