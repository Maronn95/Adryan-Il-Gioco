package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsCalcDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.StattsCalcMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.StattsCalcRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsCalcService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class StattsCalcServiceImpl implements StattsCalcService {

    @Autowired
    StattsCalcRepository stattsCalcRepository;

    @Override
    public StattsCalcEntity updateStatt(StattsCalcDto stattsCalcDto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsCalcEntity) stattsCalcRepository.update(stattsCalcDto);
    }

    @Override
    public StattsCalcEntity selectById(Integer idStattsCalc) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return (StattsCalcEntity) stattsCalcRepository.selectById(idStattsCalc);
    }

    @Override
    public StattsCalcEntity deleteStattCalc(Integer idStattsCalc) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsCalcEntity) stattsCalcRepository.delete(idStattsCalc);
    }

    @Override
    public StattsCalcEntity newStattCalc(StattsCalcDto stattsCalcDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (StattsCalcEntity) stattsCalcRepository.creates(StattsCalcMapper.dtoToEntity(stattsCalcDto));
    }

    public StattsPureDTO convertToDto (StattsPureEntity stattsPureEntity){
        StattsPureDTO stattsPureDTO =new StattsPureDTO();

        stattsPureDTO.setIdStattsPure(stattsPureEntity.getIdStattsPure());

        /*stattsPureDTO.setVita(stattsPureEntity.getVita());
        stattsPureDTO.setVitaMax(stattsPureEntity.getVitaMax());
        stattsPureDTO.setVitaAttuale(stattsPureEntity.getVitaAttuale());*/

        stattsPureDTO.setCostituzione(stattsPureEntity.getCostituzione());
        stattsPureDTO.setForza(stattsPureEntity.getForza());
        stattsPureDTO.setDestrezza(stattsPureEntity.getDestrezza());
        stattsPureDTO.setSaggezza(stattsPureEntity.getSaggezza());
        stattsPureDTO.setIntelligenza(stattsPureEntity.getIntelligenza());
        stattsPureDTO.setCarisma(stattsPureEntity.getCarisma());

        /*stattsPureDTO.setCa(stattsPureEntity.getCa());

        stattsPureDTO.setUtilizzoArmaX(stattsPureEntity.getUtilizzoArmaX());*/

        return stattsPureDTO;
    }

    //convertitore DTO-->ENTITY

    public StattsPureEntity convertToEntity (StattsPureDTO stattsPureDTO){
        StattsPureEntity stattsPureEntity = new StattsPureEntity();

        stattsPureEntity.setIdStattsPure(stattsPureDTO.getIdStattsPure());

        /*stattsPureEntity.setVita(stattsPureDTO.getVita());
        stattsPureEntity.setVitaMax(stattsPureDTO.getVitaMax());
        stattsPureEntity.setVitaAttuale(stattsPureDTO.getVitaAttuale());*/

        stattsPureEntity.setCostituzione(stattsPureDTO.getCostituzione());
        stattsPureEntity.setForza(stattsPureDTO.getForza());
        stattsPureEntity.setDestrezza(stattsPureDTO.getDestrezza());
        stattsPureEntity.setSaggezza(stattsPureDTO.getSaggezza());
        stattsPureEntity.setIntelligenza(stattsPureDTO.getIntelligenza());
        stattsPureEntity.setCarisma(stattsPureDTO.getCarisma());

        /*stattsPureEntity.setCa(stattsPureDTO.getCa());

        stattsPureEntity.setUtilizzoArmaX(stattsPureDTO.getUtilizzoArmaX());*/

        return stattsPureEntity;
    }

    @Override
    public StattsPureDTO calcoloCa(long pgId) {
        StattsPureEntity stattsPureEntity = new StattsPureEntity();
        StattsPureDTO stattsPureDTO = new StattsPureDTO();
         stattsPureDTO = convertToDto(stattsPureEntity);
       // stattsPureDTO.setCa(stattsPureDTO.getCostituzione()+10);
         return stattsPureDTO;
    }

    @Override
    public StattsPureEntity vita(int vita) {
        int puntiVita = vita*2;

        return null;
    }

    @Override
    public StattsPureEntity vitaMax() {
        return null;
    }

    @Override
    public StattsPureEntity vitaAttuale() {
        return null;
    }


}
