package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ProtezioniIndossabiliDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabiliEntity;

public class ProtezioniIndossabiliMapper {

    public static ProtezioniIndossabiliDTO entityToDto(ProtezioniIndossabiliEntity a){

        ProtezioniIndossabiliDTO dto= new ProtezioniIndossabiliDTO();
        if(a.getIdProtezioniIndossabili()!=null)dto.setIdProtezioniIndossabili(a.getIdProtezioniIndossabili());

        if(a.getNome()!=null)dto.setNome(a.getNome());

        if(a.getDescrizione()!=null)dto.setDescrizione(a.getDescrizione());

        if(a.getEfd()!=null)dto.setEfd(a.getEfd());

        if(a.getLocazione()!=null)dto.setLocazione(a.getLocazione());

        if(a.getValoreProtettivo()!=null)dto.setValoreProtettivo(a.getValoreProtettivo());

        if(a.getDurabilita()!=null)dto.setDurabilita(a.getDurabilita());

        return dto;

    }

    public static ProtezioniIndossabiliEntity dtoToEntity (ProtezioniIndossabiliDTO dto){
        ProtezioniIndossabiliEntity a=new ProtezioniIndossabiliEntity();

        if(dto.getIdProtezioniIndossabili()!=null)a.setIdProtezioniIndossabili(dto.getIdProtezioniIndossabili());

        if(dto.getNome()!=null)a.setNome(dto.getNome());

        if(dto.getDescrizione()!=null)a.setDescrizione(dto.getDescrizione());

        if(dto.getEfd()!=null)a.setEfd(dto.getEfd());

        if(dto.getLocazione()!=null)a.setLocazione(dto.getLocazione());

        if(dto.getValoreProtettivo()!=null)a.setValoreProtettivo(dto.getValoreProtettivo());

        if(dto.getDurabilita()!=null)a.setDurabilita(dto.getDurabilita());

        return a;
    }

    public static ProtezioniIndossabiliEntity dtoUpdateEntity (ProtezioniIndossabiliDTO dto, ProtezioniIndossabiliEntity a){


        if(dto.getIdProtezioniIndossabili()!=null)a.setIdProtezioniIndossabili(dto.getIdProtezioniIndossabili());

        if(dto.getNome()!=null)a.setNome(dto.getNome());

        if(dto.getDescrizione()!=null)a.setDescrizione(dto.getDescrizione());

        if(dto.getEfd()!=null)a.setEfd(dto.getEfd());

        if(dto.getLocazione()!=null)a.setLocazione(dto.getLocazione());

        if(dto.getValoreProtettivo()!=null)a.setValoreProtettivo(dto.getValoreProtettivo());

        if(dto.getDurabilita()!=null)a.setDurabilita(dto.getDurabilita());

        return a;
    }




}
