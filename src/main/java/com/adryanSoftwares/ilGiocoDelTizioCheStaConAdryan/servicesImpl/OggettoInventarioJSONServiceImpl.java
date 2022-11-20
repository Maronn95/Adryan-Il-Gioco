package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoInventarioDto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettiBattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoInventarioMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettoInventarioRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ProtezioniIndossabiliRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.*;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettoInventarioJSONService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
@Service
public class OggettoInventarioJSONServiceImpl implements OggettoInventarioJSONService {

    @Autowired
    OggettoInventarioRepository OIR;

    @Autowired
    ArmiRepository armiRepository;

    @Autowired
    ProtezioniIndossabiliRepository protezioniIndossabiliRepository;

    @Autowired
    OggettiRepository oggettiRepository;



    @Override
    public OggettoInventarioEntity getOggettoInventario(Integer id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        OggettoInventarioEntity oggetto;
       oggetto= (OggettoInventarioEntity) OIR.selectById(id);
        return oggetto ;
    }

    @Override
    public OggettoInventarioEntity createOggettoInventario(OggettoInventarioDto dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettoInventarioEntity oggetto = OggettoInventarioMapper.dtoToEntity(dto);


        if(dto.getIdArmi()!=null){
            oggetto.setArmiEntity((ArmiEntity) armiRepository.selectById(dto.getIdArmi()));}
        if(dto.getIdProtezione()!=null){
            oggetto.setProtezioniIndossabiliEntity((ProtezioniIndossabiliEntity)protezioniIndossabiliRepository.selectById(dto.getIdProtezione()) );
        }
        if(dto.getIdOggetto()!=null){
            oggetto.setOggettiEntity((OggettiEntity)oggettiRepository.selectById(dto.getIdOggetto()));
        }
        return (OggettoInventarioEntity) OIR.creates(oggetto);
    }

    @Override
    public OggettoInventarioEntity updateOggettoInventario(OggettoInventarioDto entity) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettoInventarioEntity oggetto;
        oggetto= OggettoInventarioMapper.dtoToEntity(entity);

        return (OggettoInventarioEntity) OIR.update(oggetto);
    }

    @Override
    public void deleteOggettoInventario(Integer id) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OIR.delete(id);

    }
}
