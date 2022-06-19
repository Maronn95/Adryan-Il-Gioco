package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public interface  JSONrepository <entityClass> {

     entityClass selectById(Integer idJSONreq) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException;

     entityClass creates(entityClass entity) throws IOException, ParseException;

}
