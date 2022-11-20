package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ChestDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;

public class ArmiMapper {

    public static ArmiDto entityToDto(ArmiEntity a){
        ArmiDto dto= new ArmiDto();



        if(a!=null) {
            if (a.getIdArmi() != null) dto.setIdArmi(a.getIdArmi());
            if (a.getDescrizione()!=null) dto.setDescrizione(a.getDescrizione());
            if (a.getName()!=null)dto.setName(a.getName());
            if (a.getArmaADistanza() != null) {
                dto.setArmaADistanza((a.getArmaADistanza()));
            }
            if (a.getDannoTipo() != null) {
                dto.setDannoTipo((a.getDannoTipo()));
            }
            if (a.getDanno() != null) {
                dto.setDanno((a.getDanno()));
            }
            if (a.getGittata() != null) {
                dto.setGittata((a.getGittata()));
            }
            if(a.getMoltiplicatoreCritico()!=null)dto.setMoltiplicatoreCritico(a.getMoltiplicatoreCritico());
            if(a.getProbabilitaCriticoArma()!=null)
            if(a.getRarita()!=null)dto.setRarita(a.getRarita());
            if(a.getValoreRarita()!=null)dto.setValoreRarita(a.getValoreRarita());
            if(a.getLivello()!=null)dto.setLivello(a.getLivello());
            return dto;
        }

        return null;
    }

    public static ArmiEntity dtoToEntity(ArmiDto dto){
        ArmiEntity a= new ArmiEntity();
        if(dto!=null){

            if(dto.getIdArmi()!=null)a.setIdArmi(dto.getIdArmi());
            if(dto.getDescrizione()!=null)a.setDescrizione(dto.getDescrizione());
            if(dto.getName()!=null)a.setName(dto.getName());
            }
            if(dto.getArmaADistanza()!=null){
                a.setArmaADistanza((dto.getArmaADistanza()));
            }
            if(dto.getDannoTipo()!=null){
                a.setDannoTipo((dto.getDannoTipo()));
            }
            if(dto.getDanno()!=null){
                a.setDanno((dto.getDanno()));
            }
            if(dto.getGittata()!=null){
                a.setGittata(dto.getGittata());
            }
            if(dto.getMoltiplicatoreCritico()!=null){
                a.setMoltiplicatoreCritico(dto.getMoltiplicatoreCritico());
            }
            if(dto.getProbabilitaCriticoArma()!=null)a.setProbabilitaCriticoArma(dto.getProbabilitaCriticoArma());
            if(dto.getRarita()!=null)a.setRarita(dto.getRarita());
            if(dto.getValoreRarita()!=null)a.setValoreRarita(dto.getValoreRarita());
            if(dto.getLivello()!=null)a.setLivello(dto.getLivello());





        return a;
    }
    public static ArmiEntity dtoUpdateEntity(ArmiDto dto,ArmiEntity a){
        if(dto!=null){

            if(dto.getIdArmi()!=null)a.setIdArmi(dto.getIdArmi());
            if(dto.getDescrizione()!=null)a.setDescrizione(dto.getDescrizione());
            if(dto.getName()!=null)a.setName(dto.getName());
            }
            if(dto.getArmaADistanza()!=null){
                a.setArmaADistanza((dto.getArmaADistanza()));
            }
            if(dto.getDannoTipo()!=null){
                a.setDannoTipo((dto.getDannoTipo()));
            }
            if(dto.getDanno()!=null){
                a.setDanno((dto.getDanno()));
            }
            if(dto.getGittata()!=null){
                a.setGittata(dto.getGittata());
            }
            if(dto.getMoltiplicatoreCritico()!=null){
                a.setMoltiplicatoreCritico(dto.getMoltiplicatoreCritico());
            }
            if(dto.getProbabilitaCriticoArma()!=null)a.setProbabilitaCriticoArma(dto.getProbabilitaCriticoArma());
            if(dto.getRarita()!=null)a.setRarita(dto.getRarita());
            if(dto.getValoreRarita()!=null)a.setValoreRarita(dto.getValoreRarita());
            if(dto.getLivello()!=null)a.setLivello(dto.getLivello());





        return a;
    }





}
