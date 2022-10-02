package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ArmiDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
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

    public static ArmiNewJSONreq dtoToReq(ArmiDto armiDto){

        ArmiNewJSONreq armiNewJSONreq = new ArmiNewJSONreq();

        if(armiDto.getIdArmi()!=null){
            armiNewJSONreq.setIdArmi((armiDto.getIdArmi()));
        }
        if(armiDto.getDescrizione()!=null){
            armiNewJSONreq.setDescrizione((armiDto.getDescrizione()));
        }
        if(armiDto.getName()!=null){
            armiNewJSONreq.setName((armiDto.getName()));
        }
        if(armiDto.getArmaADistanza()!=null){
            armiNewJSONreq.setArmaADistanza((armiDto.getArmaADistanza()));
        }
        if(armiDto.getDannoTipo()!=null){
            armiNewJSONreq.setDannoTipo((armiDto.getDannoTipo()));
        }
        if(armiDto.getDanno()!=null){
            armiNewJSONreq.setDanno((armiDto.getDanno()));
        }
        if(armiDto.getGittata()!=null){
            armiNewJSONreq.setGittata((armiDto.getGittata()));
        }
        if(armiDto.getMoltiplicatoreCritico()!=null){
            armiNewJSONreq.setMoltiplicatoreCritico((armiDto.getMoltiplicatoreCritico()));
        }
        if(armiDto.getProbabilitaAttaccoMultiplo()!=null){
            armiNewJSONreq.setProbabilitaCriticoArma((armiDto.getProbabilitaAttaccoMultiplo()));
        }
        if(armiDto.getAttaccoMultiplo()!=null){
            armiNewJSONreq.setAttaccoMultiplo(armiDto.getAttaccoMultiplo());
        }
        if(armiDto.getProbabilitaAttaccoMultiplo()!=null){
            armiNewJSONreq.setProbabilitaAttaccoMultiplo(armiDto.getProbabilitaAttaccoMultiplo());
        }
        if(armiDto.getBase()<=0){
            armiNewJSONreq.setBase(armiDto.getBase());
        }
        if(armiDto.getAltezza()<=0){
            armiNewJSONreq.setAltezza(armiDto.getAltezza());
        }
        if(armiDto.getPeso()<=0){
            armiNewJSONreq.setPeso(armiDto.getPeso());
        }

        armiNewJSONreq.setOggettoMagico(armiDto.getOggettoMagico());

        if(armiDto.getRarita()!=null){
            armiNewJSONreq.setRarita(armiDto.getRarita());
        }



        return armiNewJSONreq;
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
            if (dto.getIdArmi() != null) {


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
