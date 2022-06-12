package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.data.annotation.Transient;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Map;

@Repository
public class JSONcrudRepository <Req, Resp> implements JSONrepository<Req, Resp> {

    String loc = System.getProperty("user.dir");
    final String tablePgPath = loc + "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONpg\\";
    final String tableArmiPath = loc + "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONarmi\\";



    public  Resp selectById(Integer idJSONreq, Resp jsonResp, String table) throws IOException, ParseException {


        String selectedPathString = this.getThisTablePath(table)+table+idJSONreq + ".JSON";
        Path pathSelected = Paths.get(selectedPathString);

        Object selectedObj = new JSONParser().parse(new FileReader(String.valueOf(pathSelected)));

        Resp JSONresp = (Resp) new ObjectMapper().readValue(selectedObj.toString(), jsonResp.getClass());


        return JSONresp;

    }


    public  Resp creates(Req JsonReq, Resp JsonResp, String table) throws IOException, ParseException {
        String pathNew = this.getThisTablePath(table);
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(JsonReq, Map.class);
        JSONObject newJSON = new JSONObject(map);
        int jSeq = this.addSeq(table);
        pathNew += table + jSeq + ".JSON";
        newJSON.put("id" + table, jSeq);
        String JSONString1 = newJSON.toJSONString();
        Files.write(Path.of(pathNew), JSONString1.getBytes());
        Resp JSONresp = (Resp) oMapper.readValue(JSONString1, JsonResp.getClass());
        return JSONresp;
    }

    private String getThisTablePath(String table) {
        String pathNew = new String();
        switch (table) {
            case "PG":
                pathNew = this.tablePgPath;
                break;
            case "Armi":
                pathNew = this.tableArmiPath;
                break;
            default:
                break;
        }
        return pathNew;
    }

    private Integer addSeq(String table) throws IOException, ParseException {

        String pathSeq = getThisTablePath(table)+"JSONSequence"+table+".JSON";
        Path pathSettings = Paths.get(pathSeq);

        Object Impostazioni = new JSONParser().parse(new FileReader(String.valueOf(pathSettings))); // apro il json di sequence come oggetto
        JSONObject JSONImpostazioni = (JSONObject) Impostazioni;
        Iterator iSpin = JSONImpostazioni.values().iterator();
        while (iSpin.hasNext()) {

            // prendo la vecchia e aggiorno la nuova sequence
            Object JSONSequenceObject = iSpin.next();
            Integer JSONSequence = Integer.valueOf(JSONSequenceObject.toString()); // oggetto di ritorno
            int newJSONSequence = JSONSequence + 1;

            // prendo la nuova sequence e la salvo
            JSONObject newSettings = JSONImpostazioni;
            newSettings.replace("JSONSequence", newJSONSequence);
            String JSONSetting = JSONImpostazioni.toString();
            Files.write(pathSettings, JSONSetting.getBytes());

            return JSONSequence;
        }
        return null;
    }
}


