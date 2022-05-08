package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.mapper.BattleGroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.repositorys.BattleGroundRepo;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.BattleGroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BattleGroundServiceImpl implements BattleGroundService {

    @Autowired
    BattleGroundRepo BGRep;

    @Override
    public List<BattleGroundEntity> findAllByOrderByIdBattleGroundAsc() {
        return BGRep.findAllByOrderByIdBattleGroundAsc();
    }

    @Override
    public List<BattleGroundEntity> oldFindAll() {
        if (BGRep.findAll()!= null ){
            return (List<BattleGroundEntity>) BGRep.findAll();
        } else{
            return  null;
        }
    }

    @Override
    public Optional<BattleGroundEntity> findBGById(Long id) {

        Optional<BattleGroundEntity> BG = BGRep.findById(id);
        return BG;
    }

    @Override
    public void saveOrUpdate(BattleGroundEntity battleGround) {
        this.BGRep.save(battleGround);
    }

    @Override
    public BattleGroundDto saveOrUpdatePostman(BattleGroundDto battleGroundDto) {
        if (battleGroundDto != null) {
            BattleGroundEntity battleGround = BattleGroundMapper.dtoToEntity(battleGroundDto);
            battleGround = BGRep.save(battleGround);
            BattleGroundDto BGdto = new BattleGroundDto();
            BGdto = BattleGroundMapper.entityToDto(battleGround);
            return BGdto;
        }
        return null;
    }

    @Override
    public void deleteBG(Long idBG) {
        if (BGRep.findById(idBG)!= null) {
            Optional<BattleGroundEntity> BGEntity = BGRep.findById(idBG);
            BGRep.delete(BGEntity.get());
        }
    }
}
