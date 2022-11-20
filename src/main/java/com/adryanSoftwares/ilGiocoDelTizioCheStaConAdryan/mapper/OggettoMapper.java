package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;

public class OggettoMapper {

    public static OggettiEntity DtoNewEntity(OggettiDTO ogDto){
        OggettiEntity oggetto = new OggettiEntity();
        if (ogDto != null) {
            if (ogDto.getIdOggetti() != null) oggetto.setIdOggetti(ogDto.getIdOggetti());
            if (ogDto.getDescrizione()!= null) oggetto.setDescrizione((ogDto.getDescrizione()));
            if(ogDto.getNome()!= null) oggetto.setNome((ogDto.getNome()));
            if(ogDto.getLivello()!=null)oggetto.setLivello(ogDto.getLivello());
            if(ogDto.getTipo()!=null) oggetto.setTipo((ogDto.getTipo()));
            if(ogDto.getRarita()!=null) oggetto.setRarita((ogDto.getRarita()));
            if(ogDto.getValoreRarita()!=null)oggetto.setValoreRarita(ogDto.getValoreRarita());
            return oggetto;

        }
        return null;
    }
    public static OggettiEntity dtoUpdateEntity(OggettiDTO ogDto, OggettiEntity oggetto){

        if (ogDto != null) {
            if (ogDto.getIdOggetti() != null) oggetto.setIdOggetti(ogDto.getIdOggetti());
            if (ogDto.getDescrizione()!= null) oggetto.setDescrizione((ogDto.getDescrizione()));
            if(ogDto.getNome()!= null) oggetto.setNome((ogDto.getNome()));
            if(ogDto.getLivello()!=null)oggetto.setLivello(ogDto.getLivello());
            if(ogDto.getTipo()!=null) oggetto.setTipo((ogDto.getTipo()));
            if(ogDto.getRarita()!=null) oggetto.setRarita((ogDto.getRarita()));
            if(ogDto.getValoreRarita()!=null)oggetto.setValoreRarita(ogDto.getValoreRarita());
            return oggetto;

        }
        return null;
    }

    public static OggettiDTO entityToDto(OggettiEntity oggettoEntity) {

        OggettiDTO dto = new OggettiDTO();
        if(oggettoEntity!=null) {
            if (oggettoEntity.getIdOggetti()!=null) dto.setIdOggetti(oggettoEntity.getIdOggetti());
            if (oggettoEntity.getDescrizione()!=null) dto.setDescrizione((oggettoEntity.getDescrizione()));
            if (oggettoEntity.getNome()!=null) dto.setNome((oggettoEntity.getNome()));
            if(oggettoEntity.getLivello()!=null)dto.setLivello(oggettoEntity.getLivello());
            if (oggettoEntity.getTipo()!=null) dto.setTipo((oggettoEntity.getTipo()));
            if (oggettoEntity.getRarita()!= null) dto.setRarita((oggettoEntity.getRarita()));
            if(oggettoEntity.getValoreRarita()!=null)dto.setValoreRarita(oggettoEntity.getValoreRarita());
        }
        return dto;
    }
}
