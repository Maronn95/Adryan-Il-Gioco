package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Armi;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedEntityGraph;

@NamedEntityGraph
public interface ArmiRepo extends JpaRepository<Armi, Long> {
}
