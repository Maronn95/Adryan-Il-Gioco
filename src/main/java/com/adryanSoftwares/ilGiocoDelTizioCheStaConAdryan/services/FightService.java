package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.MetodoB1DTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.FightNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.FightNewJSONresp;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface FightService {

    FightNewJSONresp metodoB1(MetodoB1DTO metodoB1DTO) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, InterruptedException;

    FightNewJSONresp newFight(FightNewJSONreq entityRequest) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    FightNewJSONresp selectFight( Integer idFight) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException;

    FightNewJSONresp delete ( Integer idFight) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    FightNewJSONresp update(FightNewJSONreq fightJSON) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;


}
