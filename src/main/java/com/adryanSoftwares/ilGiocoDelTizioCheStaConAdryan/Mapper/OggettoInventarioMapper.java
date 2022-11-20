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
            if(OI.getName()!=null){
                dto.setName(OI.getName());
            }

            if(OI.getOggettoMagico()!=null){
                dto.setOggettoMagico(OI.getOggettoMagico());

             if(OI.getRarita()!=null){
                 dto.setRarita(OI.getRarita());
             }
             if(OI.getValoreRarita()!=null){
                 dto.setValoreRarita(OI.getValoreRarita());
             }
             if(OI.getLivello()!=null){
                 dto.setLivello(OI.getLivello());
             }

            }

        return dto;
        }



    public static OggettoInventarioEntity dtoToEntity(OggettoInventarioDto dto) {
        OggettoInventarioEntity OIE = new OggettoInventarioEntity();
        if (dto != null) {
            OIE.setIdOggettoInventario(dto.getIdOggettoInventario());

            if (dto.getBase() != null) {
                OIE.setBase(dto.getBase());
            }
            if (dto.getAltezza() != null) {
                OIE.setAltezza(dto.getAltezza());
            }
            if (dto.getName() != null) {
                OIE.setName(dto.getName());
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
            if(dto.getValoreRarita()!=null){
                OIE.setValoreRarita(dto.getValoreRarita());
            }
            if(dto.getLivello()!=null){
                OIE.setLivello(dto.getLivello());
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



