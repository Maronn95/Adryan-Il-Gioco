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
import java.util.Random;


@Service
public class BattleGroundServiceImpl implements BattleGroundService {

    @Autowired
    BattlegroundRepository battleGroundRepository;

    @Override
    public BattlegroundEntity newBattleGround(BattlegroundDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (BattlegroundEntity) battleGroundRepository.creates(BattlegroundMapper.dtoToEntity(dto));
    }

    @Override
    public BattlegroundEntity newBattleGroundDinamico(String ambientazione, String weather, int base, int altezza) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        BattlegroundEntity battlegroundEntity = new BattlegroundEntity();
        battlegroundEntity.setAmbientazione(ambientazione);
        battlegroundEntity.setWeather(weather);
        battlegroundEntity.setOggetto(popolamentoGriglia(ambientazione, base, altezza));
        return (BattlegroundEntity) battleGroundRepository.creates(battlegroundEntity);
    }

    @Override
    public BattlegroundDto selectBattleGround(Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return BattlegroundMapper.entityToDto((BattlegroundEntity) battleGroundRepository.selectById(id));
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


    public Integer[][] popolamentoGriglia(String ambientazione, int base, int altezza){

        Integer[][] griglia = new Integer[base][altezza];

        switch (ambientazione) {
            case "bosco":
                System.out.println("popolamentoGriglia");
                int numeroCreazioni=base+altezza/7;
                Random rand = new Random();

                for(int i=0; i<=numeroCreazioni; i++){
                    int base2=rand.nextInt(base);
                    int altezza2=rand.nextInt(altezza);
                    if(griglia[base2][altezza2]==null) {
                        griglia[base2][altezza2] = rand.nextInt(10);
                    }else {
                        int base3=rand.nextInt(base);
                        int altezza3=rand.nextInt(altezza);
                        if(griglia[base3][altezza3]==null) {
                            griglia[base3][altezza3] = rand.nextInt(10);
                        }else {
                        break;
                        }
                    }


                }
                return griglia;

            case "panura":
                return griglia;

            case "lago":
                return griglia;
        }


        return griglia;
    }



}
