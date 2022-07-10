package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.Inventario;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.InventarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioServiceImpl implements InventarioService {

    @Override
    public List<Inventario> getInventario() {
        return null;
    }


   @Override
    public Inventario getInventarioById(Long id) {
      /*  Inventario inventario = new Inventario();
        inventario.setBase(inventario.getInventario(id).getBase());
        inventario.setAltezza(inventario.getInventario(id).getAltezza());
        inventario.setOggetti(inventario.getInventario(id).getOggetti()); */
        return null;
    }
}
