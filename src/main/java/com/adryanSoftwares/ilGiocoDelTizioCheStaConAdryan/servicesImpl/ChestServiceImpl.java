package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ChestDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ChestMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ChestRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ChestEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoBattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ChestService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

@Service
public class ChestServiceImpl implements ChestService {
    @Autowired
    private ChestRepository chestRepository;

    @Autowired
    private OggettoBattlegroundServiceImpl OBS;

    @Override
    public ChestEntity newChest(ChestDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        dto.setDimensione(Integer.valueOf((int) ((dto.getValoreRarita()*dto.getLivello())*0.099)));
        if(dto.getDimensione()<1) dto.setDimensione(1);
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

    @Override
    public Integer[] generatingLoot(Integer dimensione, Integer valoreRarita, Integer livello) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        List<OggettoBattleGroundEntity> loot = OBS.selectByLevelAndRarity(valoreRarita-1, livello);
        Integer[] lootId = new Integer[loot.size()-1];
        Random random = new Random(loot.size());
        for(int i=0;i<=dimensione-1;i++){

            lootId[i]=loot.get(random.nextInt(loot.size())).getIdOggettoBattleGround();
        }

        return lootId;


    }




}
