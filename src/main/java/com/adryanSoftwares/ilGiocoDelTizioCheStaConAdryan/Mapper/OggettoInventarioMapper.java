package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventarioEntity;

 public class OggettoInventarioMapper {

    public static OggettoInventarioDto entityToDto(OggettoInventarioEntity OI){
        OggettoInventarioDto dto= new OggettoInventarioDto();
        if(OI!=null){

            }
            if(OI.getDescrizione()!=null){
                dto.setDescrizione(OI.getDescrizione());
            }
            if(OI.getBase()!=null){
                dto.setBase(OI.getBase());
        }
            if(OI.getAltezza()!=null){
                dto.setAltezza(OI.getAltezza());
            }
            if(OI.getPeso()!=null) {
                dto.setPeso(OI.getPeso());
            }

            if(OI.getOggettoMagico()!=null){
                dto.setOggettoMagico(OI.getOggettoMagico());

             if(OI.getRarita()!=null){
                 dto.setRarita(OI.getRarita());
             }

            }

        return dto;
        }



    public static OggettoInventarioEntity dtoToEntity(OggettoInventarioDto dto) {
        OggettoInventarioEntity OIE = new OggettoInventarioEntity();
        if (dto != null) {
            OIE.setOggettoInventarioid(dto.getOggettoInventarioid());

            if (dto.getBase() != null) {
                OIE.setBase(dto.getBase());
            }
            if (dto.getAltezza() != null) {
                OIE.setAltezza(dto.getAltezza());
            }


            if (dto.getDescrizione() != null) {
                OIE.setDescrizione(dto.getDescrizione());
            }
            if (dto.getPeso() != null) {
                OIE.setPeso(dto.getPeso());
            }

            if (dto.getOggettoMagico() != null) {
                OIE.setOggettoMagico(dto.getOggettoMagico());
            }
            if (dto.getRarita() != null) {
                OIE.setRarita(dto.getRarita());
            }

            return OIE;
        }
        return null;
    }


        public static OggettoInventarioEntity dtoUpdateEntity (OggettoInventarioDto dto){
            OggettoInventarioEntity OIE = new OggettoInventarioEntity();
            if (dto != null) {

                if (dto.getDescrizione() != null) OIE.setDescrizione(dto.getDescrizione());
                if (dto.getBase() != null) OIE.setBase(dto.getBase());
                if (dto.getAltezza() != null) OIE.setAltezza(dto.getAltezza());
                if (dto.getPeso() != null) OIE.setPeso(dto.getPeso());
                if (dto.getOggettoMagico() != null) OIE.setOggettoMagico(dto.getOggettoMagico());
                if (dto.getRarita() != null) {
                    OIE.setRarita(dto.getRarita());
                }

                return OIE;
            }
            return null;
        }
    }



