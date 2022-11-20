package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettoInventarioDto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettoInventarioRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.OggettoInventarioService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
@Service
public class OggettoInventarioServiceImpl implements OggettoInventarioService {

    @Autowired
    OggettoInventarioRepository oggettoInventarioRepository;

    @Override
    public OggettoInventarioDto getOggettoInventario(Integer id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return (OggettoInventarioDto) oggettoInventarioRepository.selectById(Math.toIntExact(id)) ;
    }

    @Override
    public OggettoInventarioDto createOggettoInventario(OggettoInventarioDto entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettoInventarioDto) oggettoInventarioRepository.creates(entity);
    }

    @Override
    public OggettoInventarioDto updateOggettoInventario(OggettoInventarioDto entity) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (OggettoInventarioDto) oggettoInventarioRepository.update(entity);
    }

    @Override
    public void deleteOggettoInventario(Integer id) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        oggettoInventarioRepository.delete(Math.toIntExact(id));
    }
}
