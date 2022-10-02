package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;

public class ArmiMapper {

    public static ArmiDto entityToDto(ArmiEntity a){
        ArmiDto dto= new ArmiDto();

            if(a.getArmaADistanza()!=null){
                dto.setArmaADistanza((a.getArmaADistanza()));
            }
            if(a.getDannoTipo()!=null){
                dto.setDannoTipo((a.getDannoTipo()));
            }
            if(a.getDanno()!=null){
                dto.setDanno((a.getDanno()));
            }
            if(a.getGittata()!=null){
                dto.setGittata((a.getGittata()));
            }


        return null;
    }

    public static ArmiEntity dtoToEntity(ArmiDto dto){
        ArmiEntity a= new ArmiEntity();
        if(dto!=null){
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





        return a;
    }

    public static ArmiEntity dtoUpdateEntity(ArmiDto dto) {
        ArmiEntity A= new ArmiEntity();
        if(dto!=null){
            if (dto.getArmiId() != null) {
                if(dto.getArmaADistanza()!=null)A.setArmaADistanza(dto.getArmaADistanza());
                if(dto.getDannoTipo()!=null)A.setDannoTipo((dto.getDannoTipo()));
                if(dto.getDanno()!=null)A.setDanno((dto.getDanno()));
                if(dto.getGittata()!=null)A.setGittata((dto.getGittata()));
                if(dto.getMoltiplicatoreCritico()!=null)A.setMoltiplicatoreCritico((dto.getMoltiplicatoreCritico()));
                return A;
            }
        }
        return null;
    }
}
