package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.AvanzamentoStattsPureRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.StattsPureRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Service
public class AvanzamentiStattsPureUtils {

    @Autowired
    AvanzamentoStattsPureRepository avanzamentoStattsPureRepository;

    @Autowired
    StattsPureRepository stattsPureRepository;

    public void updateAvanzamentiStattsPure(PgEntity pgEntity) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        System.out.println("updateAvanzamentiStattsPure UPDATEavanzamentiStatts start");
        avanzamentoStattsPureRepository.update(pgEntity.getAvanzamentoStattsPureEntity());
        System.out.println("updateAvanzamentiStattsPure UPDATEavanzamentiStatts finish");
        controlloAvanzamentiStattsPure(pgEntity);
    }


    public void controlloAvanzamentiStattsPure(PgEntity pgEntity) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        System.out.println("controlloAvanzamentiStattsPure start");

        int i = 10;

        if(pgEntity.getAvanzamentoStattsPureEntity().getAvanzamentoVitaMax()>= i){
            int x=pgEntity.getStattsPureEntity().getVitaPura()+5;

            pgEntity.getStattsPureEntity().setVitaPura(x);
            System.out.println("controlloAvanzamentiStattsPure UPDATE start");
            stattsPureRepository.update(pgEntity.getStattsPureEntity());
            System.out.println("controlloAvanzamentiStattsPure UPDATE finish");

        }
        if(pgEntity.getAvanzamentoStattsPureEntity().getAvanzamentoForza()>=i){

            pgEntity.getStattsPureEntity().setForza(pgEntity.getStattsPureEntity().getForza()+1);
            System.out.println("controlloAvanzamentiStattsPure UPDATEForza start");
            stattsPureRepository.update(pgEntity.getStattsPureEntity());
            System.out.println("controlloAvanzamentiStattsPure UPDATEForza finish");

        }
        if(pgEntity.getAvanzamentoStattsPureEntity().getAvanzamentoCarisma()>=i){

            pgEntity.getStattsPureEntity().setCarisma(pgEntity.getStattsPureEntity().getCarisma()+1);
            System.out.println("controlloAvanzamentiStattsPure UPDATECarisma start");
            stattsPureRepository.update(pgEntity.getStattsPureEntity());
            System.out.println("controlloAvanzamentiStattsPure UPDATECarisma finish");

        }
        if(pgEntity.getAvanzamentoStattsPureEntity().getAvanzamentoCostituzione()>=i){

            pgEntity.getStattsPureEntity().setCostituzione(pgEntity.getStattsPureEntity().getCostituzione()+1);
            System.out.println("controlloAvanzamentiStattsPure UPDATECostituzione start");
            stattsPureRepository.update(pgEntity.getStattsPureEntity());
            System.out.println("controlloAvanzamentiStattsPure UPDATECostituzione finish");

        }
        if(pgEntity.getAvanzamentoStattsPureEntity().getAvanzamentoDestrezza()>=i){

            pgEntity.getStattsPureEntity().setDestrezza(pgEntity.getStattsPureEntity().getDestrezza()+1);
            System.out.println("controlloAvanzamentiStattsPure UPDATEDestrezza start");
            stattsPureRepository.update(pgEntity.getStattsPureEntity());
            System.out.println("controlloAvanzamentiStattsPure UPDATEDestrezza finish");

        }
        if(pgEntity.getAvanzamentoStattsPureEntity().getAvanzamentoIntelligenza()>=i){

            pgEntity.getStattsPureEntity().setIntelligenza(pgEntity.getStattsPureEntity().getIntelligenza()+1);
            System.out.println("controlloAvanzamentiStattsPure UPDATEIntelligenza start");
            stattsPureRepository.update(pgEntity.getStattsPureEntity());
            System.out.println("controlloAvanzamentiStattsPure UPDATEIntelligenza finish");

        }
        if(pgEntity.getAvanzamentoStattsPureEntity().getAvanzamentoSaggezza()>=i){

            pgEntity.getStattsPureEntity().setSaggezza(pgEntity.getStattsPureEntity().getSaggezza()+1);
            System.out.println("controlloAvanzamentiStattsPure UPDATESaggezza start");
            stattsPureRepository.update(pgEntity.getStattsPureEntity());
            System.out.println("controlloAvanzamentiStattsPure UPDATESaggezza finish");

        }
        if(pgEntity.getAvanzamentoStattsPureEntity().getAvanzamentoTrash()>=i){

            pgEntity.getStattsPureEntity().setTrash(pgEntity.getStattsPureEntity().getTrash()+1);
            System.out.println("controlloAvanzamentiStattsPure UPDATETrash start");
            stattsPureRepository.update(pgEntity.getStattsPureEntity());
            System.out.println("controlloAvanzamentiStattsPure UPDATETrash finish");

        }

    }

}
