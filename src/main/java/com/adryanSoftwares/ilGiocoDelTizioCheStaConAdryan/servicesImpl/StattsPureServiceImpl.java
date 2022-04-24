package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.PgRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.StattsPureRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsPureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StattsPureServiceImpl implements StattsPureService {

    @Autowired
    StattsPureRepository stattsPureRepository;
    PgRepo pgRepo;

    //convertitore ENTITY-->DTO

    private StattsPureDTO convertToDto (StattsPureEntity stattsPureEntity){
        StattsPureDTO stattsPureDTO =new StattsPureDTO();

        stattsPureDTO.setIdStattsPure(stattsPureEntity.getIdStattsPure());

        stattsPureDTO.setVita(stattsPureEntity.getVita());
        stattsPureDTO.setVitaMax(stattsPureEntity.getVitaMax());
        stattsPureDTO.setVitaAttuale(stattsPureEntity.getVitaAttuale());

        stattsPureDTO.setCostituzione(stattsPureEntity.getCostituzione());
        stattsPureDTO.setForza(stattsPureEntity.getForza());
        stattsPureDTO.setDestrezza(stattsPureEntity.getDestrezza());
        stattsPureDTO.setSaggezza(stattsPureEntity.getSaggezza());
        stattsPureDTO.setIntelligenza(stattsPureEntity.getIntelligenza());
        stattsPureDTO.setCarisma(stattsPureEntity.getCarisma());

        stattsPureDTO.setCa(stattsPureEntity.getCa());

        stattsPureDTO.setUtilizzoArmaX(stattsPureEntity.getUtilizzoArmaX());

        return stattsPureDTO;
    }

    //convertitore DTO-->ENTITY

    private StattsPureEntity convertToEntity (StattsPureDTO stattsPureDTO){
        StattsPureEntity stattsPureEntity = new StattsPureEntity();

        if(stattsPureDTO.getIdStattsPure() != null){
        stattsPureEntity.setIdStattsPure(stattsPureDTO.getIdStattsPure());
        }
        stattsPureEntity.setVita(stattsPureDTO.getVita());
        stattsPureEntity.setVitaMax(stattsPureDTO.getVitaMax());
        stattsPureEntity.setVitaAttuale(stattsPureDTO.getVitaAttuale());

        stattsPureEntity.setCostituzione(stattsPureDTO.getCostituzione());
        stattsPureEntity.setForza(stattsPureDTO.getForza());
        stattsPureEntity.setDestrezza(stattsPureDTO.getDestrezza());
        stattsPureEntity.setSaggezza(stattsPureDTO.getSaggezza());
        stattsPureEntity.setIntelligenza(stattsPureDTO.getIntelligenza());
        stattsPureEntity.setCarisma(stattsPureDTO.getCarisma());

        stattsPureEntity.setCa(stattsPureDTO.getCa());

        stattsPureEntity.setUtilizzoArmaX(stattsPureDTO.getUtilizzoArmaX());

        return stattsPureEntity;
    }

    @Override
    public List<StattsPureDTO> getAllStatts() {
        List<StattsPureEntity> Pgstatts = stattsPureRepository.findAll();
        List<StattsPureDTO> stattsDTO = new ArrayList<>();
        for(StattsPureEntity stattsPureEntity : Pgstatts){
            StattsPureDTO stattsPureDTO = convertToDto(stattsPureEntity);
            stattsDTO.add(stattsPureDTO);
        }

        return stattsDTO;
    }

    /*@Override
    public List<StattsPureEntity> getAllStattsEntity() {
        List<StattsPureEntity> pgStatts = stattsPureRepository.findAll();
        return pgStatts;
    }*/

    public StattsPureEntity getStattByIdPg(Long idPg) {
        return pgRepo.getById(idPg).getStattsPureEntity();

        }

    /*@Override
    public StattsPureDTO getStatt(String name) {
        List<StattsPureEntity> statts = stattsPureRepository.findAll();
        StattsPureDTO stattsPureDTO = new StattsPureDTO();
        for(StattsPureEntity stattsPureEntity : statts){

            if(name=="vita"){stattsPureDTO.setVita(stattsPureEntity.getVita());}
            if(name=="vitaAttuale"){stattsPureDTO.setVita(stattsPureEntity.getVitaAttuale());}
            if(name=="vitaMax"){stattsPureDTO.setVita(stattsPureEntity.getVitaMax());}

            if(name=="forza"){stattsPureDTO.setForza(stattsPureEntity.getForza());}
            if(name=="costituzione"){stattsPureDTO.setCostituzione(stattsPureEntity.getCostituzione());}
            if(name=="destrezza"){stattsPureDTO.setDestrezza(stattsPureEntity.getDestrezza());}
            if(name=="saggezza"){stattsPureDTO.setSaggezza(stattsPureEntity.getSaggezza());}
            if(name=="intelligenza"){stattsPureDTO.setSaggezza(stattsPureEntity.getIntelligenza());}
            if(name=="carisma"){stattsPureDTO.setCarisma(stattsPureEntity.getCarisma());}
            if(name=="idPg"){stattsPureDTO.setIdPg(stattsPureEntity.getIdPg());}

            if(name=="ca"){stattsPureDTO.setCa(stattsPureEntity.getCa());}
            if(name=="utilizzoArmaX"){stattsPureDTO.setUtilizzoArmaX(stattsPureEntity.getUtilizzoArmaX());}
        }
        return stattsPureDTO;
    }*/

    @Override
    public StattsPureEntity getStattById(Long IdStattsPure) {
        StattsPureEntity stattsPureEntity = stattsPureRepository.getById(IdStattsPure);
        return stattsPureEntity;
    }

    @Override
    public StattsPureDTO setStatt(StattsPureDTO stattsPureDTO) {

        StattsPureEntity stattsPure = convertToEntity(stattsPureDTO);
        stattsPureRepository.save(stattsPure);

        return stattsPureDTO;
    }

}
