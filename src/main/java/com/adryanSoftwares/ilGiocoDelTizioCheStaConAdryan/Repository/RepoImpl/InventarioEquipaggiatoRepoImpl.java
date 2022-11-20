package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.InventarioEquipaggiatoRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.InventarioEquipaggiatoEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Repository
public class InventarioEquipaggiatoRepoImpl implements InventarioEquipaggiatoRepository {

    @Autowired
    JSONcrudRepository JCRUD;



    @Override
    public InventarioEquipaggiatoEntity selectById(Integer idJSONreq) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (InventarioEquipaggiatoEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public InventarioEquipaggiatoEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (InventarioEquipaggiatoEntity) JCRUD.creates( entity);
    }

    @Override
    public InventarioEquipaggiatoEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (InventarioEquipaggiatoEntity) JCRUD.delete(id);
    }

    @Override
    public InventarioEquipaggiatoEntity update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (InventarioEquipaggiatoEntity) JCRUD.update( entity);
    }

    @Override
    public List findAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (List) JCRUD.findAll();
    }
}
