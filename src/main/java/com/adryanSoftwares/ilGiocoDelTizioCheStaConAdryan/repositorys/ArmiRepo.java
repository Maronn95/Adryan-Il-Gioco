package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiBattlegroundEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.NamedEntityGraph;

@EnableJpaRepositories
@NamedEntityGraph
public interface ArmiRepo extends JpaRepository<Armi, Long> {
}
