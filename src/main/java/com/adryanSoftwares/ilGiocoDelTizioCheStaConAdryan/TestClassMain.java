package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controller.restController.BGRestController;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controller.restController.OggettoRestController;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.OggettoDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.mapper.OggettoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@RestController
public class TestClassMain {


    @Autowired
    BGRestController bgrs;

    @Autowired
    OggettoRestController ogrsrs;

    boolean risposta = true;

   // @PostConstruct
    public void creaBattleground() {

        Scanner scanner = new Scanner(System.in);


        while (risposta == true) {



            BattleGroundDto battleGround = new BattleGroundDto();


            System.out.println("creiamo un nuovo battleGround ");
            System.out.println("inserisci weather condition");
            String weather = scanner.next();
            System.out.println("inserisci il tipo di ambiente");
            String ambiente = scanner.next();
            System.out.println("inserisci la grandezza del battleGround (ex: '3x4'; '6x6', '8x2'):");
            int base = scanner.nextInt();
            System.out.print(base + " x ");
            int altezza = scanner.nextInt();

            int[][] bgDimension = new int[base][altezza];
            String realCode = new String();
            String bgMapCode = new String();

            for (int i = 0; i < base; i++) {
                for (int j = 0; j < altezza; j++) {
                    System.out.println("inserisci l'id di ciò che c'è nella posizione " + i + " x " + j + " ");
                    String objectId = String.valueOf(scanner.nextInt());
                    realCode += i + j + "-" + objectId;
                    bgMapCode += "[" + i + "][" + j + "]=" + objectId + "; ";
                    System.out.println(i + " x " + j + ":  " + objectId);
                }
            }
            System.out.println("bgMapCode =" + bgMapCode);


            BattleGroundDto bgDto = new BattleGroundDto();
            bgDto.setMapCode(bgMapCode);
            bgDto.setMapSize(base + "x" + altezza);
            bgDto.setWeather(weather);
            bgDto.setAmbientazione(ambiente);
//------------------------------------------------------------------------
            OggettoMapper mapper2 = new OggettoMapper();
            OggettoDTO oggettoDTO = new OggettoDTO();

            OggettiEntity paperino= ogrsrs.saveOrUpdate(oggettoDTO);

            bgDto.setOggetto(paperino);



            bgrs.saveOrUpdate(bgDto,1);
            System.out.println("inserimento riuscito!");
            System.out.println("inserire un nuovo battlegrounz? (y/n)");
            String risposta2 = scanner.next();
            if (risposta2 == "n") {
                System.out.println("eso es"+risposta);
            }
            }
    }
        }

