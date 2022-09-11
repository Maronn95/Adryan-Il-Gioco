package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface PgAzioniOffensiveJSONService {

    List<Integer> fendenteLeggero (Integer idPg1,  Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

    List<Integer> fendentePesante (Integer idPg1,  Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

}
