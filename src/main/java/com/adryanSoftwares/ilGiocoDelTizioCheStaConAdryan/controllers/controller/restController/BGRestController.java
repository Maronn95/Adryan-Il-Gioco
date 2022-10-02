package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.restController;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattlegroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattlegroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.api.BGApi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattlegroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattleGroundResponse.BattleGroundResponse;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.BattleGroundServiceImpl;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.OggettoServiceImpl;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BGRestController implements BGApi {

    @Autowired
    BattleGroundServiceImpl battleGroundServiceImpl;
    OggettoServiceImpl oggettoServiceImpl;

    @Override
    public ResponseEntity<BattleGroundResponse> findAll(HttpServletRequest request) {

        BattleGroundResponse response = new BattleGroundResponse();
        List<BattlegroundEntity> entityList = battleGroundServiceImpl.findAllByOrderByIdBattleGroundAsc();
        List<BattlegroundDto> dtoList = new ArrayList<BattlegroundDto>();

        for (int i = 0; i < entityList.size(); i++) {

            dtoList.add(BattlegroundMapper.entityToDto(entityList.get(i)));
        }
        response.setData(dtoList);
        return new ResponseEntity<BattleGroundResponse>(response, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<?> saveOrUpdate(BattlegroundDto battleGround, int tipoChiamata) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        if(battleGround.getIdBattleground()!=null){

           Optional<BattlegroundDto> BGO = battleGroundServiceImpl.findBGById(Long.valueOf(battleGround.getIdBattleground()));
           BattlegroundDto battleGroundDto = battleGround;
           battleGroundServiceImpl.saveOrUpdate(battleGroundDto);
        }else {
            ArrayList paperinis = new ArrayList();

            paperinis = BattlegroundMapper.DtoNewEntity2(battleGround);
            BattlegroundEntity bge = (BattlegroundEntity) paperinis.get(0);
            OggettiEntity oge = (OggettiEntity) paperinis.get(1);
            oggettoServiceImpl.saveOrUpdate(oge);

            bge.setOggetto(oge);
            battleGroundServiceImpl.saveOrUpdate(BattlegroundMapper.entityToDto(bge));

        }
        return ResponseEntity.ok().body("Inserimento effettuato con successo !");
    }

    public ResponseEntity<?> saveOrUpdatePostman(BattlegroundDto battleGround) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        BattlegroundDto BGdto = battleGroundServiceImpl.saveOrUpdatePostman(battleGround);
        return new ResponseEntity<>(BGdto, HttpStatus.OK);
    }
    /*	@Override
	public ResponseEntity<?> nuovoApplicativo(HttpServletRequest request, HttpStatus status, ApplicativoDto body) {
	// if (body.getChiaveApplicativo() !=null) {
		Applicativo app;
		if(body.getChiaveApplicativo()!=null){
			app = appImpl.getApplicativoById(body.getChiaveApplicativo());
			app = ApplicativoMapper.DtoUpdateEntity(body, app);

		}else {
			app = ApplicativoMapper.DtoToEntity(body);

		}
				appImpl.saveOrUpdate(app);
	//}
	return ResponseEntity.ok().body("Inserimento effettuato con successo !");
	}*/
}
