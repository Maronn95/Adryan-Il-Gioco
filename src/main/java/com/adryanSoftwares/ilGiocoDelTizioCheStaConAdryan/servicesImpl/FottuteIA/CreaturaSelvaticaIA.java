package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.FottuteIA;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.CreaturaSelvaticaEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class CreaturaSelvaticaIA {

    public List<Integer> turnoCreaturaSelvatica(CreaturaSelvaticaEntity creaturaSelvaticaEntity, PgEntity pg) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException {

        List<Integer> valoriAttacco=null;

//        if(pg.getStattsPureEntity().getVitaPura()>=(creaturaSelvaticaEntity.getStattsPureEntity().getVitaPura()*1.5)){
//            System.out.println("La creatura selvatica fugge spaventata");
//            return null;
//        }

        //if(creaturaSelvaticaEntity.getStattsCalcEntity().getVitaAttuale()>=(creaturaSelvaticaEntity.getStattsPureEntity().getVitaPura()/3)){

            String azioneScelta;

            azioneScelta=creaturaSelvaticaEntity.getPattern().get(1);

            valoriAttacco=CreaturaSelvaticaAzioniOffensiveUtils.eseguiAzioneDinamicamente(creaturaSelvaticaEntity,azioneScelta);
       // }
//        else{
//
//            String azioneScelta;
//
//            azioneScelta=creaturaSelvaticaEntity.getPattern().get(3);
//
//            CreaturaSelvaticaAzioniOffensiveUtils.eseguiAzioneDinamicamente(creaturaSelvaticaEntity,azioneScelta);
//
//            System.out.println("La creatura selvatica fugge ferita");
//
//        }



        return valoriAttacco;
    }



}
