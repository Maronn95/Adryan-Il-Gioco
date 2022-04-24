package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.NamedEntityGraph;

@EnableJpaRepositories
@NamedEntityGraph
public interface OggettiInventarioRepo extends JpaRepository<OggettoInventario, Long> {
}
