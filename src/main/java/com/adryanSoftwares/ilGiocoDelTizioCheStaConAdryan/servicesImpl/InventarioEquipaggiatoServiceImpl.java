package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.InventarioEquipaggiatoRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.OggettoInventarioRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventarioEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.InventarioEquipaggiatoNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.InventarioEquipaggiatoService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class InventarioEquipaggiatoServiceImpl implements InventarioEquipaggiatoService {

    @Autowired
    InventarioEquipaggiatoRepository inventarioEquipaggiatoRepository;

    @Autowired
    PGRepository pgRepository;

    @Autowired
    OggettoInventarioRepository oggettoInventarioRepository;

    @Override
    public InventarioEquipaggiatoNewJSONresp equipaggiaOggetto(Integer idPg, Integer oggettoDaEquipaggiare) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, InterruptedException {
        PgEntity pg = (PgEntity) pgRepository.selectById(idPg);
        List<Integer> listaEquipaggiati = (List<Integer>) pg.getInventarioEquipaggiatoEntity();

        OggettoInventarioEntity oggettoDaEquipaggiareEntity = (OggettoInventarioEntity) oggettoInventarioRepository.selectById(oggettoDaEquipaggiare);

        /*switch (oggettoDaEquipaggiareEntity.getTipoOggetto()) {

            case "copriCapo":
                listaEquipaggiati.set(0,oggettoDaEquipaggiare);

                break;

            case "busto":
                listaEquipaggiati.set(1,oggettoDaEquipaggiare);
                break;

            case "avambracci":
                listaEquipaggiati.set(2,oggettoDaEquipaggiare);
                break;

            case "guanti":
                listaEquipaggiati.set(3,oggettoDaEquipaggiare);
                break;

            case "paraStinchi":
                listaEquipaggiati.set(4,oggettoDaEquipaggiare);
                break;

            case "scarpe":
                listaEquipaggiati.set(5,oggettoDaEquipaggiare);
                break;

            case "collana":
                listaEquipaggiati.set(6,oggettoDaEquipaggiare);
                break;

            case "anelli":
                listaEquipaggiati.set(7,oggettoDaEquipaggiare);
                break;

            case "occhiali":
                listaEquipaggiati.set(8,oggettoDaEquipaggiare);
                break;

            case "cinta":
                listaEquipaggiati.set(9,oggettoDaEquipaggiare);
                break;

            case "manoSinistra":
                listaEquipaggiati.set(10,oggettoDaEquipaggiare);
                break;

            case "manoDestra":
                listaEquipaggiati.set(11,oggettoDaEquipaggiare);
                break;

            case "orecchini":
                listaEquipaggiati.set(12,oggettoDaEquipaggiare);
                break;

        }*/

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

        inventarioEquipaggiatoRepository.update(listaEquipaggiati);

        return (InventarioEquipaggiatoNewJSONresp) listaEquipaggiati;
    }
}
