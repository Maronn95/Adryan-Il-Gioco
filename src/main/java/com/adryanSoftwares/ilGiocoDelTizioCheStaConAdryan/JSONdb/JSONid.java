package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class JSONid {

    public  JSONid(String table) throws IOException, ParseException {
        int value = new JSONcrudRepository().addSeq(table);
    }

}
