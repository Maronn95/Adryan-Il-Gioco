package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.OggettiDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface OggettiService {

    OggettiEntity newOggetto(OggettiDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    OggettiEntity selectOggetto(Integer idPg) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException;

    OggettiEntity delete ( Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    OggettiEntity update(OggettiDTO dto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

}
