package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ArmiJSONservice;
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
    private PGRepository pRepo;

    @Autowired
    private ArmiRepository aRepo;
    @Override
    public int[] fendenteLeggero(Integer idPg1, Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Random rand = new Random();

        PgEntity pg1 = (PgEntity) pRepo.selectById(idPg1);



        ArmiEntity arma1= (ArmiEntity) aRepo.selectById(idArma);

        Double modificatoreDanno= generateRandomDouble(0.01,25.00);

         int danno = 0;

        int tiroPerColpire = (pg1.getStattsCalc().getUtilizzoArmaX() + rand.nextInt(20) );

       int[]valoriAttacco = new int[0];

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
                valoriAttacco[0]=(tiroPerColpire);
                valoriAttacco[1]=(danno);

                return valoriAttacco;




        }
        public void subisciFendenteLeggero(Integer idPg2, int[]valoriAttacco) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException {
        PgEntity pg2 = (PgEntity) pRepo.selectById(idPg2);
        int tiroPerColpire = valoriAttacco[0];
        int danno = valoriAttacco [1];

        if(pg2.getStattsCalc().getCa() <= tiroPerColpire) {
            pg2.getStattsCalc().setVitaAttuale(pg2.getStattsCalc().getVitaAttuale() - danno);


            pRepo.update(pg2);
        }
        else {
            System.out.println("Mancato!!");
        }
        }

    @Override
    public int[] fendentePesante(Integer idPg1,  Integer idArma) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Random rand = new Random();

        PgEntity pg1 = (PgEntity) pRepo.selectById(idPg1);



        ArmiEntity arma1= (ArmiEntity) aRepo.selectById(idArma);

        Double modificatoreDanno= generateRandomDouble(0.01,15.00);

        int danno = 0;

        int tiroPerColpire = (pg1.getStattsCalc().getUtilizzoArmaX() + rand.nextInt(15) );


        int[] valoriAttacco = new int[0];

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
        valoriAttacco[0]=(tiroPerColpire);
        valoriAttacco[1]=(danno);
        return valoriAttacco;
    }

    public void subisciFendentePesante(Integer idPg2, int[]valoriAttacco) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException {
        PgEntity pg2 = (PgEntity) pRepo.selectById(idPg2);
        int tiroPerColpire = valoriAttacco[0];
        int danno = valoriAttacco [1];

        if(pg2.getStattsCalc().getCa() <= tiroPerColpire) {
            pg2.getStattsCalc().setVitaAttuale(pg2.getStattsCalc().getVitaAttuale() - danno);


            pRepo.update(pg2);
        }
        else {
            System.out.println("Mancato!!");
        }
    }



    public double generateRandomDouble(double min, double max) {
        double x = (Math.random() * (max - min) + min);
        return Math.round(x * 100.0) / 100.0;
    }
}
