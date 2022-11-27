package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.StattsPureNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.StattsPureNewJSONresp;

public class StattsPureMapper {

    public static StattsPureEntity dtoToEntity (StattsPureDTO stattsPureDTO){
        StattsPureEntity stattsPureEntity= new StattsPureEntity();
        if(stattsPureDTO.getCarisma()!=0){
            stattsPureEntity.setCarisma(stattsPureDTO.getCarisma());
        }
        if(stattsPureDTO.getForza()!=0){
            stattsPureEntity.setForza(stattsPureDTO.getForza());
        }
        if(stattsPureDTO.getIntelligenza()!=0){
            stattsPureEntity.setIntelligenza(stattsPureDTO.getIntelligenza());
        }
        if(stattsPureDTO.getSaggezza()!=0){
            stattsPureEntity.setSaggezza(stattsPureDTO.getSaggezza());
        }
        if(stattsPureDTO.getDestrezza()!=0){
            stattsPureEntity.setDestrezza(stattsPureDTO.getDestrezza());
        }
        if(stattsPureDTO.getTrash()!=0){
            stattsPureEntity.setTrash(stattsPureDTO.getTrash());
        }
        if(stattsPureDTO.getVitaPura()!=0){
            stattsPureEntity.setVitaPura(stattsPureDTO.getVitaPura());
        }
        if(stattsPureDTO.getIdStattsPure()!=0){
            stattsPureEntity.setIdStattsPure(stattsPureDTO.getIdStattsPure());
        }
        if(stattsPureDTO.getCostituzione()!=0){
            stattsPureEntity.setCostituzione(stattsPureDTO.getCostituzione());
        }
        return stattsPureEntity;
    }

    public static StattsPureNewJSONresp dtoToResp (StattsPureDTO stattsPureDTO){
        StattsPureNewJSONresp stattsPureNewJSONresp= new StattsPureNewJSONresp();
        if(stattsPureDTO.getCarisma()!=0){
            stattsPureNewJSONresp.setCarisma(stattsPureDTO.getCarisma());
        }
        if(stattsPureDTO.getForza()!=0){
            stattsPureNewJSONresp.setForza(stattsPureDTO.getForza());
        }
        if(stattsPureDTO.getIntelligenza()!=0){
            stattsPureNewJSONresp.setIntelligenza(stattsPureDTO.getIntelligenza());
        }
        if(stattsPureDTO.getSaggezza()!=0){
            stattsPureNewJSONresp.setSaggezza(stattsPureDTO.getSaggezza());
        }
        if(stattsPureDTO.getDestrezza()!=0){
            stattsPureNewJSONresp.setDestrezza(stattsPureDTO.getDestrezza());
        }
        if(stattsPureDTO.getTrash()!=0){
            stattsPureNewJSONresp.setTrash(stattsPureDTO.getTrash());
        }
        if(stattsPureDTO.getVitaPura()!=0){
            stattsPureNewJSONresp.setVitaPura(stattsPureDTO.getVitaPura());
        }
        if(stattsPureDTO.getIdStattsPure()!=0){
            stattsPureNewJSONresp.setIdStattsPure(stattsPureDTO.getIdStattsPure());
        }
        if(stattsPureDTO.getCostituzione()!=0){
            stattsPureNewJSONresp.setCostituzione(stattsPureDTO.getCostituzione());
        }
        return stattsPureNewJSONresp;
    }

    public static StattsPureNewJSONreq dtoToReq (StattsPureDTO stattsPureDTO){
        StattsPureNewJSONreq stattsPureNewJSONreq= new StattsPureNewJSONreq(StattsPureMapper.dtoToEntity(stattsPureDTO));
        if(stattsPureDTO.getCarisma()!=0){
            stattsPureNewJSONreq.setCarisma(stattsPureDTO.getCarisma());
        }
        if(stattsPureDTO.getForza()!=0){
            stattsPureNewJSONreq.setForza(stattsPureDTO.getForza());
        }
        if(stattsPureDTO.getIntelligenza()!=0){
            stattsPureNewJSONreq.setIntelligenza(stattsPureDTO.getIntelligenza());
        }
        if(stattsPureDTO.getSaggezza()!=0){
            stattsPureNewJSONreq.setSaggezza(stattsPureDTO.getSaggezza());
        }
        if(stattsPureDTO.getDestrezza()!=0){
            stattsPureNewJSONreq.setDestrezza(stattsPureDTO.getDestrezza());
        }
        if(stattsPureDTO.getTrash()!=0){
            stattsPureNewJSONreq.setTrash(stattsPureDTO.getTrash());
        }
        if(stattsPureDTO.getVitaPura()!=0){
            stattsPureNewJSONreq.setVitaPura(stattsPureDTO.getVitaPura());
        }
        if(stattsPureDTO.getIdStattsPure()!=0){
            stattsPureNewJSONreq.setIdStattsPure(stattsPureDTO.getIdStattsPure());
        }
        if(stattsPureDTO.getCostituzione()!=0){
            stattsPureNewJSONreq.setCostituzione(stattsPureDTO.getCostituzione());
        }
        return stattsPureNewJSONreq;
    }

    public static StattsPureEntity reqToEntity (StattsPureNewJSONreq stattsPureNewJSONreq){
        StattsPureEntity stattsPureEntity= new StattsPureEntity();
        if(stattsPureNewJSONreq.getCarisma()!=0){
            stattsPureEntity.setCarisma(stattsPureNewJSONreq.getCarisma());
        }
        if(stattsPureNewJSONreq.getForza()!=0){
            stattsPureEntity.setForza(stattsPureNewJSONreq.getForza());
        }
        if(stattsPureNewJSONreq.getIntelligenza()!=0){
            stattsPureEntity.setIntelligenza(stattsPureNewJSONreq.getIntelligenza());
        }
        if(stattsPureNewJSONreq.getSaggezza()!=0){
            stattsPureEntity.setSaggezza(stattsPureNewJSONreq.getSaggezza());
        }
        if(stattsPureNewJSONreq.getDestrezza()!=0){
            stattsPureEntity.setDestrezza(stattsPureNewJSONreq.getDestrezza());
        }
        if(stattsPureNewJSONreq.getTrash()!=0){
            stattsPureEntity.setTrash(stattsPureNewJSONreq.getTrash());
        }
        if(stattsPureNewJSONreq.getVitaPura()!=0){
            stattsPureEntity.setVitaPura(stattsPureNewJSONreq.getVitaPura());
        }
        if(stattsPureNewJSONreq.getIdStattsPure()!=0){
            stattsPureEntity.setIdStattsPure(stattsPureNewJSONreq.getIdStattsPure());
        }
        if(stattsPureNewJSONreq.getCostituzione()!=0){
            stattsPureEntity.setCostituzione(stattsPureNewJSONreq.getCostituzione());
        }
        return stattsPureEntity;
    }

    public static StattsPureEntity respToEntity (StattsPureNewJSONresp stattsPureNewJSONresp){
        StattsPureEntity stattsPureEntity= new StattsPureEntity();
        if(stattsPureNewJSONresp.getCarisma()!=0){
            stattsPureEntity.setCarisma(stattsPureNewJSONresp.getCarisma());
        }
        if(stattsPureNewJSONresp.getForza()!=0){
            stattsPureEntity.setForza(stattsPureNewJSONresp.getForza());
        }
        if(stattsPureNewJSONresp.getIntelligenza()!=0){
            stattsPureEntity.setIntelligenza(stattsPureNewJSONresp.getIntelligenza());
        }
        if(stattsPureNewJSONresp.getSaggezza()!=0){
            stattsPureEntity.setSaggezza(stattsPureNewJSONresp.getSaggezza());
        }
        if(stattsPureNewJSONresp.getDestrezza()!=0){
            stattsPureEntity.setDestrezza(stattsPureNewJSONresp.getDestrezza());
        }
        if(stattsPureNewJSONresp.getTrash()!=0){
            stattsPureEntity.setTrash(stattsPureNewJSONresp.getTrash());
        }
        if(stattsPureNewJSONresp.getVitaPura()!=0){
            stattsPureEntity.setVitaPura(stattsPureNewJSONresp.getVitaPura());
        }
        if(stattsPureNewJSONresp.getIdStattsPure()!=0){
            stattsPureEntity.setIdStattsPure(stattsPureNewJSONresp.getIdStattsPure());
        }
        if(stattsPureNewJSONresp.getCostituzione()!=0){
            stattsPureEntity.setCostituzione(stattsPureNewJSONresp.getCostituzione());
        }
        return stattsPureEntity;
    }

    public static StattsPureDTO entityToDto (StattsPureEntity stattsPureEntity){
        StattsPureDTO stattsPureDTO= new StattsPureDTO();
        if(stattsPureEntity.getCarisma()!=0){
            stattsPureDTO.setCarisma(stattsPureEntity.getCarisma());
        }
        if(stattsPureEntity.getForza()!=0){
            stattsPureDTO.setForza(stattsPureEntity.getForza());
        }
        if(stattsPureEntity.getIntelligenza()!=0){
            stattsPureDTO.setIntelligenza(stattsPureEntity.getIntelligenza());
        }
        if(stattsPureEntity.getSaggezza()!=0){
            stattsPureDTO.setSaggezza(stattsPureEntity.getSaggezza());
        }
        if(stattsPureEntity.getDestrezza()!=0){
            stattsPureDTO.setDestrezza(stattsPureEntity.getDestrezza());
        }
        if(stattsPureEntity.getTrash()!=0){
            stattsPureDTO.setTrash(stattsPureEntity.getTrash());
        }
        if(stattsPureEntity.getVitaPura()!=0){
            stattsPureDTO.setVitaPura(stattsPureEntity.getVitaPura());
        }
        if(stattsPureEntity.getIdStattsPure()!=0){
            stattsPureDTO.setIdStattsPure(stattsPureEntity.getIdStattsPure());
        }
        if(stattsPureEntity.getCostituzione()!=0){
            stattsPureDTO.setCostituzione(stattsPureEntity.getCostituzione());
        }
        return stattsPureDTO;
    }
}
