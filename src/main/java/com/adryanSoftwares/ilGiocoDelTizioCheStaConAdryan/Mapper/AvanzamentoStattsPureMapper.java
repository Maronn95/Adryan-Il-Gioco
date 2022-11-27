package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.AvanzamentoStattsPureNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AvanzamentoStattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.AvanzamentoStattsPureNewJSONresp;

public class AvanzamentoStattsPureMapper {

    public static AvanzamentoStattsPureEntity reqToEntity (AvanzamentoStattsPureNewJSONreq avanzamentoStattsPureNewJSONreq){
        AvanzamentoStattsPureEntity avanzamentoStattsPureEntity= new AvanzamentoStattsPureEntity();
        if(avanzamentoStattsPureNewJSONreq.getAvanzamentoCarisma()!=0){
            avanzamentoStattsPureEntity.setAvanzamentoCarisma(avanzamentoStattsPureNewJSONreq.getAvanzamentoCarisma());
        }
        if(avanzamentoStattsPureNewJSONreq.getAvanzamentoForza()!=0){
            avanzamentoStattsPureEntity.setAvanzamentoForza(avanzamentoStattsPureNewJSONreq.getAvanzamentoForza());
        }
        if(avanzamentoStattsPureNewJSONreq.getAvanzamentoIntelligenza()!=0){
            avanzamentoStattsPureEntity.setAvanzamentoIntelligenza(avanzamentoStattsPureNewJSONreq.getAvanzamentoIntelligenza());
        }
        if(avanzamentoStattsPureNewJSONreq.getAvanzamentoSaggezza()!=0){
            avanzamentoStattsPureEntity.setAvanzamentoSaggezza(avanzamentoStattsPureNewJSONreq.getAvanzamentoSaggezza());
        }
        if(avanzamentoStattsPureNewJSONreq.getAvanzamentoDestrezza()!=0){
            avanzamentoStattsPureEntity.setAvanzamentoDestrezza(avanzamentoStattsPureNewJSONreq.getAvanzamentoDestrezza());
        }
        if(avanzamentoStattsPureNewJSONreq.getAvanzamentoTrash()!=0){
            avanzamentoStattsPureEntity.setAvanzamentoTrash(avanzamentoStattsPureNewJSONreq.getAvanzamentoTrash());
        }
        if(avanzamentoStattsPureNewJSONreq.getAvanzamentoVitaMax()!=0){
            avanzamentoStattsPureEntity.setAvanzamentoVitaMax(avanzamentoStattsPureNewJSONreq.getAvanzamentoVitaMax());
        }
        if(avanzamentoStattsPureNewJSONreq.getIdAvanzamentoStattsPure()!=0){
            avanzamentoStattsPureEntity.setIdAvanzamentoStattsPure(avanzamentoStattsPureNewJSONreq.getIdAvanzamentoStattsPure());
        }
        if(avanzamentoStattsPureNewJSONreq.getAvanzamentoCostituzione()!=0){
            avanzamentoStattsPureEntity.setAvanzamentoCostituzione(avanzamentoStattsPureNewJSONreq.getAvanzamentoCostituzione());
        }
        return avanzamentoStattsPureEntity;
    }

    public static AvanzamentoStattsPureNewJSONresp entityToResp (AvanzamentoStattsPureEntity avanzamentoStattsPureEntity){
        AvanzamentoStattsPureNewJSONresp avanzamentoStattsPureNewJSONresp= new AvanzamentoStattsPureNewJSONresp();
        if(avanzamentoStattsPureEntity.getAvanzamentoCarisma()!=0){
            avanzamentoStattsPureNewJSONresp.setAvanzamentoCarisma(avanzamentoStattsPureEntity.getAvanzamentoCarisma());
        }
        if(avanzamentoStattsPureEntity.getAvanzamentoForza()!=0){
            avanzamentoStattsPureNewJSONresp.setAvanzamentoForza(avanzamentoStattsPureEntity.getAvanzamentoForza());
        }
        if(avanzamentoStattsPureEntity.getAvanzamentoIntelligenza()!=0){
            avanzamentoStattsPureNewJSONresp.setAvanzamentoIntelligenza(avanzamentoStattsPureEntity.getAvanzamentoIntelligenza());
        }
        if(avanzamentoStattsPureEntity.getAvanzamentoSaggezza()!=0){
            avanzamentoStattsPureNewJSONresp.setAvanzamentoSaggezza(avanzamentoStattsPureEntity.getAvanzamentoSaggezza());
        }
        if(avanzamentoStattsPureEntity.getAvanzamentoDestrezza()!=0){
            avanzamentoStattsPureNewJSONresp.setAvanzamentoDestrezza(avanzamentoStattsPureEntity.getAvanzamentoDestrezza());
        }
        if(avanzamentoStattsPureEntity.getAvanzamentoTrash()!=0){
            avanzamentoStattsPureNewJSONresp.setAvanzamentoTrash(avanzamentoStattsPureEntity.getAvanzamentoTrash());
        }
        if(avanzamentoStattsPureEntity.getAvanzamentoVitaMax()!=0){
            avanzamentoStattsPureNewJSONresp.setAvanzamentoVitaMax(avanzamentoStattsPureEntity.getAvanzamentoVitaMax());
        }
        if(avanzamentoStattsPureEntity.getIdAvanzamentoStattsPure()!=0){
            avanzamentoStattsPureNewJSONresp.setIdAvanzamentoStattsPure(avanzamentoStattsPureEntity.getIdAvanzamentoStattsPure());
        }
        if(avanzamentoStattsPureEntity.getAvanzamentoCostituzione()!=0){
            avanzamentoStattsPureNewJSONresp.setAvanzamentoCostituzione(avanzamentoStattsPureEntity.getAvanzamentoCostituzione());
        }
        return avanzamentoStattsPureNewJSONresp;
    }
}
