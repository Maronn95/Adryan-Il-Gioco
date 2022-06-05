package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;

public class ArmiMapper {

    public static ArmiDto entityToDto(Armi a){
        ArmiDto dto= new ArmiDto();


            if(a.getDescrizione()!=null){
                dto.setDescrizione(a.getDescrizione());
            }

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

    public static Armi dtoToEntity(ArmiDto dto){
        Armi a= new Armi();
        if(dto!=null){

            if(dto.getDescrizione()!=null){
                a.setDescrizione(dto.getDescrizione());
            }

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

    public static Armi dtoUpdateEntity(ArmiDto dto) {
        Armi A= new Armi();
        if(dto!=null){
            if (dto.getArmiId() != null) {

                if(dto.getDescrizione()!=null)A.setDescrizione(dto.getDescrizione());
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
