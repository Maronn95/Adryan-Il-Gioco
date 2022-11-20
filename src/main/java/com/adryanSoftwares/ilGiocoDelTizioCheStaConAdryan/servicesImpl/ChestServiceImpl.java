package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ChestDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ChestMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ChestRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ChestEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ChestService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class ChestServiceImpl implements ChestService {
    @Autowired
    private ChestRepository chestRepository;
    @Override
    public ChestEntity newChest(ChestDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ChestEntity) chestRepository.creates(ChestMapper.DtoNewEntity(dto));

    }

    @Override
    public ChestEntity selectChest(Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (ChestEntity) chestRepository.selectById(id);
    }

    @Override
    public ChestEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ChestEntity) chestRepository.delete(id);
    }

    @Override
    public ChestEntity update(ChestDTO dto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ChestEntity) chestRepository.update(ChestMapper.DtoNewEntity(dto));
    }
}
