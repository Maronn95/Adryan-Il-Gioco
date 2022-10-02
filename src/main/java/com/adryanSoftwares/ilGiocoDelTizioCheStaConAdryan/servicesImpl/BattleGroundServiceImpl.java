package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattleGroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.BattleGroundRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.BattleGroundService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;


@Service
public class BattleGroundServiceImpl implements BattleGroundService {

    @Autowired
    BattleGroundRepository battleGroundRepository;

    @Override
    public BattleGroundEntity newBattleGround(BattleGroundDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (BattleGroundEntity) battleGroundRepository.creates(BattleGroundMapper.dtoToEntity(dto));
    }

    @Override
    public BattleGroundEntity selectBattleGround(Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (BattleGroundEntity) battleGroundRepository.selectById(id);
    }

    @Override
    public BattleGroundEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (BattleGroundEntity) battleGroundRepository.delete(id);
    }

    @Override
    public BattleGroundEntity update(BattleGroundDto dto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (BattleGroundEntity) battleGroundRepository.update(BattleGroundMapper.dtoToEntity(dto));
    }
}
