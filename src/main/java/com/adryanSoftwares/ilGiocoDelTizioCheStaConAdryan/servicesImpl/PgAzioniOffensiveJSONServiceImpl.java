package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class PgAzioniOffensiveJSONServiceImpl implements PgAzioniOffensiveJSONService {

    @Autowired
    private PgJSONservice pService;

    @Autowired
    private ArmiJSONservice aService;
    @Override
    public List<Integer> fendenteLeggero(Integer idPg1, Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Random rand = new Random();

        PgNewJSONresp pg1 = pService.selectPg(idPg1);



        ArmiEntity arma1= aService.selectArmi(idArma);

        Double modificatoreDanno= generateRandomDouble(0.01,25.00);

         int danno = 0;

        int tiroPerColpire = (pg1.getStattsCalc().getUtilizzoArmaX() + rand.nextInt(20) );

        List<Integer> valoriAttacco = new ArrayList<>();

          if(rand.nextInt(100) <= (arma1.getProbabilitaCriticoArma()+ 10))
            {
                danno = (int) ((int) (pg1.getStattsCalc().getUtilizzoArmaX()+ arma1.getDanno() +30
                                                - (0.1 + modificatoreDanno)) * arma1.getMoltiplicatoreCritico());


                System.out.println("CRI-CRI-CRITICAL!! L'avversario subisce " + danno + "danni!");


            }
                else{
                danno = (int) ((int) pg1.getStattsCalc().getUtilizzoArmaX() + arma1.getDanno() + 30
                        - (0.1 + modificatoreDanno));




                System.out.println("Colpito! L'avversario subisce " + danno + " danni!");


            }
                valoriAttacco.add(tiroPerColpire);
                valoriAttacco.add(danno);

                return valoriAttacco;




        }

    @Override
    public List<Integer> fendentePesante(Integer idPg1,  Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Random rand = new Random();

        PgNewJSONresp pg1 = pService.selectPg(idPg1);



        ArmiEntity arma1= aService.selectArmi(idArma);

        Double modificatoreDanno= generateRandomDouble(0.01,15.00);

        int danno = 0;

        int tiroPerColpire = (pg1.getStattsCalc().getUtilizzoArmaX() + rand.nextInt(15) );


        List<Integer> valoriAttacco = new ArrayList<>();

        if(rand.nextInt(100) <= (arma1.getProbabilitaCriticoArma()+ 10))
        {
            danno = (int) ((int) (pg1.getStattsCalc().getUtilizzoArmaX()+ arma1.getDanno() +30
                    - (0.1 + modificatoreDanno)) * arma1.getMoltiplicatoreCritico());


            System.out.println("CRI-CRI-CRITICAL!! L'avversario subisce " + danno + "danni!");


        }
        else{
            danno = (int) ((int) pg1.getStattsCalc().getUtilizzoArmaX() + arma1.getDanno() + 30
                    - (0.1 + modificatoreDanno));






       System.out.println("Colpito! L'avversario subisce " +danno+" danni!");



        }
        valoriAttacco.add(tiroPerColpire);
        valoriAttacco.add(danno);

        return valoriAttacco;
    }



    public double generateRandomDouble(double min, double max) {
        double x = (Math.random() * (max - min) + min);
        return Math.round(x * 100.0) / 100.0;
    }
}
