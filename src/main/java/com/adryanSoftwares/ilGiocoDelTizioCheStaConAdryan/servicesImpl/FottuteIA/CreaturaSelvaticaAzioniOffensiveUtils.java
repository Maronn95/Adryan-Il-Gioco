package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.FottuteIA;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.CreaturaSelvaticaEntity;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaturaSelvaticaAzioniOffensiveUtils {

        public static List<Integer> eseguiAzioneDinamicamente(CreaturaSelvaticaEntity creaturaSelvaticaEntity, String azione) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

            switch (azione) {
                case "artigliata":
                    return artigliata(creaturaSelvaticaEntity);

                case "azzanna":
                    return azzanna(creaturaSelvaticaEntity);

                case "ringhia":
                    return ringhia(creaturaSelvaticaEntity);
            }

            System.out.println("Porco Dio CreaturaSelvaticaAzioniOffensiveUtils");
            return null;
        }

        private static List<Integer> artigliata(CreaturaSelvaticaEntity creaturaSelvaticaEntity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

            Random rand = new Random();

            //ArmiEntity arma1= (ArmiEntity) armiRepository.selectById(idArma);

            Double modificatoreDanno= generateRandomDouble(0.01,25.00);

            int danno = 0;

            int tiroPerColpire = (creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX() + rand.nextInt(20) );

            List<Integer> valoriAttacco = new ArrayList<>();

            if(rand.nextInt(100) <= (2+ 10))
            {
                danno = (int) ((int) (creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX()+ 10 +30
                        - (0.1 + modificatoreDanno)) * 2);

                System.out.println("Critico! L'avversario subisce " + danno + "danni!");

            }
            else{
                danno = (int) ( creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX() + 10 + 30
                        - (0.1 + modificatoreDanno));

                System.out.println("Colpito! L'avversario subisce " + danno + " danni!");

            }
            valoriAttacco.add(tiroPerColpire);
            valoriAttacco.add(danno);

            return valoriAttacco;

        }


    private static List<Integer> ringhia(CreaturaSelvaticaEntity creaturaSelvaticaEntity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Random rand = new Random();
        //ArmiEntity arma1= (ArmiEntity) armiRepository.selectById(idArma);

        Double modificatoreDanno= generateRandomDouble(0.01,25.00);
        int danno = 0;
        int tiroPerColpire = (creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX() + rand.nextInt(20) );

        List<Integer> valoriAttacco = new ArrayList<>();

        if(rand.nextInt(100) <= (2+ 10))
        {
            danno = (int) ((int) (creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX()+ 10 +30
                    - (0.1 + modificatoreDanno)) * 2);
            System.out.println("CRI-CRI-CRITICAL!! L'avversario subisce " + danno + "danni!");
        }
        else{
            danno = (int) ( creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX() + 10 + 30
                    - (0.1 + modificatoreDanno));
            System.out.println("Colpito! L'avversario subisce " + danno + " danni!");

        }
        valoriAttacco.add(tiroPerColpire);
        valoriAttacco.add(danno);

        return valoriAttacco;

    }



        private static List<Integer> azzanna(CreaturaSelvaticaEntity creaturaSelvaticaEntity) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
            Random rand = new Random();

            Double modificatoreDanno= generateRandomDouble(0.01,15.00);

            int danno = 0;

            int tiroPerColpire = (creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX() + rand.nextInt(15) );

            List<Integer> valoriAttacco = new ArrayList<>();

            if(rand.nextInt(100) <= (2+ 10))
            {
                danno = (int) ((int) (creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX()+ 15 +30
                        - (0.1 + modificatoreDanno)) * 2);

                System.out.println("CRI-CRI-CRITICAL!! L'avversario subisce " + danno + "danni!");

            }
            else{
                danno = (int) ((int) creaturaSelvaticaEntity.getStattsCalcEntity().getUtilizzoArmaX() + 15 + 30
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

