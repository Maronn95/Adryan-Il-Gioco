package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONtests;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

import static java.nio.file.StandardOpenOption.CREATE;
import static org.springframework.util.SerializationUtils.serialize;

@Service
public class JSONtest {





    public JSONObject loadData() throws IOException, ParseException {
        //JSONParser ioParso = new JSONParser();
        Object sonoDentro = new JSONParser().parse(new FileReader("C:\\Users\\Utente\\IdeaProjects\\Adryan-Il-Gioco\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONtests\\JSONFile.JSON"));
        JSONObject jsonObject = JSONtest.printData(sonoDentro);
        return jsonObject;

    }

    private static JSONObject printData(Object sonoDentro) throws IOException {
        JSONObject JSON = (JSONObject)sonoDentro;
        Iterator iSpin = JSON.values().iterator();
        while (iSpin.hasNext()){

            Object JSONSequenceObject  = iSpin.next();
            Integer JSONSequence = Integer.valueOf(JSONSequenceObject.toString());
            JSONSequence = JSONSequence+1;

            System.out.println(JSONSequence);

            //gestione path impostazione sequence generica
            Path path = Paths.get("C:\\ciao\\jhbbuh\\Nuova cartella\\TEST0"+JSONSequence+"JSON.JSON");

            JSONObject newSettings = JSON;
            newSettings.replace("JSONSequence", JSONSequence );
            Path pathSettings = Paths.get("C:\\Users\\Utente\\IdeaProjects\\Adryan-Il-Gioco\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONtests\\JSONFile.JSON");
            String JSONSetting = newSettings.toString();
            Files.write(pathSettings, JSONSetting.getBytes());

            String JSONString = "{ciao io sono il numero"+ JSONSequence+"}";
            Files.write(path, JSONString.getBytes());

        }
        return JSON;

    }
    private static JSONObject creaPg (Object sonoDentro) throws IOException, ParseException {

        Object Impostazioni = new JSONParser().parse(new FileReader("C:\\Users\\Utente\\IdeaProjects\\Adryan-Il-Gioco\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONtests\\JSONFile.JSON"));
        JSONObject JSONImpostazioni = (JSONObject) Impostazioni;
        Iterator iSpin = JSONImpostazioni.values().iterator();
        while (iSpin.hasNext()){

            // prendo e aggiorno la sequence
            Object JSONSequenceObject  = iSpin.next();
            Integer JSONSequence = Integer.valueOf(JSONSequenceObject.toString());
            JSONSequence = JSONSequence+1;
            System.out.println(JSONSequence);

            // prendo la nuova sequence e la salvo
            JSONObject newSettings = JSONImpostazioni;
            newSettings.replace("JSONSequence", JSONSequence );
            Path pathSettings = Paths.get("C:\\Users\\Utente\\IdeaProjects\\Adryan-Il-Gioco\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONtests\\JSONFile.JSON");
            String JSONSetting = newSettings.toString();
            Files.write(pathSettings, JSONSetting.getBytes());

            // aggiungo l'id al nuovo pg e lo salvo con name directory dinamica
            JSONObject JSONObjPg = (JSONObject)sonoDentro;
            Path path = Paths.get("C:\\Users\\Utente\\IdeaProjects\\Adryan-Il-Gioco\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONtests\\PG"+JSONSequence+"JSON.JSON");
            JSONObjPg.put("idPg: ",JSONSequence);
            String JSONString = JSONObjPg.toString();
            Files.write(path, JSONString.getBytes());

            return JSONObjPg;
        }
        return null;
    }

    private JSONObject saveData(JSONObject JSON) throws IOException {

        Path path = Paths.get("C:\\ciao\\jhbbuh\\Nuova cartella\\TEST1.JSON");

        String JSONString = JSON.toString();

        Files.write(path, JSONString.getBytes());

        return JSON;

    }
}
