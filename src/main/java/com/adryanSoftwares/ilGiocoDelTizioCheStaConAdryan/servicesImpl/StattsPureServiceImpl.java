package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsPureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StattsPureServiceImpl implements StattsPureService {

    //convertitore ENTITY-->DTO

    private StattsPureDTO convertToDto (StattsPureEntity stattsPureEntity){
        StattsPureDTO stattsPureDTO =new StattsPureDTO();

        stattsPureDTO.setIdStattsPure(stattsPureEntity.getIdStattsPure());

        //stattsPureDTO.setVita(stattsPureEntity.getVita());
        stattsPureDTO.setVitaMax(stattsPureEntity.getVitaMax());
        //stattsPureDTO.setVitaAttuale(stattsPureEntity.getVitaAttuale());

        stattsPureDTO.setCostituzione(stattsPureEntity.getCostituzione());
        stattsPureDTO.setForza(stattsPureEntity.getForza());
        stattsPureDTO.setDestrezza(stattsPureEntity.getDestrezza());
        stattsPureDTO.setSaggezza(stattsPureEntity.getSaggezza());
        stattsPureDTO.setIntelligenza(stattsPureEntity.getIntelligenza());
        stattsPureDTO.setCarisma(stattsPureEntity.getCarisma());

        //stattsPureDTO.setCa(stattsPureEntity.getCa());
        //stattsPureDTO.setUtilizzoArmaX(stattsPureEntity.getUtilizzoArmaX());

        return stattsPureDTO;
    }

    //convertitore DTO-->ENTITY

    private StattsPureEntity convertToEntity (StattsPureDTO stattsPureDTO){
        StattsPureEntity stattsPureEntity = new StattsPureEntity();

        if(stattsPureDTO.getIdStattsPure() != null){
        stattsPureEntity.setIdStattsPure(stattsPureDTO.getIdStattsPure());
        }
        //stattsPureEntity.setVita(stattsPureDTO.getVita());
        stattsPureEntity.setVitaMax(stattsPureDTO.getVitaMax());
        //stattsPureEntity.setVitaAttuale(stattsPureDTO.getVitaAttuale());

        stattsPureEntity.setCostituzione(stattsPureDTO.getCostituzione());
        stattsPureEntity.setForza(stattsPureDTO.getForza());
        stattsPureEntity.setDestrezza(stattsPureDTO.getDestrezza());
        stattsPureEntity.setSaggezza(stattsPureDTO.getSaggezza());
        stattsPureEntity.setIntelligenza(stattsPureDTO.getIntelligenza());
        stattsPureEntity.setCarisma(stattsPureDTO.getCarisma());

        //stattsPureEntity.setCa(stattsPureDTO.getCa());
        //stattsPureEntity.setUtilizzoArmaX(stattsPureDTO.getUtilizzoArmaX());

        return stattsPureEntity;
    }

    @Override
    public List<StattsPureDTO> getAllStatts() {
        /*List<StattsPureEntity> Pgstatts = stattsPureRepository.findAll();
        List<StattsPureDTO> stattsDTO = new ArrayList<>();
        for(StattsPureEntity stattsPureEntity : Pgstatts){
            StattsPureDTO stattsPureDTO = convertToDto(stattsPureEntity);
            stattsDTO.add(stattsPureDTO);
        }
        return stattsDTO;*/
        return  null;
    }

    public StattsPureEntity getStattByIdPg(Long idPg) {
        return  null;
        }

    @Override
    public StattsPureEntity getStattById(Long IdStattsPure) {
        //StattsPureEntity stattsPureEntity = stattsPureRepository.getById(IdStattsPure);
        //return stattsPureEntity;
        return  null;
    }

    @Override
    public StattsPureDTO setStatt(StattsPureDTO stattsPureDTO) {
        StattsPureEntity stattsPure = convertToEntity(stattsPureDTO);
        //stattsPureRepository.save(stattsPure);
        //return stattsPureDTO;
        return  null;
    }

}
