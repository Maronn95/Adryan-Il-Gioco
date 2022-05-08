package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedEntityGraph;
import java.util.List;

@EnableJpaRepositories
public interface BattleGroundRepo extends JpaRepository <BattleGroundEntity, Long> {

    List<BattleGroundEntity> findAllByOrderByIdBattleGroundAsc();

}
