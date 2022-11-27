package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.InventarioEquipaggiatoNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.InventarioEquipaggiatoNewJSONresp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InventarioEquipaggiatoEntity {

    private String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONInventarioEquipaggiato\\";
    private String table="InventarioEquipaggiato";
    private InventarioEquipaggiatoNewJSONreq req;
    private InventarioEquipaggiatoNewJSONresp resp;

    private Integer idInventarioEquipaggiato;

    private List <Integer> listaInventarioEquipaggiatoEntity;

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
