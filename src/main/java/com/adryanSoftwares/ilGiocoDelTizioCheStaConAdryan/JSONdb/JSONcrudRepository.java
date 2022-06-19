package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

@Repository
public class JSONcrudRepository <entityClass>   {

    String loc = System.getProperty("user.dir");

    public  entityClass selectById(JSONtoken jTok, Integer idJSONreq) throws IOException, ParseException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String selectedPathString = loc+jTok.getPath()+jTok.getTable()+idJSONreq+".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        Object selectedObj = new JSONParser().parse(new FileReader(String.valueOf(pathSelected)));
        entityClass entity = (entityClass) new ObjectMapper().readValue(selectedObj.toString(),jTok.getEntityClass());

        return entity;
    }


    public entityClass creates(JSONtoken jTok, entityClass entity) throws IOException, ParseException {

        String dbPath = loc+jTok.getPath()+jTok.getTable();
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(entity, Map.class);

        JSONObject newJSON = new JSONObject(map);
        newJSON = cleanJSONentity(newJSON);

        int jSeq = this.addSeq(jTok);
        dbPath += jSeq +".JSON";
        newJSON.put("id" + jTok.getTable(), jSeq);

        ObjectMapper objectMapper = new ObjectMapper();
        String JSONString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);

        Files.write(Path.of(dbPath), JSONString.getBytes());

        entityClass newEntity = (entityClass) oMapper.readValue(JSONString, jTok.getEntityClass());

        return newEntity;
    }

    private JSONObject cleanJSONentity(JSONObject dirtyJson) {

        dirtyJson.remove("resp");
        dirtyJson.remove("table");
        dirtyJson.remove("path");
        dirtyJson.remove("req");

        dirtyJson = cleanNullToo(dirtyJson);
        return dirtyJson;
    }

    private JSONObject cleanNullToo(JSONObject dirtyJson) {
        Iterator iSpinK = dirtyJson.keySet().iterator();
        Iterator iSpinV = dirtyJson.values().iterator();
        ArrayList<String> nulls = new ArrayList<>();
        while (iSpinK.hasNext() && iSpinV.hasNext()) {

            Object key =  iSpinK.next();
            Object value =  iSpinV.next();

            if (null == value){
                nulls.add(String.valueOf(key));
            }
        }

        for (String nullKey : nulls) {
            dirtyJson.remove(nullKey);
        }
        return dirtyJson;
    }


    public JSONtoken newToken(Object entity) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
         JSONtoken jToken = new JSONtoken(entity);
         return  jToken;
    }

  private Integer addSeq(JSONtoken jTok) throws IOException, ParseException {

        String pathSeq = loc+jTok.getPath()+"JSONSequence"+jTok.getTable()+".JSON";
        Path pathSettings = Paths.get(pathSeq);

        Object Impostazioni = new JSONParser().parse(new FileReader(String.valueOf(pathSettings))); // apro il json di sequence come oggetto
        JSONObject JSONImpostazioni = (JSONObject) Impostazioni;
        Iterator iSpin = JSONImpostazioni.values().iterator();
        while (iSpin.hasNext()) {

            Object JSONSequenceObject = iSpin.next();
            Integer JSONSequence = Integer.valueOf(JSONSequenceObject.toString());
            int newJSONSequence = JSONSequence + 1;

            JSONObject newSettings = JSONImpostazioni;
            newSettings.replace("JSONSequence", newJSONSequence);
            String JSONSetting = JSONImpostazioni.toString();

            Files.write(pathSettings, JSONSetting.getBytes());

            return JSONSequence;
        }
        return null;
    }
}


