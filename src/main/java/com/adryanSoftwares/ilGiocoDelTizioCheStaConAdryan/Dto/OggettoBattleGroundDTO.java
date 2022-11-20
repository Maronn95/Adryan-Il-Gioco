package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Enum.Rarita;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OggettoBattleGroundDTO {

  @JsonProperty("idOggettoBattleGround")
  private Integer idOggettoBattleGround;

  @JsonProperty("idArmi")
  private Integer idArmi;

  @JsonProperty("idOggetto")
  private Integer idOggetto;

  @JsonProperty("idProtezione")
  private Integer idProtezione;

  @JsonProperty("base")
  private Integer base;

  @JsonProperty("altezza")
  private Integer altezza;

  @JsonProperty("nome")
  private String nome;

  @JsonProperty("descrizione")
  private String descrizione;

  @JsonProperty("dimensioneBattleground")
  private String dimensioneBattleground;

  @JsonProperty("copertura")
  private Boolean copertura;

  @JsonProperty("valoreCopertura")
  private Double valoreCopertura;

  @JsonProperty("loot")
  private Boolean loot;

  @JsonProperty("randomLoot")
  private Double randomLoot;

  @JsonProperty("rarita")
  private Rarita rarita;

  @JsonProperty("valoreRarita")
  private Integer valoreRarita;

  @JsonProperty("livello")
  private Integer livello;





}


