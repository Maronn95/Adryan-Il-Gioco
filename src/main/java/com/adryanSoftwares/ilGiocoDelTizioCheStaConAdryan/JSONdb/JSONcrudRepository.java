package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Repository
public class JSONcrudRepository <entityClass>   {

    String loc = System.getProperty("user.dir");
    String path;
    String table;
    Class entityClass;


    public  entityClass selectById( Integer idJSONreq) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        this.getEntityCredentials();
        String selectedPathString = loc + this.path + this.table + idJSONreq +".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        Object selectedObj = new JSONParser().parse(new FileReader(String.valueOf(pathSelected)));
        entityClass entity = (entityClass) new ObjectMapper().readValue(selectedObj.toString(),this.entityClass);

        return entity;
    }

    public entityClass delete ( Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        this.getEntityCredentials();
        String selectedPathString = loc + this.path + this.table + id + ".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        JSONParser ioParso = new JSONParser();
        FileReader ioLeggo = new FileReader(String.valueOf(pathSelected));
        Object selectedObj = ioParso.parse(ioLeggo);
        entityClass entity = (entityClass) new ObjectMapper().readValue(selectedObj.toString(),this.entityClass);
        ioLeggo.close();
        Files.delete(pathSelected);
        return  entity;
    }
    public entityClass creates(entityClass entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        this.getEntityCredentials();
        String dbPath = loc + this.path + this.table;
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(entity, Map.class);

        JSONObject newJSON = new JSONObject(map);
        newJSON = JSONutils.cleanJSONentity(newJSON);

        //newJSON = this.handleForeignKeys(newJSON);

        int jSeq = this.addSeq();
        dbPath += jSeq +".JSON";
        newJSON.put("id" + this.table, jSeq);

        ObjectMapper objectMapper = new ObjectMapper();
        String JSONString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);

        Files.write(Path.of(dbPath), JSONString.getBytes());

        entityClass newEntity = (entityClass) oMapper.readValue(JSONString, this.entityClass);

        return newEntity;
    }

    public entityClass update (entityClass entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        this.getEntityCredentials();
        String getidEntity = "id"+ this.table;

        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(entity, Map.class);
        JSONObject oldJSON = new JSONObject(map);
        Iterator ioSpinno = oldJSON.keySet().iterator();
        while (ioSpinno.hasNext()){
            String key = String.valueOf(ioSpinno.next());
            System.out.println(key);
            if (key.toLowerCase().equals(getidEntity.toLowerCase())){
                getidEntity=String.valueOf(key);
            }
        }
        System.out.println(oldJSON.get(getidEntity));

        Long idValue = Long.valueOf((String) oldJSON.get(getidEntity));


        String selectedPathString = loc + this.path + this.table + idValue +".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        Files.delete(pathSelected);


        map = oMapper.convertValue(entity, Map.class);

        JSONObject newJSON = new JSONObject(map);
        newJSON = JSONutils.cleanJSONentity(newJSON);

        String JSONString = oMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);
        Files.write(Path.of(selectedPathString), JSONString.getBytes());
        entityClass newEntity = (entityClass) oMapper.readValue(JSONString, this.entityClass);

        return newEntity;
    }

    private JSONObject handleForeignKeys(JSONObject newJSON) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ParseException {

        Iterator iSpinKeys = newJSON.keySet().iterator();

        List<Class<?>> entityClasses = JSONutils.find("com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity");
        while (iSpinKeys.hasNext()) {


            Object foreignObjectId = iSpinKeys.next();
            String key = String.valueOf(foreignObjectId);
            String izId = "";
            if (key.length()>1){ izId = key.substring(0,1);}
            Class newEntityClass;

            if (izId == "id"){
                String idClass = key.replace("id","");
                for (Class classe : entityClasses) {
                    if (JSONutils.getNameFromPath(String.valueOf(classe)).toLowerCase().equals(idClass.toLowerCase() + "entity")) {
                        newEntityClass = classe;
                        String path = String.valueOf(newEntityClass.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getPath").invoke(newEntityClass.getDeclaredConstructor().newInstance()));
                        String table = String.valueOf(newEntityClass.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getTable").invoke(newEntityClass.getDeclaredConstructor().newInstance()));

                        newJSON.put(String.valueOf(newEntityClass),this.subSelect((JSONObject) newJSON.get(foreignObjectId),path,table,newEntityClass,newJSON));
                        newJSON.remove(foreignObjectId);
                    }
                }
            }
        }
        return newJSON;
    }

    private JSONObject subSelect(JSONObject jsonID, String path, String table,Class entityClass, JSONObject totalJSON) throws IOException, ParseException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String selectedPathString = loc + path + table + jsonID +".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        Object selectedObj = new JSONParser().parse(new FileReader(String.valueOf(pathSelected)));
        JSONObject JSONentity = (JSONObject) new ObjectMapper().readValue(selectedObj.toString(),entityClass);

        Iterator iSpinKeys = JSONentity.keySet().iterator();

        List<Class<?>> entityClasses = JSONutils.find("com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity");
        ArrayList<String> nulls = new ArrayList<>();
        while (iSpinKeys.hasNext()) {


            Object foreignObjectId = iSpinKeys.next();
            String key = String.valueOf(foreignObjectId);
            String izId = "";
            if (key.length()>1){ izId = key.substring(0,1);}
            Class newEntityClass;

            if (izId == "id"){
                String idClass = key.replace("id","");
                for (Class classe : entityClasses) {
                    if (JSONutils.getNameFromPath(String.valueOf(classe)).toLowerCase().equals(idClass.toLowerCase() + "entity")) {
                        newEntityClass = classe;
                        String newPath = String.valueOf(newEntityClass.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getPath").invoke(newEntityClass.getDeclaredConstructor().newInstance()));
                        String newTable = String.valueOf(newEntityClass.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getTable").invoke(newEntityClass.getDeclaredConstructor().newInstance()));
                        JSONObject selectedJSON = (JSONObject) JSONentity.get(foreignObjectId);
                        totalJSON.remove(foreignObjectId);
                        return (JSONObject) totalJSON.put(String.valueOf(newEntityClass),this.subSelect((JSONObject) selectedJSON,path,table,newEntityClass,JSONentity));

                    }
                }
            }
        }

        return totalJSON;
    }

    public void getEntityCredentials() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {

        Class<?> entityClass = null;

        List<Class<?>> entityClasses = JSONutils.find("com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity");
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        String autowiringClass = JSONutils.getNameFromPath(String.valueOf(Class.forName(stElements[13].getClassName())));
        String entityPatternName = autowiringClass.substring(0, autowiringClass.length() - 8);

        for (Class classe : entityClasses) {
            if (JSONutils.getNameFromPath(String.valueOf(classe)).toLowerCase().equals(entityPatternName.toLowerCase() + "entity")) {
                entityClass = classe;
            }
        }

        String path = String.valueOf(entityClass.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getPath").invoke(entityClass.getDeclaredConstructor().newInstance()));
        String table = String.valueOf(entityClass.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getTable").invoke(entityClass.getDeclaredConstructor().newInstance()));

        this.path = path;
        this.table = table;
        this.entityClass = entityClass;
    }


  private Integer addSeq() throws IOException, ParseException {

        String pathSeq = loc + this.path + "JSONSequence" + this.table + ".JSON";
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


    //stampa lo stack please
         /*        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement StackTraceElementX : stElements )
            System.out.println(StackTraceElementX);
        System.out.println(stElements[2]);*/
}


