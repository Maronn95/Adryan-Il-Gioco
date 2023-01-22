package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.MetodoB1DTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.FightMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.StattsCalcMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.*;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.FightNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.*;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.FightNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.FightService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.FottuteIA.CreaturaSelvaticaIA;
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
    CreaturaSelvaticaRepository creaturaSelvaticaRepository;

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
        if(entityRequest.getPgList()!=null)
            entity.setPgList(entityRequest.getPgList());

        return entity;
    }

    @Override
    public FightNewJSONresp metodoB1(MetodoB1DTO metodoB1DTO) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException {

        List<String> pgList=metodoB1DTO.getPgList();

        PgEntity pg1=null;

        PgEntity pg2=null;

        CreaturaSelvaticaEntity creaturaSelvaticaEntity=null;


        FightNewJSONresp fightNewJSONresp = FightMapper.entityToResp((FightEntity) fightRepository.selectById(metodoB1DTO.getIdFight()));

        if(pgList.get(0).equals("PG") && pgList.get(2).equals("PG")){

            pg1 = (PgEntity) pgRepository.selectById(Integer.valueOf(pgList.get(1)));
            pg2 = (PgEntity) pgRepository.selectById(Integer.valueOf(pgList.get(3)));

            ArmiEntity arma1 = (ArmiEntity) armiRepository.selectById(1);

            subisciAzioneFisicaOffensivaPGvsPG(PgAzioniOffensiveUtils.eseguiAzioneDinamicamente(metodoB1DTO.getAzione(), pg1, arma1), pg1, pg2, metodoB1DTO.getIdFight());



        }else if(pgList.get(0).equals("PG") && pgList.get(2).equals("CreaturaSelvatica")){

            pg1 = (PgEntity) pgRepository.selectById(Integer.valueOf(pgList.get(1)));
            creaturaSelvaticaEntity = (CreaturaSelvaticaEntity) creaturaSelvaticaRepository.selectById(Integer.valueOf(pgList.get(3)));

            ArmiEntity arma1 = (ArmiEntity) armiRepository.selectById(1);

            List<Integer> valoriAttacco=PgAzioniOffensiveUtils.eseguiAzioneDinamicamente(metodoB1DTO.getAzione(), pg1, arma1);

            subisciAzioneFisicaOffensivaPGvsCS(valoriAttacco, pg1,creaturaSelvaticaEntity);


        }

        if(pgList.get(0).equals("PG") && pgList.get(2).equals("CreaturaSelvatica")){
            CreaturaSelvaticaIA creaturaSelvaticaIA = new CreaturaSelvaticaIA();

            List<Integer> valoriAttaccoCS=creaturaSelvaticaIA.turnoCreaturaSelvatica(creaturaSelvaticaEntity,pg1);

            subisciAzioneFisicaOffensivaCSvsPG(valoriAttaccoCS,pg1,creaturaSelvaticaEntity);
        }

        System.out.println("Che cazzo hai inviato cujò?");

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

    public void subisciAzioneFisicaOffensivaPGvsPG(List<Integer> valoriAttacco, PgEntity pg1, PgEntity pg2, Integer idFight) throws IOException, NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException, ParseException, InvocationTargetException {

            AvanzamentiStattsPureUtils avanzamentiStattsPureUtils= new AvanzamentiStattsPureUtils();

            //StattsCalcEntity stattsCalcEntity = pg2.getStattsCalcEntity();
            System.out.println("subisci az off");
            System.out.println("CA =" + pg2.getStattsCalcEntity().getCa());
            System.out.println("T X C =" + valoriAttacco.get(0));

            if (pg2.getStattsCalcEntity().getCa() <= valoriAttacco.get(0)) {
                System.out.println("Mannaggia a gesù");

                StattsCalcEntity stattsCalcEntity = (StattsCalcEntity) stattsCalcRepository.selectById(pg2.getStattsCalcEntity().getIdStattsCalc());
                stattsCalcEntity.setVitaAttuale(pg2.getStattsCalcEntity().getVitaAttuale() - valoriAttacco.get(1));

                System.out.println("subisciAzioneOffensiva UPDATEstattsCalc start");
                stattsCalcRepository.update(stattsCalcEntity);
                System.out.println("subisciAzioneOffensiva UPDATEstattsCalc finish");
                System.out.println("Le statistichePure di idPG=" + pg2.getIdPG() + " sono state aggiornate");

                System.out.println("subisciAzioneOffensiva UPDATEstattsPurePG1 start");
                pg1.getAvanzamentoStattsPureEntity().setAvanzamentoForza(pg1.getAvanzamentoStattsPureEntity().getAvanzamentoForza() + 1);
                pg2.getAvanzamentoStattsPureEntity().setAvanzamentoVitaMax(pg2.getAvanzamentoStattsPureEntity().getAvanzamentoVitaMax() + 1);
                avanzamentiStattsPureUtils.updateAvanzamentiStattsPurePGvsPG(pg1,pg2);

        }
    }

    public void subisciAzioneFisicaOffensivaPGvsCS(List<Integer> valoriAttacco, PgEntity pg1, CreaturaSelvaticaEntity creaturaSelvaticaEntity) throws IOException, NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException, ParseException, InvocationTargetException {

        AvanzamentiStattsPureUtils avanzamentiStattsPureUtils= new AvanzamentiStattsPureUtils();

        //StattsCalcEntity stattsCalcEntity = pg2.getStattsCalcEntity();
        System.out.println("subisci az off");
        System.out.println("CA =" + creaturaSelvaticaEntity.getStattsCalcEntity().getCa());
        System.out.println("T X C =" + valoriAttacco.get(0));

        if (creaturaSelvaticaEntity.getStattsCalcEntity().getCa() <= valoriAttacco.get(0)) {
            System.out.println("Mannaggia a gesù");

            StattsCalcEntity stattsCalcEntity = (StattsCalcEntity) stattsCalcRepository.selectById(creaturaSelvaticaEntity.getStattsCalcEntity().getIdStattsCalc());
            stattsCalcEntity.setVitaAttuale(creaturaSelvaticaEntity.getStattsCalcEntity().getVitaAttuale() - valoriAttacco.get(1));

            System.out.println("subisciAzioneOffensiva UPDATEstattsCalc start");
            stattsCalcRepository.update(StattsCalcMapper.entityToDto(stattsCalcEntity));
            System.out.println("subisciAzioneOffensiva UPDATEstattsCalc finish");
            System.out.println("Le statistichePure di idPG=" + creaturaSelvaticaEntity.getIdCreaturaSelvatica() + " sono state aggiornate");

            System.out.println("subisciAzioneOffensiva UPDATEstattsPurePG1 start");
            pg1.getAvanzamentoStattsPureEntity().setAvanzamentoForza(pg1.getAvanzamentoStattsPureEntity().getAvanzamentoForza() + 1);
            creaturaSelvaticaEntity.getAvanzamentoStattsPureEntity().setAvanzamentoVitaMax(creaturaSelvaticaEntity.getAvanzamentoStattsPureEntity().getAvanzamentoVitaMax() + 1);
            avanzamentiStattsPureUtils.updateAvanzamentiStattsPurePGvsCS(pg1 ,creaturaSelvaticaEntity);
        }
    }

    public void subisciAzioneFisicaOffensivaCSvsPG(List<Integer> valoriAttacco, PgEntity pg1, CreaturaSelvaticaEntity creaturaSelvaticaEntity) throws IOException, NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException, ParseException, InvocationTargetException {

        //StattsCalcEntity stattsCalcEntity = pg2.getStattsCalcEntity();
        System.out.println("subisci az off");
        System.out.println("CA =" + creaturaSelvaticaEntity.getStattsCalcEntity().getCa());
        System.out.println("T X C =" + valoriAttacco.get(0));

        if (pg1.getStattsCalcEntity().getCa() <= valoriAttacco.get(0)) {
            System.out.println("Ca Superata");

            pg1.getStattsCalcEntity().setVitaAttuale(creaturaSelvaticaEntity.getStattsCalcEntity().getVitaAttuale() - valoriAttacco.get(1));

            System.out.println("subisciAzioneOffensiva UPDATEstattsCalc start");
            stattsCalcRepository.update(StattsCalcMapper.entityToDto(pg1.getStattsCalcEntity()));
            System.out.println("subisciAzioneOffensiva UPDATEstattsCalc finish");
            System.out.println("Le statistichePure di idPG=" + pg1.getIdPG() + " sono state aggiornate");

            AvanzamentiStattsPureUtils avanzamentiStattsPureUtils=new AvanzamentiStattsPureUtils();

            System.out.println("subisciAzioneOffensiva UPDATEstattsPurePG1 start");
            creaturaSelvaticaEntity.getAvanzamentoStattsPureEntity().setAvanzamentoForza(pg1.getAvanzamentoStattsPureEntity().getAvanzamentoForza() + 1);
            pg1.getAvanzamentoStattsPureEntity().setAvanzamentoVitaMax(creaturaSelvaticaEntity.getAvanzamentoStattsPureEntity().getAvanzamentoVitaMax() + 1);

            avanzamentiStattsPureUtils.updateAvanzamentiStattsPurePGvsCS(pg1,creaturaSelvaticaEntity);

        }
    }

}
