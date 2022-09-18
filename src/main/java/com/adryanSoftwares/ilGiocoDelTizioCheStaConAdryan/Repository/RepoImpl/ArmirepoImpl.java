package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Repository
class ArmiRepoImpl<ArmiEntity>  implements ArmiRepository<ArmiEntity> {

    @Autowired
    JSONcrudRepository JCRUD;


    @Override
    public ArmiEntity selectById(Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
      return (ArmiEntity) JCRUD.selectById(id);
    }

    @Override
    public ArmiEntity creates(ArmiEntity entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ArmiEntity) JCRUD.creates(entity);    }

    @Override
    public ArmiEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ArmiEntity) JCRUD.delete(id);
    }

    @Override
    public ArmiEntity update(ArmiEntity entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return null;
    }
}
