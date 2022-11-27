package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.AvanzamentoStattsPureNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.AvanzamentoStattsPureNewJSONresp;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface AvanzamentoStattsPureService {

   // AvanzamentoStattsPureEntity updateAvanzamentoStattsPure (AvanzamentoStattsPureEntity avanzamentoStattsPureEntity) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    AvanzamentoStattsPureNewJSONresp newAvanzamentoStattsPure(AvanzamentoStattsPureNewJSONreq entityRequest) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    AvanzamentoStattsPureNewJSONresp selectAvanzamentoStattsPure( Integer idAvanzamentoStattsPure) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException;

    AvanzamentoStattsPureNewJSONresp deleteAvanzamentoStattsPure ( Integer idAvanzamentoStattsPure) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    AvanzamentoStattsPureNewJSONresp updateAvanzamentoStattsPure(AvanzamentoStattsPureNewJSONreq pgJSON) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;


}
