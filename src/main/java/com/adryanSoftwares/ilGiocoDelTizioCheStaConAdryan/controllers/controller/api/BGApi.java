package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.controllers.controller.api;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.BattleGroundDto;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.BattleGroundResponse.BattleGroundResponse;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Api(value="/BattleGround", tags="BG")
@RequestMapping(value="/BattleGround")
public interface BGApi {

    @ApiOperation(value="Api per la ricerca di tutti i BG", nickname="findAllBG", response= BattleGroundResponse.class ,responseContainer="", tags="findAllBG")
    @ApiResponses(value= {
            @ApiResponse(code=200, message="succesfuloperation",response= BattleGroundResponse.class ),
            @ApiResponse(code=400, message="not found", response=BattleGroundResponse.class),
            @ApiResponse(code=500, message="internal server error", response= BattleGroundResponse.class)})
    @GetMapping(value="/findAll", produces= "application/json")
    ResponseEntity<BattleGroundResponse> findAll(HttpServletRequest request);


    @ApiOperation(value="Api per l'inserimento e la modifica di un battleGround", nickname="newBG",
            response=BattleGroundResponse.class ,responseContainer="", tags="newBG")
    @ApiResponses(value= {
            @ApiResponse(code=200, message="succesfuloperation",response= BattleGroundResponse.class ),
            @ApiResponse(code=400, message="not found", response=BattleGroundResponse.class),
            @ApiResponse(code=500, message="internal server error", response= BattleGroundResponse.class)})
    @PostMapping(value="/newBG", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> saveOrUpdate(@ApiParam(value="Parametri con cui inserire o modificare il battleGround", required=true)
                                      @Validated
                                      @RequestBody BattleGroundDto battleGround, int tipoChiamata);



    @ApiOperation(value="Api per l'inserimento e la modifica di un battleGround", nickname="newBG",
            response=BattleGroundResponse.class ,responseContainer="", tags="newBG")
    @ApiResponses(value= {
            @ApiResponse(code=200, message="succesfuloperation",response= BattleGroundResponse.class ),
            @ApiResponse(code=400, message="not found", response=BattleGroundResponse.class),
            @ApiResponse(code=500, message="internal server error", response= BattleGroundResponse.class)})
    @PostMapping(value="/new", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> saveOrUpdatePostman(@ApiParam(value="Parametri con cui inserire o modificare il battleGround", required=true)
                                   @Validated
                                   @RequestBody BattleGroundDto battleGround);
}
