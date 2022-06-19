package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OggettiBattlegroundEntityDto {

  @JsonProperty("OggettoBattlegroundId")
  private Long OggettoBattlegroundId;

  @JsonProperty("Descrizione")
  private String descrizione;

  @JsonProperty("DimensioneBattleground")
  private String dimensioneBattleground;

  @JsonProperty("Copertura")
  private Boolean copertura;

  @JsonProperty("ValoreCopertura")
  private Double valoreCopertura;

  @JsonProperty("Loot")
  private Boolean loot;

  @JsonProperty("RandomLoot")
  private Double randomLoot;





}


