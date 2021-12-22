package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mock.MockPg;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.StattsPureEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.StattsCalcolateRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.StattsCalcolateService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.StattsCalcolateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		StattsPureEntity dido = new StattsPureEntity();
		PgEntity pgEntity = new PgEntity();
		StattsCalcolateServiceImpl stattsCalcolateServiceImpl = new StattsCalcolateServiceImpl();

		stattsCalcolateServiceImpl.calcoloCa();

		System.out.println("Id "+dido.getId());
		System.out.println("Punti vita "+dido.getVita());
		System.out.println("Nome "+pgEntity.getName());
		System.out.println("Forza "+dido.getForza());
		System.out.println("Destrezza "+dido.getDestrezza());
		System.out.println("Costituzione "+dido.getCostituzione());
		System.out.println("Intelligenza "+dido.getIntelligenza());
		System.out.println("Carisma "+dido.getCarisma());
		System.out.println("Saggezza "+dido.getSaggezza());

		System.out.println("CA="+dido.getCa());

		System.out.print("Tutto OK");
	}

}
