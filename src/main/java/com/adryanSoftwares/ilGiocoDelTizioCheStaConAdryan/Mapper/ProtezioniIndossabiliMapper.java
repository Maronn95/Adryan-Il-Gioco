package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ProtezioniIndossabiliDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabili;

public class ProtezioniIndossabiliMapper {

    public static ProtezioniIndossabiliDto entityToDto(ProtezioniIndossabili a){

        ProtezioniIndossabiliDto dto= new ProtezioniIndossabiliDto();
        if(a.getProtezioneIndossabileId()!=null)dto.setProtezioniIndossabiliId(a.getProtezioneIndossabileId());

        if(a.getDescrizione()!=null)dto.setDescrizione(a.getDescrizione());

        if(a.getOggettoMagico()!=null)dto.setOggettoMagico(a.getOggettoMagico());

        if(a.getEfd()!=null)dto.setEfd(a.getEfd());

        if(a.getLocazione()!=null)dto.setLocazione(a.getLocazione());

        if(a.getValoreProtettivo()!=null)dto.setValoreProtettivo(a.getValoreProtettivo());

        if(a.getDurabilita()!=null)dto.setDurabilita(a.getDurabilita());

        return dto;

    }

    public static ProtezioniIndossabili dtoToEntity (ProtezioniIndossabiliDto dto){
        ProtezioniIndossabili a=new ProtezioniIndossabili();

        if(dto.getDescrizione()!=null)a.setDescrizione(dto.getDescrizione());

        if(dto.getOggettoMagico()!=null)a.setOggettoMagico(dto.getOggettoMagico());

        if(dto.getEfd()!=null)a.setEfd(dto.getEfd());

        if(dto.getLocazione()!=null)a.setLocazione(dto.getLocazione());

        if(dto.getValoreProtettivo()!=null)a.setValoreProtettivo(dto.getValoreProtettivo());

        if(dto.getDurabilita()!=null)a.setDurabilita(dto.getDurabilita());

        return a;
    }

    public static ProtezioniIndossabili dtoUpdateEntity(ProtezioniIndossabiliDto dto){
        ProtezioniIndossabili a=new ProtezioniIndossabili();

        if(dto.getProtezioniIndossabiliId()!=null) a.setProtezioneIndossabileId(dto.getProtezioniIndossabiliId());

        if(dto.getDescrizione()!=null)a.setDescrizione(dto.getDescrizione());

        if(dto.getOggettoMagico()!=null)a.setOggettoMagico(dto.getOggettoMagico());

        if(dto.getEfd()!=null)a.setEfd(dto.getEfd());

        if(dto.getLocazione()!=null)a.setLocazione(dto.getLocazione());

        if(dto.getValoreProtettivo()!=null)a.setValoreProtettivo(dto.getValoreProtettivo());

        if(dto.getDurabilita()!=null)a.setDurabilita(dto.getDurabilita());

        return a;    }


}
