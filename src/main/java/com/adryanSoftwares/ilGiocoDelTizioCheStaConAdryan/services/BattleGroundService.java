package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattlegroundEntity;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;

public interface BattleGroundService{

     List<BattlegroundEntity> findAllByOrderByIdBattleGroundAsc();

     List<BattlegroundEntity> oldFindAll();

     Optional<BattlegroundDto> findBGById(Long idBG) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

    void saveOrUpdate(BattlegroundDto battleGround);
    BattlegroundDto saveOrUpdatePostman (BattlegroundDto battleGroundDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    void deleteBG(Long idBG);


}
