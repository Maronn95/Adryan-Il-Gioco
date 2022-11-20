package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.InventarioEquipaggiatoNewJSONresp;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface InventarioEquipaggiatoService {

    InventarioEquipaggiatoNewJSONresp equipaggiaOggetto(Integer idPg, Integer oggettoDaEquipaggiare) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException;
}
