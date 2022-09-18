package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoInventarioDto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoInventarioMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettoInventarioRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventarioEntity;
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



    @Override
    public OggettoInventarioDto getOggettoInventario(Long id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
       OggettoInventarioDto dto;
       dto= (OggettoInventarioDto) OIR.selectById(Math.toIntExact(id));
        return dto ;
    }

    @Override
    public OggettoInventarioDto createOggettoInventario(OggettoInventarioDto entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettoInventarioEntity oggetto;
        oggetto= OggettoInventarioMapper.dtoToEntity(entity);
        OIR.creates(oggetto);
        return  OggettoInventarioMapper.entityToDto(oggetto);
    }

    @Override
    public OggettoInventarioDto updateOggettoInventario(OggettoInventarioDto entity) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OggettoInventarioEntity oggetto;
        oggetto= OggettoInventarioMapper.dtoToEntity(entity);
       OIR.update(oggetto);
        return OggettoInventarioMapper.entityToDto(oggetto);
    }

    @Override
    public void deleteOggettoInventario(Long id) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        OIR.delete(Math.toIntExact(id));

    }
}
