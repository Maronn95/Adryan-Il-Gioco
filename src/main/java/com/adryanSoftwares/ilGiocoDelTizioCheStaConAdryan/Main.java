package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRespository")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		System.out.print("Tutto OK");
	}

}
