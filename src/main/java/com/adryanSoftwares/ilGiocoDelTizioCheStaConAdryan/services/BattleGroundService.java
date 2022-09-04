package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;

import java.util.List;
import java.util.Optional;

public interface BattleGroundService{

     List<BattleGroundEntity> findAllByOrderByIdBattleGroundAsc();

     List<BattleGroundEntity> oldFindAll();

     Optional<BattleGroundEntity> findBGById(Long idBG);

    void saveOrUpdate(BattleGroundEntity battleGround);
    BattleGroundDto saveOrUpdatePostman (BattleGroundDto battleGroundDto);

    void deleteBG(Long idBG);


}
