package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;

public class OggettiInventarioMapper {

    public static OggettiInventarioDto entityToDto(OggettoInventario OI){
        OggettiInventarioDto dto= new OggettiInventarioDto();
        if(OI!=null){
            if(OI.getOggettoInventarioid()!=null){
                dto.setOggettoInventarioId(OI.getOggettoInventarioid());
            }
            if(OI.getDescrizione()!=null){
                dto.setDescrizione(OI.getDescrizione());
            }

            if(OI.getOggettoMagico()!=null){
                dto.setOggettoMagico(OI.getOggettoMagico());

             if(OI.getRarita()!=null){
                 dto.setRarita(OI.getRarita());
             }

            }


        }
        return dto;
    }

    public static OggettoInventario dtoToEntity(OggettiInventarioDto dto) {
        OggettoInventario OIE = new OggettoInventario();
        if (dto != null) {
            if (OIE.getOggettoInventarioid() != null) {
                dto.setOggettoInventarioId(OIE.getOggettoInventarioid());
            }
            if (dto.getDescrizione() != null) {
                OIE.setDescrizione(dto.getDescrizione());
            }

            if (dto.getOggettoMagico() != null) {
                OIE.setOggettoMagico(dto.getOggettoMagico());
            }
            if (dto.getRarita() != null) {
                OIE.setRarita(dto.getRarita());
            }


        }
            return OIE;
        }


    public static OggettoInventario dtoUpdateEntity(OggettiInventarioDto dto) {
        OggettoInventario OIE= new OggettoInventario();
        if(dto!=null){
            if (dto.getOggettoInventarioId() != null) {
                OIE.setOggettoInventarioid(dto.getOggettoInventarioId());
                if(dto.getDescrizione()!=null)OIE.setDescrizione(dto.getDescrizione());
                if(dto.getOggettoMagico()!=null)OIE.setOggettoMagico(dto.getOggettoMagico());
                if(dto.getRarita()!=null){
                    OIE.setRarita(dto.getRarita());
                }

                return OIE;
            }
        }
        return null;
    }
}
