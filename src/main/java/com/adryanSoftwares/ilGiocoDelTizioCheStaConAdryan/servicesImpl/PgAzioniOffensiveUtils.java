package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PgAzioniOffensiveUtils{


    public static List<Integer> eseguiAzioneDinamicamente(String azione, PgEntity pg1, ArmiEntity arma1) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {


        switch (azione) {
            case "fendenteLeggero":
                return fendenteLeggero(pg1,arma1);

            case "fendentePesante":
                return fendentePesante(pg1,arma1);
    }

        System.out.println("Porco Dio 589");
        return null;
    }

    private static List<Integer> fendenteLeggero(PgEntity pg1, ArmiEntity arma1) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Random rand = new Random();

        //ArmiEntity arma1= (ArmiEntity) armiRepository.selectById(idArma);

        Double modificatoreDanno= generateRandomDouble(0.01,25.00);

         int danno = 0;

        int tiroPerColpire = (pg1.getStattsCalcEntity().getUtilizzoArmaX() + rand.nextInt(20) );

        List<Integer> valoriAttacco = new ArrayList<>();

          if(rand.nextInt(100) <= (arma1.getProbabilitaCriticoArma()+ 10))
            {
                danno = (int) ((int) (pg1.getStattsCalcEntity().getUtilizzoArmaX()+ arma1.getDanno() +30
                                                - (0.1 + modificatoreDanno)) * arma1.getMoltiplicatoreCritico());


                System.out.println("CRI-CRI-CRITICAL!! L'avversario subisce " + danno + "danni!");


            }
                else{
                danno = (int) ( pg1.getStattsCalcEntity().getUtilizzoArmaX() + arma1.getDanno() + 30
                        - (0.1 + modificatoreDanno));




                System.out.println("Colpito! L'avversario subisce " + danno + " danni!");


            }
                valoriAttacco.add(tiroPerColpire);
                valoriAttacco.add(danno);

                return valoriAttacco;




        }

    private static List<Integer> fendentePesante(PgEntity pg1, ArmiEntity arma1) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Random rand = new Random();


        Double modificatoreDanno= generateRandomDouble(0.01,15.00);

        int danno = 0;

        int tiroPerColpire = (pg1.getStattsCalcEntity().getUtilizzoArmaX() + rand.nextInt(15) );


        List<Integer> valoriAttacco = new ArrayList<>();

        if(rand.nextInt(100) <= (arma1.getProbabilitaCriticoArma()+ 10))
        {
            danno = (int) ((int) (pg1.getStattsCalcEntity().getUtilizzoArmaX()+ arma1.getDanno() +30
                    - (0.1 + modificatoreDanno)) * arma1.getMoltiplicatoreCritico());


            System.out.println("CRI-CRI-CRITICAL!! L'avversario subisce " + danno + "danni!");


        }
        else{
            danno = (int) ((int) pg1.getStattsCalcEntity().getUtilizzoArmaX() + arma1.getDanno() + 30
                    - (0.1 + modificatoreDanno));






       System.out.println("Colpito! L'avversario subisce " +danno+" danni!");



        }
        valoriAttacco.add(tiroPerColpire);
        valoriAttacco.add(danno);

        return valoriAttacco;
    }



    public static double generateRandomDouble(double min, double max) {
        double x = (Math.random() * (max - min) + min);
        return Math.round(x * 100.0) / 100.0;
    }
}
