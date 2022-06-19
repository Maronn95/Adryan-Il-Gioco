package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@Getter
@Setter
public class JSONtoken {

    String path;
    String table;
    Class entityClass;
    Class req;
    Class resp;

    public JSONtoken(Object classe) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {


        String path = String.valueOf(classe.getClass().getDeclaredMethod("getPath").invoke(classe));
        String table = String.valueOf(classe.getClass().getDeclaredMethod("getTable").invoke(classe));
        Class req =  classe.getClass().getDeclaredField("req").getType();
        Class resp =  classe.getClass().getDeclaredField("resp").getType();

        this.path= path;
        this.table = table;
        this.req = req;
        this.resp = resp;
        this.entityClass = classe.getClass();

    }
}
