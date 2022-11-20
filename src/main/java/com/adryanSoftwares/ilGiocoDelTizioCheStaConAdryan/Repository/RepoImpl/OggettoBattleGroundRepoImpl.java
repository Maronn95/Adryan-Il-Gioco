package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONrepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettoBattleGroundRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoBattleGroundEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


@Repository
public class OggettoBattleGroundRepoImpl implements OggettoBattleGroundRepository {
    @Autowired
    JSONcrudRepository JCRUD;

    @Override
    public OggettoBattleGroundEntity selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (OggettoBattleGroundEntity) JCRUD.selectById(idJSONreq);
    }

    @Override
    public OggettoBattleGroundEntity creates(Object entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettoBattleGroundEntity) JCRUD.creates(entity);
    }

    @Override
    public OggettoBattleGroundEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettoBattleGroundEntity) JCRUD.delete(id);
    }

    @Override
    public Object update(Object entity) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return JCRUD.update(entity);
    }

    @Override
    public List findAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return JCRUD.findAll();
    }
}
