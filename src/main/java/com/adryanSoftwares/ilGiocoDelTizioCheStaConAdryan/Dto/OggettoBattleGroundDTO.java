package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ArmiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ChestEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabiliEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OggettoBattleGroundDTO {

  @JsonProperty("idOggettoBattleGround")
  private Integer idOggettoBattleGround;

  @JsonProperty("oggettiEntity")
  private OggettiEntity oggettiEntity;

  @JsonProperty("armiEntity")
  private ArmiEntity armiEntity;

  @JsonProperty("protezioniIndossabiliEntity")
  private ProtezioniIndossabiliEntity protezioniIndossabiliEntity;

  @JsonProperty("chestEntity")
  private ChestEntity chestEntity;

  @JsonProperty("statusList")
  private List<Integer> statusList;


}