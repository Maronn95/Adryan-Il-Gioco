package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
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
import java.util.*;

@Repository
public class JSONcrudRepository <entityClass>   {

    String loc = System.getProperty("user.dir");
    String path;
    String table;
    Class entityClass;

    public  entityClass selectById( Integer idJSONreq, String subPath, String subTable, Class subClasse) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        String selectedPathString = loc + subPath + subTable + idJSONreq +".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        FileReader fileReader = new FileReader(String.valueOf(pathSelected));
        Object selectedObj = new JSONParser().parse(fileReader);
        fileReader.close();
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(selectedObj, Map.class);
        JSONObject selectedJSON = new JSONObject(map);

        selectedJSON = this.subSelect(selectedJSON, subTable);
        entityClass entity = (entityClass) new ObjectMapper().readValue(selectedJSON.toString(),subClasse);

        return entity;
    }
    public  entityClass selectById( Integer idJSONreq) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        this.getEntityCredentials();
        return this.selectById(idJSONreq, this.path, this.table, this.entityClass);
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
        int jSeq = this.addSeq();
        dbPath += jSeq + ".JSON";
        newJSON.put("id" + this.table, jSeq);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        this.handleForeignKeys(newJSON);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        ObjectMapper objectMapper = new ObjectMapper();
        String JSONString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);
        Files.write(Path.of(dbPath), JSONString.getBytes());
        entityClass newEntity = this.selectById(jSeq,this.path,this.table,this.entityClass);
        return newEntity;
    }
    public entityClass update (entityClass entity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        this.getEntityCredentials();
        String getidEntity = "id"+ this.table;
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(entity, Map.class);
        JSONObject newJSON = new JSONObject(map);

        // TODO FUTURE METHOD TO CHECK UPPER LOWERCASE (IN:JSONOBJ,
        //  STRING/JSON KEY) (OUT: FOUND EQUALSIGNORECASE KEY)

        Iterator ioSpinno = newJSON.keySet().iterator();
        while (ioSpinno.hasNext()){
            String key = String.valueOf(ioSpinno.next());
            if (key.equalsIgnoreCase(getidEntity)){
                getidEntity=key;
            }
        } // end --

        Long idValue = Long.valueOf(String.valueOf(newJSON.get(getidEntity)));
        String selectedPathString = loc + this.path + this.table + idValue +".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        Files.delete(pathSelected);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        this.handleForeignKeys(newJSON);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        ObjectMapper objectMapper = new ObjectMapper();
        String JSONString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);
        Files.write(pathSelected, JSONString.getBytes());
        entityClass newEntity = this.selectById(Integer.valueOf(String.valueOf(idValue)), this.path,this.table,this.entityClass);
        return newEntity;
    }
    public  List<entityClass> findAll() throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        this.getEntityCredentials();
        List<Object> JSONentities = JSONutils.findJSONs(this.path);
        List<entityClass> entities = new ArrayList<>();
        for (Object obj: JSONentities) {
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(obj.toString());
            json = this.subSelect( json , this.table);
            entityClass entity = (entityClass) new ObjectMapper().readValue(json.toString(), this.entityClass);
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
        JSONArray foreignJSONarray = new JSONArray();
        List<String> foreignNames = new ArrayList<>();
        while (iSpinKeys.hasNext() && iSpinValues.hasNext()) {

            Object foreignKey = iSpinKeys.next();
            Object foreignValue = iSpinValues.next();
            for (Class classe : entityClasses) {

                if (foreignKey.toString().equalsIgnoreCase(classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", "") + "List")) {
                    Iterator countListJSON = ((ArrayList)foreignValue).listIterator();
                    while (countListJSON.hasNext()){
                        ObjectMapper oMapper = new ObjectMapper();
                        Map<String, Object> map = oMapper.convertValue(countListJSON.next(), Map.class);
                        JSONObject foreignJSONobj = new JSONObject(map);
                        foreignJSONarray.add(foreignJSONobj);
                        foreignNames.add(((String) foreignKey).replace("List",""));
                    }
                }
                if (foreignKey.toString().equalsIgnoreCase(classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", ""))) {
                    ObjectMapper oMapper = new ObjectMapper();
                    Map<String, Object> map = oMapper.convertValue(foreignValue, Map.class);
                    JSONObject foreignJSONobj = new JSONObject(map);
                    foreignJSONarray.add(foreignJSONobj);
                    foreignNames.add((String) foreignKey);
                }
            }
        }
        for (Class classe: entityClasses) {
            Iterator spinJSONArray = foreignJSONarray.listIterator();
            Iterator spinJSONNames = foreignNames.listIterator();

            while (spinJSONArray.hasNext() && spinJSONNames.hasNext()) {
                String JSONName = (String) spinJSONNames.next();
                Object foreignJSONobj = spinJSONArray.next();
                JSONObject foreignJSON = (JSONObject) foreignJSONobj;
                if (JSONName.equalsIgnoreCase(classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", ""))) {

                    subPath = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getPath").invoke(classe.getDeclaredConstructor().newInstance()));
                    subTable = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getTable").invoke(classe.getDeclaredConstructor().newInstance()));
                    Object foreignEntity = new ObjectMapper().readValue(foreignJSON.toString(), classe);
                    Object[] inForeignJSON = new Object[3];

                    Iterator iSpingFkeys = foreignJSON.keySet().iterator();
                    while (iSpingFkeys.hasNext()) {
                        Object foreignKeyName = iSpingFkeys.next();
                        if (foreignKeyName.toString().replace("entity", "").equalsIgnoreCase("id" + subTable.toLowerCase().replace("entity", ""))
                                && foreignJSON.get(foreignKeyName.toString()) != null) {
                            inForeignJSON[0] = this.update(foreignEntity, subPath, subTable, classe);
                        }
                    }
                    if (inForeignJSON[0] == null)
                        inForeignJSON[0] = this.creates(foreignEntity, subPath, subTable, classe);
                    inForeignJSON[1] = subTable;
                    inForeignJSON[2] = classe;
                    foreignJsons.add(inForeignJSON);
                }
            }
        }

        ArrayList<Object[]> entityLists = new ArrayList<>();
        ArrayList<String> toRemoves = new ArrayList<>();
        Iterator spinCheck = newJSON.keySet().iterator();
        ArrayList<Object[]> toRemoveFromList = new ArrayList<>();
        ArrayList<Object[]> toRemoveFromFJsons = new ArrayList<>();

        while(spinCheck.hasNext()) {
            String keyName = String.valueOf(spinCheck.next());
            if (keyName.contains("EntityList") || keyName.contains("entityList")) {
                Object[] fromList = new Object[2];
                fromList[0] = newJSON.get(keyName);
                fromList[1] = keyName;
                entityLists.add(fromList);
                ArrayList entityListToRemove = (ArrayList) newJSON.get(keyName);
                for (Object entityInListToRemove :entityListToRemove){
                    Object[] toRemoveFromEntityList = new Object[2];
                    toRemoveFromEntityList[1]= keyName;
                    toRemoveFromEntityList[0] = entityInListToRemove;
                    toRemoveFromList.add(toRemoveFromEntityList);
                }
            }
            else if (keyName.contains("Entity") || keyName.contains("entity")) {
                toRemoves.add(keyName);
            }
        }
        if (entityLists.size()>0) {
            ArrayList<Object[]> toAddFromList = new ArrayList<>();
            for (Object[] entityFList : entityLists) {
                for (int i = 0; i < foreignJsons.size(); i++) {
                    Object[] fJSONfData = foreignJsons.get(i);
                    if (fJSONfData[2].toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", "").equalsIgnoreCase(String.valueOf(entityFList[1]).replace("List", ""))) {
                        toRemoveFromFJsons.add(fJSONfData);
                        Object[] idAndList = new Object[2];
                        idAndList[1] = entityFList[1];
                        idAndList[0] = Integer.valueOf(String.valueOf(((JSONObject) fJSONfData[0]).get("id" + fJSONfData[1])));
                        toAddFromList.add(idAndList);
                    }
                }
            }
            for (Object[] addIdNewCreated : toAddFromList) {
                ((ArrayList) newJSON.get(addIdNewCreated[1])).add(addIdNewCreated[0]);
            }

            for (Object[] removeInNewJSONEList : toRemoveFromList) {
                ((ArrayList) newJSON.get(removeInNewJSONEList[1])).remove(removeInNewJSONEList[0]);
            }
            for (Object[] removeInForeignJson : toRemoveFromFJsons) {
                foreignJsons.remove(removeInForeignJson);
            }
        }
        for ( String toRemove : toRemoves) {
            newJSON.remove(toRemove);
        }
        for ( Object[] getIdfromObj : foreignJsons) {
            newJSON.put("id"+getIdfromObj[1],
                    Integer.valueOf(String.valueOf(((JSONObject)getIdfromObj[0]).get("id"+getIdfromObj[1]))));
        }
        return newJSON;
    }

    private JSONObject update(Object foreignEntity, String subPath, String subTable, Class classe) throws IOException, ParseException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String getidEntity = "id"+ subTable;
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(foreignEntity, Map.class);
        JSONObject newJSON = new JSONObject(map);

        Iterator ioSpinno = newJSON.keySet().iterator();
        while (ioSpinno.hasNext()){
            String key = String.valueOf(ioSpinno.next());

            if (key.toLowerCase().equals(getidEntity.toLowerCase())){
                getidEntity=String.valueOf(key);
            }
        }
        Long idValue = Long.valueOf(String.valueOf(newJSON.get(getidEntity)));
        String selectedPathString = loc + subPath + subTable + idValue +".JSON";
        Path pathSelected = Paths.get(selectedPathString);
        Files.delete(pathSelected);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        this.handleForeignKeys(newJSON);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        ObjectMapper objectMapper = new ObjectMapper();
        String JSONString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);
        Files.write(pathSelected, JSONString.getBytes());

        newJSON = this.subSelect(newJSON,subTable);
        return newJSON;
    }

    private JSONObject  creates(Object foreignEntity, String subPath, String subTable, Class classe) throws IOException, ParseException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String dbPath = loc + subPath + subTable;
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(foreignEntity, Map.class);
        JSONObject newJSON = new JSONObject(map);
        int jSeq = this.addSeq(subPath,subTable,classe);
        dbPath += jSeq + ".JSON";
        newJSON.put("id" + subTable, jSeq);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        this.handleForeignKeys(newJSON);
        newJSON = JSONutils.cleanJSONentity(newJSON);
        ObjectMapper objectMapper = new ObjectMapper();
        String JSONString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJSON);
        Files.write(Path.of(dbPath), JSONString.getBytes());

        newJSON = this.subSelect(newJSON,subTable);

        return newJSON;
    }

    private Integer addSeq(String subPath, String subTable, Class classe) throws IOException, ParseException {

        String pathSeq = loc + subPath + "JSONSequence" + subTable + ".JSON";
        Path pathSettings = Paths.get(pathSeq);
        FileReader  fileReader = new FileReader (String.valueOf(pathSettings));
        Object imposta = new JSONParser().parse(fileReader); // apro il json di sequence come oggetto
        fileReader.close();
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

    private JSONObject subSelect(JSONObject selectedJSON, String table) throws IOException, ParseException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Iterator iSpinKeys = selectedJSON.keySet().iterator();
        Iterator iSpinValues = selectedJSON.values().iterator();
        ArrayList toRemove = new ArrayList();
        ArrayList<Object[]> toAdd = new ArrayList();
        List<Class<?>> entityClasses = JSONutils.find("com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity");
        String subTable = "";
        String subPath = "";

        while (iSpinKeys.hasNext() && iSpinValues.hasNext()) {
            String baseKeyValue = (String) iSpinKeys.next();
            String foreignKeyList = baseKeyValue.substring(0,1).toUpperCase(Locale.ROOT)+baseKeyValue.substring(1,baseKeyValue.length());
            String foreignKey = foreignKeyList.replace("Id", "") + "Entity";
            Object foreignValue = iSpinValues.next();

            for (Class classe : entityClasses) {

                if (foreignKey.toString().equalsIgnoreCase(classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", "")) && !foreignKey.equalsIgnoreCase(table + "Entity")) {
                    subPath = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getPath").invoke(classe.getDeclaredConstructor().newInstance()));
                    subTable = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getTable").invoke(classe.getDeclaredConstructor().newInstance()));

                    String selectedPathString = loc + subPath + subTable + foreignValue + ".JSON";
                    Path pathSelected = Paths.get(selectedPathString);
                    FileReader fileReader = new FileReader(String.valueOf(pathSelected));
                    Object selectedObj = new JSONParser().parse(fileReader);
                    fileReader.close();
                    ObjectMapper oMapper = new ObjectMapper();
                    Map<String, Object> map = oMapper.convertValue(selectedObj, Map.class);
                    JSONObject subJSON = new JSONObject(map);
                    String toWrite = classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", "");
                    Object[] JSONToAdd = new Object[3];
                    JSONToAdd[0] = toWrite.substring(0, 1).toLowerCase() + toWrite.substring(1);
                    JSONToAdd[1] = subJSON;
                    JSONToAdd[2] = subTable;

                    toAdd.add(JSONToAdd);
                    toRemove.add(foreignKey);
                } else if (foreignKeyList.toString().replace("List","").equalsIgnoreCase(classe.toString().replace(
                        "class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", "")) && !foreignKey.equalsIgnoreCase(table + "Entity")) {
                    foreignKey = foreignKey.substring(0,1).toLowerCase(Locale.ROOT)+foreignKey.substring(1,foreignKey.length());
                    ArrayList<Object> toRemoveList = new ArrayList<>();
                    ArrayList<Object[]> toAddList = new ArrayList<>();

                    subPath = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getPath").invoke(classe.getDeclaredConstructor().newInstance()));
                    subTable = String.valueOf(classe.getDeclaredConstructor().newInstance().getClass().getDeclaredMethod("getTable").invoke(classe.getDeclaredConstructor().newInstance()));

                    for ( Object idFromList : (ArrayList<Object>)foreignValue){

                        idFromList = Long.valueOf(String.valueOf(idFromList));
                        String selectedPathString = loc + subPath + subTable + idFromList + ".JSON";
                        Path pathSelected = Paths.get(selectedPathString);
                        FileReader fileReader = new FileReader(String.valueOf(pathSelected));
                        Object selectedObj = new JSONParser().parse(fileReader);
                        fileReader.close();
                        ObjectMapper oMapper = new ObjectMapper();
                        Map<String, Object> map = oMapper.convertValue(selectedObj, Map.class);
                        JSONObject subJSON = new JSONObject(map);
                        String toWrite = classe.toString().replace("class com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.", "");
                        Object[] JSONToAdd = new Object[3];
                        JSONToAdd[0] = toWrite.substring(0, 1).toLowerCase() + toWrite.substring(1);
                        JSONToAdd[1] = subJSON;
                        JSONToAdd[2] = subTable;

                        toAddList.add(JSONToAdd);
                        toRemoveList.add(idFromList);
                    }

                    for (Object idToRemove : toRemoveList){
                        ((ArrayList)selectedJSON.get(baseKeyValue)).remove(idToRemove);
                    }
                    for (Object[] toAddToList : toAddList){
                        ((ArrayList)selectedJSON.get(baseKeyValue)).add(JSONutils.cleanJSONentity(this.subSelect((JSONObject) toAddToList[1],toAddToList[2].toString())));
                    }
                }
            }
        }
        for (Object idRemove : toRemove){
            selectedJSON.remove(("id"+idRemove).replace("Entity",""));
        }
        for (Object[] arrAdd : toAdd){
            selectedJSON.put(arrAdd[0],JSONutils.cleanJSONentity(this.subSelect((JSONObject) arrAdd[1],arrAdd[2].toString())));
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
        FileReader fileReader = new FileReader(String.valueOf(pathSettings));
        Object Impostazioni = new JSONParser().parse(fileReader); // apro il json di sequence come oggetto
        fileReader.close();
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


