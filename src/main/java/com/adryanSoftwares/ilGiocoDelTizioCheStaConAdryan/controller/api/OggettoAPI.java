package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controller.api;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.dto.OggettoDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattleGroundResponse.BattleGroundResponse;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattleGroundResponse.OggettoResponse;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value="/Oggetto", tags="OG")
@RequestMapping(value="/Oggetto")
public interface OggettoAPI {


    @ApiOperation(value="Api per l'inserimento e la modifica di un oggetto", nickname="updateOG",
            response= OggettoResponse.class ,responseContainer="", tags="updateOG")
    @ApiResponses(value= {
            @ApiResponse(code=200, message="succesfuloperation",response= BattleGroundResponse.class ),
            @ApiResponse(code=400, message="not found", response=BattleGroundResponse.class),
            @ApiResponse(code=500, message="internal server error", response= BattleGroundResponse.class)})
    @PostMapping(value="/newBG", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    OggettiEntity saveOrUpdate(@ApiParam(value="Parametri con cui inserire o modificare il battleGround", required=true)
                                   @Validated
                                   @RequestBody OggettoDTO oggettoDTO);
}
