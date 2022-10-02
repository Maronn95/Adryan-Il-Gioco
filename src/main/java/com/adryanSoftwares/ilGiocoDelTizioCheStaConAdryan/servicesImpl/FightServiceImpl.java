package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.MetodoB1DTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.FightRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.StattsCalcRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.FightNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.FightEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsCalcEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.FightNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.FightService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class FightServiceImpl implements FightService {

    @Autowired
    PGRepository pgRepository;

    @Autowired
    ArmiRepository armiRepository;

    @Autowired
    FightRepository fightRepository;

    @Autowired
    StattsCalcRepository stattsCalcRepository;


    private FightEntity reqToEntity(FightNewJSONreq entityRequest) {
        FightEntity entity = new FightEntity();

        if(entityRequest.getBattlegroundDTO()!=null){
            entity.setBattlegroundEntity(BattlegroundMapper.dtoToEntity(entityRequest.getBattlegroundDTO()));
        }
        if(entityRequest.getIdFight()!=null){
            entity.setIdFight(entityRequest.getIdFight());
        }
        if(entityRequest.getIdPg()!=null)
            entity.setIdPg(entityRequest.getIdPg());

        return entity;
    }

    @Override
    public FightNewJSONresp metodoB1(MetodoB1DTO metodoB1DTO) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {

        PgEntity pg1 = (PgEntity) pgRepository.selectById(metodoB1DTO.getIdPg1());
        PgEntity pg2 = (PgEntity) pgRepository.selectById(metodoB1DTO.getIdPg2());

        ArmiEntity arma1 = (ArmiEntity) armiRepository.selectById(1);

        subisciAzioneOffensiva(PgAzioniOffensiveUtils.eseguiAzioneDinamicamente(metodoB1DTO.getAzione(), pg1, arma1), pg1, pg2, metodoB1DTO.getIdFight());

        FightNewJSONresp fightNewJSONresp = (FightNewJSONresp) fightRepository.selectById(metodoB1DTO.getIdFight());

        return fightNewJSONresp;
    }

    @Override
    public FightNewJSONresp newFight(FightNewJSONreq entityRequest) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        FightEntity entity = reqToEntity(entityRequest);
        FightEntity newEntity = (FightEntity) fightRepository.creates(entity);
        FightNewJSONresp newResp = new FightNewJSONresp(newEntity);

        return newResp;
    }

    @Override
    public FightNewJSONresp selectFight(Integer idFight) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {


        FightEntity fightEntity = (FightEntity) fightRepository.selectById(idFight);
        FightNewJSONresp newResp = new FightNewJSONresp(fightEntity);
            return newResp;

    }

    @Override
    public FightNewJSONresp delete(Integer idFight) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {


        FightEntity entity = (FightEntity) fightRepository.delete(idFight);
        FightNewJSONresp newResp = new FightNewJSONresp(entity);
        return newResp;

    }

    @Override
    public FightNewJSONresp update(FightNewJSONreq fightJSON) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return new FightNewJSONresp((FightEntity) fightRepository.update(fightJSON));
    }

    public void subisciAzioneOffensiva (List<Integer> valoriAttacco, PgEntity pg1, PgEntity pg2, Integer idFight) throws IOException, NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException, ParseException, InvocationTargetException {

        StattsCalcEntity stattsCalcEntity = pg2.getStattsCalcEntity();

        if (stattsCalcEntity.getCa()<= valoriAttacco.get(0)){
            stattsCalcEntity.setVitaAttuale(stattsCalcEntity.getVitaAttuale()-valoriAttacco.get(1));
            System.out.println("Mannaggia a gesù");
            stattsCalcRepository.update(stattsCalcEntity);
            System.out.println("Le statistichePure di "+pg2.getIdPG()+" sono state aggiornate");
        }
    }


}
