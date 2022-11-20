package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventarioEquipaggiatoNewJSONreq {

    @JsonProperty
    private Integer idInventarioEquipaggiato;

    @JsonProperty
    private List<Integer> listaInventarioEquipaggiatoEntity;

    //[0,1,2,3,4,5,6,7,8,9,10,11,12]
    //posizione 0 = copri capo
    //posizione 1 = busto
    //posizione 2 = Avambracci
    //posizione 3 = guanti
    //posizione 4 = para stinchi
    //posizione 5 = scarpe
    //posizione 6 = collana
    //posizione 7 = anelli
    //posizione 8 = occhiali
    //posizione 9 = cinta
    //posizione 10 = mano sinistra
    //posizione 11 = mano destra
    //posizione 12 = orecchini

}
