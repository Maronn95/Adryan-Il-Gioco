package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AzioniEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;

import javax.persistence.NamedEntityGraph;

@EnableJpaRepositories
@NamedEntityGraph
public interface AzioniRepo extends JpaRepository<AzioniEntity, Long> {
}
