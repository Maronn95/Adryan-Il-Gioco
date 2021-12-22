package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsPureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StattsPureServiceImpl implements StattsPureService {

    @Autowired
    StattsPureEntity stattsPureEntity;
    JpaRepository<StattsPureEntity, Long> stattsPureRepository;
    StattsPureDTO stattsPureDTO;

    //convertitore ENTITY-->DTO

    private StattsPureDTO convertToDto (StattsPureEntity stattsPureEntity){
        StattsPureDTO stattsPureDTO =new StattsPureDTO();

        stattsPureDTO.setId(stattsPureEntity.getId());

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

        stattsPureEntity.setId(stattsPureDTO.getId());

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
        List<StattsPureDTO> stattsDTO = new ArrayList<StattsPureDTO>();
        for(StattsPureEntity stattsPureEntity : Pgstatts){
            StattsPureDTO stattsPureDTO = convertToDto(stattsPureEntity);
            stattsDTO.add(stattsPureDTO);
        }

        return stattsDTO;
    }


    @Override
    public StattsPureDTO getStatt(String name) {
        List<StattsPureEntity> statts = stattsPureRepository.findAll();
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

            if(name=="ca"){stattsPureDTO.setCa(stattsPureEntity.getCa());}
            if(name=="utilizzoArmaX"){stattsPureDTO.setUtilizzoArmaX(stattsPureEntity.getUtilizzoArmaX());}
        }
        return stattsPureDTO;
    }

    @Override
    public StattsPureDTO setStatt(Long id, StattsPureDTO stattsPureDTO) {
        return null;
    }
}
