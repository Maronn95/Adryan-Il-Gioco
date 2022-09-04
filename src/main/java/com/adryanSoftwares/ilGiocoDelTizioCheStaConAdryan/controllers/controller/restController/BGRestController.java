package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.restController;


import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.api.BGApi;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.BattleGroundEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.BattleGroundMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattleGroundResponse.BattleGroundResponse;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.BattleGroundServiceImpl;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl.OggettoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BGRestController implements BGApi {

    @Autowired
    BattleGroundServiceImpl bgsi;
    OggettoServiceImpl ogsi;

    @Override
    public ResponseEntity<BattleGroundResponse> findAll(HttpServletRequest request) {

        BattleGroundResponse response = new BattleGroundResponse();
        List<BattleGroundEntity> entityList = bgsi.findAllByOrderByIdBattleGroundAsc();
        List<BattleGroundDto> dtoList = new ArrayList<BattleGroundDto>();

        for (int i = 0; i < entityList.size(); i++) {

            dtoList.add(BattleGroundMapper.entityToDto(entityList.get(i)));
        }
        response.setData(dtoList);
        return new ResponseEntity<BattleGroundResponse>(response, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<?> saveOrUpdate(BattleGroundDto battleGround, int tipoChiamata) {

        if(battleGround.getIdBattleGround()!=null){

           Optional<BattleGroundEntity> BGO = bgsi.findBGById(Long.valueOf(battleGround.getIdBattleGround()));
           BattleGroundEntity battleGroundEntity = BGO.get();
           battleGroundEntity = BattleGroundMapper.DtoUpdateEntity(battleGround);
           bgsi.saveOrUpdate(battleGroundEntity);
        }else {
            ArrayList paperinis = new ArrayList();

            paperinis = BattleGroundMapper.DtoNewEntity2(battleGround);
            BattleGroundEntity bge = new BattleGroundEntity();
            bge = (BattleGroundEntity) paperinis.get(0);
            //bgsi.saveOrUpdate(bge);
            OggettiEntity oge = new OggettiEntity();
            oge = (OggettiEntity) paperinis.get(1);
            ogsi.saveOrUpdate(oge);

            bge.setOggetto(oge);
            bgsi.saveOrUpdate(bge);


            bgsi.saveOrUpdate(bge);
        }
        return ResponseEntity.ok().body("Inserimento effettuato con successo !");
    }

    @Override
    public ResponseEntity<?> saveOrUpdatePostman(BattleGroundDto battleGround) {
        BattleGroundDto BGdto = bgsi.saveOrUpdatePostman(battleGround);
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
