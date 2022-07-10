package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

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
