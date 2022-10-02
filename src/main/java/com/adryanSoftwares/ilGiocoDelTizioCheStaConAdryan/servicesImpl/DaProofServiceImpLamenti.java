package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ArmiRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.ArmiNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.DaProofService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.UtilProof;
import jdk.jshell.execution.Util;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class DaProofServiceImpLamenti implements DaProofService {
    @Autowired
    ArmiRepository armiRepo;

    @Autowired
    PGRepository ppGrepo;

    @Override
    public PgEntity gedDaProof(ArmiNewJSONreq objection) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println(objection.getIdProof());
        ArmiEntity yoloLife = (ArmiEntity) armiRepo.selectById(Integer.valueOf(objection.getIdProof()));
        PgEntity yoLifeTimes2 = (PgEntity) ppGrepo.selectById((int) (yoloLife.getDanno()*2));
        UtilProof.doSomething(yoLifeTimes2);

        return yoLifeTimes2;
    }
}
