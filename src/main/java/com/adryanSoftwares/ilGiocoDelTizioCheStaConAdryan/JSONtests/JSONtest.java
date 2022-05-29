package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONtests;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

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


    public static JSONObject creaPg (JSONObject JSONObjPg) throws IOException, ParseException {

        //test
        StattsPureDTO statDto = (StattsPureDTO) JSONObjPg.get("statistichePure");
        System.out.println(statDto.getStattsCalcDto().getca());


        //int jSeq = new JSONrepo().addSeq("PG");
        Path path = Paths.get("C:\\Users\\Utente\\IdeaProjects\\Adryan-Il-Gioco\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONtests\\PGON.JSON");
       // JSONObjPg.put("idPg: ",jSeq);
        String JSONString = JSONObjPg.toString();
        Files.write(path, JSONString.getBytes());

        return JSONObjPg;

    }

    private JSONObject saveData(JSONObject JSON) throws IOException {

        Path path = Paths.get("C:\\ciao\\jhbbuh\\Nuova cartella\\TEST1.JSON");

        String JSONString = JSON.toString();

        Files.write(path, JSONString.getBytes());

        return JSON;

    }
}
