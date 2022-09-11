package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ProtezioniIndossabiliDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabiliEntity;

public class ProtezioniIndossabiliMapper {

    public static ProtezioniIndossabiliDto entityToDto(ProtezioniIndossabiliEntity a){

        ProtezioniIndossabiliDto dto= new ProtezioniIndossabiliDto();
        if(a.getProtezioneIndossabileId()!=null)dto.setProtezioniIndossabiliId(a.getProtezioneIndossabileId());



        if(a.getEfd()!=null)dto.setEfd(a.getEfd());

        if(a.getLocazione()!=null)dto.setLocazione(a.getLocazione());

        if(a.getValoreProtettivo()!=null)dto.setValoreProtettivo(a.getValoreProtettivo());

        if(a.getDurabilita()!=null)dto.setDurabilita(a.getDurabilita());

        return dto;

    }

    public static ProtezioniIndossabiliEntity dtoToEntity (ProtezioniIndossabiliDto dto){
        ProtezioniIndossabiliEntity a=new ProtezioniIndossabiliEntity();



        if(dto.getEfd()!=null)a.setEfd(dto.getEfd());

        if(dto.getLocazione()!=null)a.setLocazione(dto.getLocazione());

        if(dto.getValoreProtettivo()!=null)a.setValoreProtettivo(dto.getValoreProtettivo());

        if(dto.getDurabilita()!=null)a.setDurabilita(dto.getDurabilita());

        return a;
    }

    public static ProtezioniIndossabiliEntity dtoUpdateEntity(ProtezioniIndossabiliDto dto){
        ProtezioniIndossabiliEntity a=new ProtezioniIndossabiliEntity();

        if(dto.getProtezioniIndossabiliId()!=null) a.setProtezioneIndossabileId(dto.getProtezioniIndossabiliId());

      

        if(dto.getEfd()!=null)a.setEfd(dto.getEfd());

        if(dto.getLocazione()!=null)a.setLocazione(dto.getLocazione());

        if(dto.getValoreProtettivo()!=null)a.setValoreProtettivo(dto.getValoreProtettivo());

        if(dto.getDurabilita()!=null)a.setDurabilita(dto.getDurabilita());

        return a;
    }

}
