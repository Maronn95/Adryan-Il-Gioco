package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ArmiMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArmiJSONserviceImpl implements ArmiJSONservice {
    final  String JSONtable = "Armi";

    @Autowired
    private ArmiRepository Arep;

    @Override
    public ArmiEntity newArmi(ArmiDto req) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ArmiEntity) Arep.creates(ArmiMapper.dtoToEntity(req));

    }

     @Override
     public ArmiEntity selectArmi(Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
         return (ArmiEntity) Arep.selectById(idArma);
     }

    @Override
    public ArmiEntity update(ArmiDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException {
        ArmiEntity arma= (ArmiEntity) Arep.selectById(dto.getIdArmi());
        return (ArmiEntity) Arep.update(ArmiMapper.dtoUpdateEntity(dto, arma));
    }

    @Override
    public ArmiEntity delete(Integer id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException {
        return (ArmiEntity) Arep.delete(id);
    }

    @Override
    public List<ArmiEntity> getAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return Arep.findAll();
    }

    @Override
    public List<ArmiEntity> selectByLevelAndRarity(Integer valoreRarita, Integer livello) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        List<ArmiEntity> armi = Arep.findAll();
        List<ArmiEntity>armiFiltrate = new ArrayList<>();
        for(ArmiEntity arma : armi ){
            if( arma.getValoreRarita()<= valoreRarita
                    && arma.getLivello() == livello
                    ||arma.getValoreRarita()<= valoreRarita && (arma.getLivello()+1 != 5 && arma.getLivello() == livello+1)
                    ||arma.getValoreRarita()<= valoreRarita && (arma.getLivello()-1 != 0 && arma.getLivello() == livello-1)
            ){
                armiFiltrate.add(arma);
            }
        }
        return armiFiltrate;    }
}
