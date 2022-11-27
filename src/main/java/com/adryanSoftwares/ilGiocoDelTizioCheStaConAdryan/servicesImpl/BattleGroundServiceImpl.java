package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.BattlegroundRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.BattleGroundService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


@Service
public class BattleGroundServiceImpl implements BattleGroundService {

    @Autowired
    BattlegroundRepository battleGroundRepository;

    @Override
    public BattlegroundEntity newBattleGround(BattlegroundDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (BattlegroundEntity) battleGroundRepository.creates(BattlegroundMapper.dtoToEntity(dto));
    }

    @Override
    public BattlegroundDto selectBattleGround(Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (BattlegroundDto) battleGroundRepository.selectById(id);
    }

    @Override
    public BattlegroundEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (BattlegroundEntity) battleGroundRepository.delete(id);
    }

    @Override
    public BattlegroundEntity update(BattlegroundDto dto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (BattlegroundEntity) battleGroundRepository.update(BattlegroundMapper.dtoToEntity(dto));
    }

    @Override
    public List<BattlegroundEntity> findAllByOrderByIdBattleGroundAsc() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return battleGroundRepository.findAll();
    }
}
