package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.StattsPureRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsPureService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class StattsPureServiceImpl implements StattsPureService {

    @Autowired
    StattsPureRepository stattsPureRepository;

    @Override
    public StattsPureEntity create(StattsPureDTO entityRequest) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsPureEntity) stattsPureRepository.creates(entityRequest);
    }

    @Override
    public StattsPureEntity selectById(Integer idStattsPure) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (StattsPureEntity) stattsPureRepository.selectById(idStattsPure);
    }

    @Override
    public StattsPureEntity delete(Integer idStattsPure) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsPureEntity) stattsPureRepository.delete(idStattsPure);
    }

    @Override
    public StattsPureEntity update(StattsPureDTO stattsPureDTO) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsPureEntity) stattsPureRepository.update(stattsPureDTO);
    }

//convertitore ENTITY-->DTO

    private StattsPureDTO convertToDto (StattsPureEntity stattsPureEntity){
        StattsPureDTO stattsPureDTO =new StattsPureDTO();

        stattsPureDTO.setIdStattsPure(stattsPureEntity.getIdStattsPure());

        //stattsPureDTO.setVita(stattsPureEntity.getVita());
        stattsPureDTO.setVitaPura(stattsPureEntity.getVitaPura());
        //stattsPureDTO.setVitaAttuale(stattsPureEntity.getVitaAttuale());

        stattsPureDTO.setCostituzione(stattsPureEntity.getCostituzione());
        stattsPureDTO.setForza(stattsPureEntity.getForza());
        stattsPureDTO.setDestrezza(stattsPureEntity.getDestrezza());
        stattsPureDTO.setSaggezza(stattsPureEntity.getSaggezza());
        stattsPureDTO.setIntelligenza(stattsPureEntity.getIntelligenza());
        stattsPureDTO.setCarisma(stattsPureEntity.getCarisma());

        //stattsPureDTO.setCa(stattsPureEntity.getCa());
        //stattsPureDTO.setUtilizzoArmaX(stattsPureEntity.getUtilizzoArmaX());

        return stattsPureDTO;
    }

    //convertitore DTO-->ENTITY

    private StattsPureEntity convertToEntity (StattsPureDTO stattsPureDTO){
        StattsPureEntity stattsPureEntity = new StattsPureEntity();

        if(stattsPureDTO.getIdStattsPure() != null){
        stattsPureEntity.setIdStattsPure(stattsPureDTO.getIdStattsPure());
        }
        //stattsPureEntity.setVita(stattsPureDTO.getVita());
        stattsPureEntity.setVitaPura(stattsPureDTO.getVitaPura());
        //stattsPureEntity.setVitaAttuale(stattsPureDTO.getVitaAttuale());

        stattsPureEntity.setCostituzione(stattsPureDTO.getCostituzione());
        stattsPureEntity.setForza(stattsPureDTO.getForza());
        stattsPureEntity.setDestrezza(stattsPureDTO.getDestrezza());
        stattsPureEntity.setSaggezza(stattsPureDTO.getSaggezza());
        stattsPureEntity.setIntelligenza(stattsPureDTO.getIntelligenza());
        stattsPureEntity.setCarisma(stattsPureDTO.getCarisma());

        //stattsPureEntity.setCa(stattsPureDTO.getCa());
        //stattsPureEntity.setUtilizzoArmaX(stattsPureDTO.getUtilizzoArmaX());

        return stattsPureEntity;
    }



}
