package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.ArmiNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgAzioniOffensiveJSONService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgJSONservice;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
@Service
public class PgAzioniOffensiveJSONServiceImpl implements PgAzioniOffensiveJSONService {

    @Autowired
    private PgJSONservice pService;

    @Autowired
    private ArmiJSONservice aService;
    @Override
    public int fendenteLeggero(Integer idPg1, Integer idPg2, Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        PgNewJSONresp pg1 = pService.selectPg(idPg1);

        PgNewJSONresp pg2= pService.selectPg(idPg2);

        ArmiNewJSONresp arma1= aService.selectArmi(idArma);

        Double modificatoreDanno= generateRandomDouble(0.01,15.00);

        int danno = (int) ((pg1.getStattsCalc().getUtilizzoArmaX() +arma1.getDanno() + 30 )
                - (( 0.1 + modificatoreDanno)));


        pg2.getStattsCalc().setVitaAttuale(pg2.getStattsCalc().getVitaAttuale() - danno);

       System.out.println("Colpito! L'avversario subisce " +danno+" danni! All'avversario restano "+pg2.getStattsCalc().getVitaAttuale()+" punti vita!");

       return danno;



    }

    public double generateRandomDouble(double min, double max) {
        double x = (Math.random() * (max - min) + min);
        return Math.round(x * 100.0) / 100.0;
    }
}
