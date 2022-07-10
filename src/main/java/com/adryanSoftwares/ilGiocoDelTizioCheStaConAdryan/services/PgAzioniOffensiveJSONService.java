package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface PgAzioniOffensiveJSONService {

    int fendenteLeggero (Integer idPg1, Integer idPg2, Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

}
