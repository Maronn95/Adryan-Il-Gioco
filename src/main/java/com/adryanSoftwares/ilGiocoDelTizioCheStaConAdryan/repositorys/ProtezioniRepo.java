package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabili;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.NamedEntityGraph;

@EnableJpaRepositories
@NamedEntityGraph
public interface ProtezioniRepo extends JpaRepository <ProtezioniIndossabili, Long> {
}
