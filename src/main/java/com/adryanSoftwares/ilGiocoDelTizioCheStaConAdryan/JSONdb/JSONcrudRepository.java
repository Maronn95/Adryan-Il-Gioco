package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
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
        FileReader fileReader = new FileReader(String.valueOf(pathSelected));
        Object selectedObj = new JSONParser().parse(fileReader);
        fileReader.close();
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(selectedObj, Map.class);
        JSONObject selectedJSON = new JSONObject(map);
        selectedJSON = this.subSelect(selectedJSON,this.path, this.table, this.entityClass);

        entityClass entity = (entityClass) new ObjectMapper().readValue(selectedJSON.toString(),this.entityClass);

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
        JSONObject newJSONreturn = new JSONObject(map);

        int jSeq = this.addSeq();
        dbPath += jSeq + ".JSON";
        newJSON.put("id" + this.table, jSeq);
        newJSON = JSONutils.cleanJSONentity(newJSON);


        // TO WRITE
        this.handleForeignKeys(newJSON);
        ObjectMapper objectMapper = new ObjectMapper();
        String JSONString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);
        Files.write(Path.of(dbPath), JSONString.getBytes());

        Iterator iSpinKeys = newJSON.keySet().iterator();
        List toReplace = new ArrayList();
        while (iSpinKeys.hasNext()) {
            Object idKey = iSpinKeys.next();
            if (idKey.toString().contains("id") && !idKey.toString().equals(("id" + this.table))) {
                toReplace.add(idKey);
            }
        }
        if (!toReplace.isEmpty()) {
            for (Object idForeign : toReplace) {
                String baseGet = idForeign.toString().replace("id", "") + "Entity";
                String upperGet = baseGet.substring(0, 1).toUpperCase() + baseGet.substring(1);
                Object foreignObj = newJSONreturn.get(upperGet);
                String fEntityName = upperGet;
                if (foreignObj == null) {
                    String lowerGet = baseGet.substring(0, 1).toLowerCase() + baseGet.substring(1);
                    foreignObj = newJSONreturn.get(lowerGet);
                    fEntityName = lowerGet;
                }

                Map<String, Object> mapForeign = oMapper.convertValue(foreignObj, Map.class);
                JSONObject foreignJSON = new JSONObject(mapForeign);
                Object foreignValue = newJSON.get(idForeign);
                newJSON.remove(idForeign);
                foreignJSON.put(idForeign, foreignValue);
                newJSON.put(fEntityName, foreignJSON);
            }
        }
        entityClass newEntity = (entityClass) oMapper.readValue(newJSON.toString(), this.entityClass);

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

            if (key.toLowerCase().equals(getidEntity.toLowerCase())){
                getidEntity=String.valueOf(key);
            }
        }
        Long idValue = Long.valueOf(String.valueOf(oldJSON.get(getidEntity)));

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

    public  List<entityClass> findAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        this.getEntityCredentials();
        String varX = this.path.substring(0, this.path.length() - 1).replaceAll( "\\\\" , "." ).substring(15, this.path.length()- 1);

        List<Object> JSONentities = JSONutils.findJSONs(this.path);
        List<entityClass> entities = new ArrayList<>();
        for (Object obj: JSONentities) {
            entityClass entity = (entityClass) new ObjectMapper().readValue(obj.toString(), this.entityClass);
            entities.add(entity);
        }

        return entities;
    }

    private JSONObject handleForeignKeys(JSONObject newJSON) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ParseException {

        Iterator iSpinKeys = newJSON.keySet().iterator();
        Iterator iSpinValues = newJSON.values().iterator();
        ArrayList <Object[]> foreignJsons = new ArrayList<>();

        List<Class<?>> entityClasses = JSONutils.find("com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity");
        String subTable = "";
        String subPath = "";

        while (iSpinKeys.hasNext() && iSpinValues.hasNext()) {

            Object foreignKey = iSpinKeys.next();
            Object foreignValue = iSpinValues.next();

            for (Class classe: entityClasses){

                if (foreignKey.toString().equalsIgnoreCase(classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.",""))){

                    ObjectMapper oMapper = new ObjectMapper();
                    Map<String, Object> map = oMapper.convertValue(foreignValue, Map.class);
                    JSONObject foreignJSON = new JSONObject(map);

                    subPath = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getPath").invoke(classe.getDeclaredConstructor().newInstance()));
                    subTable = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getTable").invoke(classe.getDeclaredConstructor().newInstance()));
                    Object foreignEntity = new ObjectMapper().readValue(foreignJSON.toString(),classe);
                    Object[] inForeignJSON = new Object[3];


                    Iterator iSpingFkeys = foreignJSON.keySet().iterator();
                    while (iSpingFkeys.hasNext()){
                        Object foreignKeyName = iSpingFkeys.next();
                        if ( foreignKeyName.toString().equalsIgnoreCase("id"+subTable.toLowerCase().replace("entity",""))
                                && foreignJSON.get(foreignKeyName)!=null){
                            inForeignJSON[0] = this.update(foreignEntity, subPath, subTable, classe);
                        }
                    }
                    if (inForeignJSON[0] == null)
                        inForeignJSON[0] = this.creates(foreignEntity, subPath, subTable, classe);

                    inForeignJSON [1]= subTable;
                    inForeignJSON [2]= classe;
                    foreignJsons.add(inForeignJSON);
                }
            }
        }
        for (Object[] thisJson: foreignJsons){
            Iterator iSpinKeysF = newJSON.keySet().iterator();
            ArrayList toRemoves = new ArrayList();
            while (iSpinKeysF.hasNext()) {
                Object foreignKeyf = iSpinKeysF.next();
                if (foreignKeyf.toString().equalsIgnoreCase(thisJson[2].toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", ""))) {
                    toRemoves.add(foreignKeyf);
                }
            }
            for ( Object toRemove:toRemoves){
                newJSON.remove(toRemove);
            }
            JSONObject fCreated = (JSONObject) thisJson[0];
            Object newFId = fCreated.get("id"+thisJson[1]);
            newJSON.put("id"+(thisJson[1]).toString(), newFId);

        }
        return newJSON;
    }

    private JSONObject update(Object foreignEntity, String subPath, String subTable, Class classe) throws IOException, ParseException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String getidEntity = "id"+ subTable;

        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(foreignEntity, Map.class);
        JSONObject oldJSON = new JSONObject(map);
        Iterator ioSpinno = oldJSON.keySet().iterator();
        while (ioSpinno.hasNext()){
            String key = String.valueOf(ioSpinno.next());

            if (key.toLowerCase().equals(getidEntity.toLowerCase())){
                getidEntity=String.valueOf(key);
            }
        }
        Long idValue =  Long.valueOf(String.valueOf(oldJSON.get(getidEntity)));

        String selectedPathString = loc + subPath + subTable + idValue +".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        Files.delete(pathSelected);

        map = oMapper.convertValue(foreignEntity, Map.class);

        JSONObject newJSON = new JSONObject(map);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        this.handleForeignKeys(newJSON);

        String JSONString = oMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);
        Files.write(Path.of(selectedPathString), JSONString.getBytes());

        return newJSON;

    }

    private JSONObject  creates(Object foreignEntity, String subPath, String subTable, Class classe) throws IOException, ParseException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String dbPath = loc + subPath + subTable;
        ObjectMapper oMapper = new ObjectMapper();

        Map<String, Object> map = oMapper.convertValue(foreignEntity, Map.class);
        JSONObject newJSON = new JSONObject(map);

        int jSeq = this.addSeq(subPath,subTable,classe);
        dbPath += jSeq +".JSON";
        newJSON.put("id" + subTable, jSeq);

        newJSON = JSONutils.cleanJSONentity(newJSON);

        // TO WRITE
        JSONObject newJSONtoWrite = this.handleForeignKeys(newJSON);
        ObjectMapper objectMapper = new ObjectMapper();
        String JSONString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSONtoWrite);
        Files.write(Path.of(dbPath), JSONString.getBytes());

        return  newJSONtoWrite;
    }

    private Integer addSeq(String subPath, String subTable, Class classe) throws IOException, ParseException {

        String pathSeq = loc + subPath + "JSONSequence" + subTable + ".JSON";
        Path pathSettings = Paths.get(pathSeq);
        FileReader fileReader = (new FileReader(String.valueOf(pathSettings)));
        Object imposta = new JSONParser().parse(fileReader);
        fileReader.close();// apro il json di sequence come oggetto
        JSONObject JSONImpostazioni = (JSONObject) imposta;
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

    private JSONObject subSelect(JSONObject selectedJSON, String path, String table, Class sClass) throws IOException, ParseException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Iterator iSpinKeys = selectedJSON.keySet().iterator();
        Iterator iSpinValues = selectedJSON.values().iterator();
        ArrayList toRemove = new ArrayList();
        ArrayList<Object[]> toAdd = new ArrayList();
        List<Class<?>> entityClasses = JSONutils.find("com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity");
        String subTable = "";
        String subPath = "";

        while (iSpinKeys.hasNext() && iSpinValues.hasNext()) {

            String foreignKey = iSpinKeys.next().toString().replace("id", "") + "Entity";
            Object foreignValue = iSpinValues.next();

            for (Class classe : entityClasses) {

                if (foreignKey.toString().equalsIgnoreCase(classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", "")) && !foreignKey.equalsIgnoreCase(table + "Entity")) {
                    subPath = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getPath").invoke(classe.getDeclaredConstructor().newInstance()));
                    subTable = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getTable").invoke(classe.getDeclaredConstructor().newInstance()));

                    String selectedPathString = loc + subPath + subTable + foreignValue + ".JSON";
                    Path pathSelected = Paths.get(selectedPathString);
                    FileReader fileReader = (new FileReader(String.valueOf(pathSelected)));
                    Object selectedObj = new JSONParser().parse(fileReader);
                    fileReader.close();
                    ObjectMapper oMapper = new ObjectMapper();
                    Map<String, Object> map = oMapper.convertValue(selectedObj, Map.class);
                    JSONObject subJSON = new JSONObject(map);
                    String toWrite = classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", "");
                    Object[] JSONToAdd = new Object[5];
                    JSONToAdd[0]= toWrite.substring(0, 1).toLowerCase() + toWrite.substring(1);
                    JSONToAdd[1]= subJSON;
                    JSONToAdd[2]= subPath;
                    JSONToAdd[3]= subTable;
                    JSONToAdd[4]= classe;

                    toAdd.add(JSONToAdd);
                    toRemove.add(foreignKey);
                    ;
                }
            }
        }
        for (Object idRemove : toRemove){
            selectedJSON.remove(("id"+idRemove).replace("Entity",""));
        }
        for (Object[] arrAdd : toAdd){
            selectedJSON.put(arrAdd[0],this.subSelect((JSONObject) arrAdd[1],arrAdd[2].toString(),arrAdd[3].toString(), (Class) arrAdd[4]));
            //this.subSelect((JSONObject) arrAdd[1]);
        }
        return  selectedJSON;
    }

    public void getEntityCredentials() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {

        Class<?> entityClass = null;

        List<Class<?>> entityClasses = JSONutils.find("com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity");
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        String autowiringClass = JSONutils.getNameFromPath(String.valueOf(Class.forName(stElements[13].getClassName())));
        String entityPatternName = autowiringClass.substring(0, autowiringClass.length() - 8);

        for (Class classe : entityClasses) {
            if (JSONutils.getNameFromPath(String.valueOf(classe)).equalsIgnoreCase(entityPatternName.toLowerCase() + "entity")) {
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
        FileReader fileReader=(new FileReader(String.valueOf(pathSettings)));
        Object Impostazioni = new JSONParser().parse(fileReader);
        fileReader.close();// apro il json di sequence come oggetto
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


