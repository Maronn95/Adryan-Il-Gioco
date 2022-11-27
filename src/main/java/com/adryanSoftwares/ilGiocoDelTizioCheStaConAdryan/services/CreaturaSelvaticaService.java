package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.CreaturaSelvaticaNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.CreaturaSelvaticaNewJSONresp;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface CreaturaSelvaticaService {

    CreaturaSelvaticaNewJSONresp create(CreaturaSelvaticaNewJSONreq creaturaSelvaticaReq) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    CreaturaSelvaticaNewJSONresp select(Integer idCreaturaSelvatica) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException;

    CreaturaSelvaticaNewJSONresp delete (Integer idCreaturaSelvatica) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    CreaturaSelvaticaNewJSONresp update(CreaturaSelvaticaNewJSONreq creaturaSelvaticaNewJSONreq) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;
}
