package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import lombok.Getter;
import lombok.Setter;
import java.lang.reflect.InvocationTargetException;

@Getter
@Setter
public class JSONtoken {

    String path;
    String table;
    Class entityClass;

    public JSONtoken(Object classe) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        String path = String.valueOf(classe.getClass().getDeclaredMethod("getPath").invoke(classe));
        String table = String.valueOf(classe.getClass().getDeclaredMethod("getTable").invoke(classe));

        this.path= path;
        this.table = table;
        this.entityClass = classe.getClass();

    }
}
