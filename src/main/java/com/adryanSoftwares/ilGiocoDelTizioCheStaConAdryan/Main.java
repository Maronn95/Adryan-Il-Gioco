package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mock.MockPg;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		MockPg mockPg = new MockPg();
		mockPg.printPg();
		System.out.print("Tutto OK");
	}

}
