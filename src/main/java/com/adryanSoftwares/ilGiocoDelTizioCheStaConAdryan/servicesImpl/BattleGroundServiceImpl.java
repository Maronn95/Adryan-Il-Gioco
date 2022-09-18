package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.BattlegroundRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.BattleGroundService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;


@Service
public class BattleGroundServiceImpl implements BattleGroundService {

    @Autowired
    private BattlegroundRepository BGRep;

    @Override
    public List<BattlegroundEntity> findAllByOrderByIdBattleGroundAsc() {
        //return BGRep.findAllByOrderByIdBattleGroundAsc();
        return null;
    }

    @Override
    public List<BattlegroundEntity> oldFindAll() {
        /*if (BGRep.findAll()!= null ){
            return (List<BattleGroundEntity>) BGRep.findAll();
        } else{
            return  null;
        }*/
        return  null;
    }

    @Override
    public Optional<BattlegroundDto> findBGById(Long id) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Optional<BattlegroundDto> BG = (Optional<BattlegroundDto>) BGRep.selectById(Math.toIntExact(id));
        return BG;

    }

    @Override
    public void saveOrUpdate(BattlegroundDto dto) {

        //this.BGRep.save(battleGround);
    }

    @Override
    public BattlegroundDto saveOrUpdatePostman(BattlegroundDto battleGroundDto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        if (battleGroundDto != null) {
            BattlegroundEntity battleGround = BattlegroundMapper.dtoToEntity(battleGroundDto);
            battleGround = (BattlegroundEntity) BGRep.creates(battleGround);
            BattlegroundDto BGdto = new BattlegroundDto();
            BGdto = BattlegroundMapper.entityToDto(battleGround);
            return BGdto;
        }
        return null;
    }

    @Override
    public void deleteBG(Long idBG) {
        /*if (BGRep.findById(idBG)!= null) {
            Optional<BattleGroundEntity> BGEntity = BGRep.findById(idBG);
            BGRep.delete(BGEntity.get());
        }*/
    }
}
