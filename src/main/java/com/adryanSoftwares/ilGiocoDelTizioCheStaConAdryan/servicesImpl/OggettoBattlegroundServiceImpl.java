package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoBattleGroundDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettiBattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettoBattleGroundRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ProtezioniIndossabiliRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl.ArmiRepoImpl;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.*;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettoBattleGroundService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OggettoBattlegroundServiceImpl implements OggettoBattleGroundService {

@Autowired
private OggettoBattleGroundRepository oggettoBattleGroundRepository;

@Autowired
private ArmiRepository armiRepository;

@Autowired
private ProtezioniIndossabiliRepository protezioniIndossabiliRepository;

@Autowired
private OggettiRepository oggettiRepository;
    @Override
    public OggettoBattleGroundEntity newOggetto(OggettoBattleGroundDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettoBattleGroundEntity oggetto =OggettiBattlegroundMapper.dtoToEntity(dto);


        if(dto.getIdArmi()!=null){
        oggetto.setArmiEntity((ArmiEntity) armiRepository.selectById(dto.getIdArmi()));}
        if(dto.getIdProtezione()!=null){
            oggetto.setProtezioniIndossabiliEntity((ProtezioniIndossabiliEntity)protezioniIndossabiliRepository.selectById(dto.getIdProtezione()) );
        }
        if(dto.getIdOggetto()!=null){
            oggetto.setOggettiEntity((OggettiEntity)oggettiRepository.selectById(dto.getIdOggetto()));
        }
        return (OggettoBattleGroundEntity) oggettoBattleGroundRepository.creates(oggetto);
    }

    @Override
    public OggettoBattleGroundEntity selectOggetto(Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (OggettoBattleGroundEntity) oggettoBattleGroundRepository.selectById(id);
    }

    @Override
    public OggettoBattleGroundEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettoBattleGroundEntity) oggettoBattleGroundRepository.delete(id);
    }

    @Override
    public OggettoBattleGroundEntity update(OggettoBattleGroundDTO dto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettoBattleGroundEntity) oggettoBattleGroundRepository.update(OggettiBattlegroundMapper.dtoToEntity(dto));
    }

    @Override
    public List<OggettoBattleGroundEntity> getAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return oggettoBattleGroundRepository.findAll();
    }

    @Override
    public List<OggettoBattleGroundEntity> selectByLevelAndRarity(Integer valoreRarita, Integer livello) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        List<OggettoBattleGroundEntity> oggetti = oggettoBattleGroundRepository.findAll();
        List<OggettoBattleGroundEntity>oggettiFiltrati = new ArrayList<>();
        for(OggettoBattleGroundEntity oggetto : oggetti ){
            if( oggetto.getValoreRarita()<= valoreRarita
                    && oggetto.getLivello() == livello
                    ||oggetto.getValoreRarita()<= valoreRarita && (oggetto.getLivello()+1 != 5 && oggetto.getLivello() == livello+1)
                    ||oggetto.getValoreRarita()<= valoreRarita && (oggetto.getLivello()-1 != 0 && oggetto.getLivello() == livello-1)
            ){
                oggettiFiltrati.add(oggetto);
            }
        }
        return oggettiFiltrati;
    }    }

