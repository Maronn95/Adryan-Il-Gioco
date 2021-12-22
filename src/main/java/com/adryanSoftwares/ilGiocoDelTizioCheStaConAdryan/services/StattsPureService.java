package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import java.util.List;

public interface StattsPureService {

    List<StattsPureDTO> getAllStatts();

    StattsPureDTO getStatt(String name);

    StattsPureDTO setStatt(Long id, StattsPureDTO stattsPureDTO);
}
