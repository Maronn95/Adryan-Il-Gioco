package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.BattlegroundRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.FightRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.FightNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.FightEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.FightNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.FightService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class FightServiceImpl implements FightService {


    @Autowired
    FightRepository FightRep;

    @Autowired
    BattlegroundRepository battleRep;


    private FightEntity reqDtoToEntity(FightNewJSONreq entityRequest) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        FightEntity entity = new FightEntity();

        if(entityRequest.getBattlegroundDTO()!=null)
            entity.setBattlegroundEntity((BattlegroundEntity) battleRep.selectById(Math.toIntExact(entityRequest.getBattlegroundDTO().getIdBattleground())));

        if(entityRequest.getIdPg()!=null)
            entity.setIdPg(entityRequest.getIdPg());

        return entity;
    }


    @Override
    public FightNewJSONresp newFight(FightNewJSONreq entityRequest) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        FightEntity entity = reqDtoToEntity(entityRequest);
        FightEntity newEntity = (FightEntity) FightRep.creates(entity);
        FightNewJSONresp newResp = new FightNewJSONresp(newEntity);

        return newResp;
    }

    @Override
    public FightNewJSONresp selectFight(Integer idFight) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {


        FightEntity fightEntity = (FightEntity) FightRep.selectById(idFight);
        FightNewJSONresp newResp = new FightNewJSONresp(fightEntity);
            return newResp;

    }

    @Override
    public FightNewJSONresp delete(Integer idFight) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {


        FightEntity entity = (FightEntity) FightRep.delete(idFight);
        FightNewJSONresp newResp = new FightNewJSONresp(entity);
        return newResp;

    }

    @Override
    public FightNewJSONresp update(FightNewJSONreq fightJSON) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return new FightNewJSONresp((FightEntity) FightRep.update(fightJSON));
    }


}
