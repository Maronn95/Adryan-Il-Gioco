package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Main;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.stream.Collectors;

public class JSONutils{

    private static final char PKG_SEPARATOR = '.';

    private static final char DIR_SEPARATOR = '/';

    private static final String CLASS_FILE_SUFFIX = ".class";

    private static final String BAD_PACKAGE_ERROR = "Unable to get resources from path '%s'. Are you sure the package '%s' exists?";

    public static List<Class<?>> find(String scannedPackage) {
        String scannedPath = scannedPackage.replace(PKG_SEPARATOR, DIR_SEPARATOR);
        URL scannedUrl = Thread.currentThread().getContextClassLoader().getResource(scannedPath);
        if (scannedUrl == null) {
            throw new IllegalArgumentException(String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage));
        }
        File scannedDir = new File(scannedUrl.getFile());
        List<Class<?>> classes = new ArrayList<Class<?>>();
        for (File file : scannedDir.listFiles()) {
            classes.addAll(find(file, scannedPackage));
        }
        return classes;
    }
    public static List<Object> findJSONs(String scannedPackage) {

        String scannedPath = scannedPackage.replace(PKG_SEPARATOR, DIR_SEPARATOR);
        String dir =System.getProperty("user.dir")+scannedPath;
        List<Object> JSONs = new ArrayList<>();

        try{
            List<Path> paths = Files.walk(Paths.get(dir),1) //by mentioning max depth as 1 it will only traverse immediate level

                    .filter(Files::isRegularFile)
                    .filter(path-> path.getFileName().toString().endsWith(".JSON")) // fetch only the files which are ending with .JSON
                    .collect(Collectors.toList());

            paths.removeIf(path-> path.getFileName().toString().startsWith( "JSONSequence"));

            for(Path path : paths) {
                String json = new String(Files.readAllBytes(path));
                JSONs.add(json);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return JSONs;
    }

    private static List<Class<?>> find(File file, String scannedPackage) {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        String resource = scannedPackage + PKG_SEPARATOR + file.getName();
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                classes.addAll(find(child, resource));
            }
        } else if (resource.endsWith(CLASS_FILE_SUFFIX)) {
            int endIndex = resource.length() - CLASS_FILE_SUFFIX.length();
            String className = resource.substring(0, endIndex);
            try {
                classes.add(Class.forName(className));
            } catch (ClassNotFoundException ignore) {
            }
        }
        return classes;
    }
    public static String getNameFromPath(String path){
        char[] ch = path.toCharArray();
        Integer pos = 0;
        for( int i = 0; i < ch.length; i++){
            String s = Character.toString(ch[i]);
            if (s.equals(".")) {
                pos = i+1;
            }
        }
       return  path.substring(pos);
    }

    public static JSONObject cleanJSONentity(JSONObject dirtyJson) {

        dirtyJson.remove("resp");
        dirtyJson.remove("table");
        dirtyJson.remove("path");
        dirtyJson.remove("req");

        dirtyJson = cleanNullToo(dirtyJson);
        return dirtyJson;
    }

    private static JSONObject cleanNullToo(JSONObject dirtyJson) {
        Iterator iSpinKeys = dirtyJson.keySet().iterator();
        Iterator iSpinValues = dirtyJson.values().iterator();
        ArrayList<String> nulls = new ArrayList<>();
        while (iSpinKeys.hasNext() && iSpinValues.hasNext()) {

            Object key =  iSpinKeys.next();
            Object value =  iSpinValues.next();

            if (null == value){
                nulls.add(String.valueOf(key));
            }
        }
        for (String nullKey : nulls) {
            dirtyJson.remove(nullKey);
        }
        return dirtyJson;
    }
}
