package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiBattlegroundEntityDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiInventarioDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;
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
            if(OI.getDimensioneInventario()!=null){
                dto.setDimensioneInventario((OI.getDimensioneInventario()));
            }
            if(OI.getOggettoMagico()!=null){
                dto.setOggettoMagico(OI.getOggettoMagico());

             if(OI.getRarita()!=null){
                 dto.setRarita(OI.getRarita());
             }
             if(OI.getArma()!=null){
                 dto.setArmaId(OI.getArma().getArmiId());
             }
             if(OI.getProtezioneIndossabile()!=null){
                 dto.setProtezioneIndossabileId(OI.getProtezioneIndossabile().getProtezioneIndossabileId());
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
            if (dto.getDimensioneInventario() != null) {
                OIE.setDimensioneInventario((dto.getDimensioneInventario()));
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
                if(dto.getDimensioneInventario()!=null)OIE.setDimensioneInventario((dto.getDimensioneInventario()));
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
