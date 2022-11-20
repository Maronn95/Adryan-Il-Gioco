package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.ProtezioniIndossabiliDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.OggettoMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Mapper.ProtezioniIndossabiliMapper;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.ProtezioniIndossabiliRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettiEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.ProtezioniIndossabiliEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ProtezioniIndossabiliService;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.ProtezioniService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;

@Service
public class ProtezioniIndossabiliServiceImpl implements ProtezioniIndossabiliService {

@Autowired
private ProtezioniIndossabiliRepository protezioniIndossabiliRepository;
    @Override
    public ProtezioniIndossabiliEntity newProtezione(ProtezioniIndossabiliDTO dto) throws IOException, ParseException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ProtezioniIndossabiliEntity) protezioniIndossabiliRepository.creates(ProtezioniIndossabiliMapper.dtoToEntity(dto));

    }

    @Override
    public ProtezioniIndossabiliEntity selectProtezione(Integer id) throws IOException, ParseException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        return (ProtezioniIndossabiliEntity) protezioniIndossabiliRepository.selectById(id);
    }

    @Override
    public ProtezioniIndossabiliEntity delete(Integer id) throws IOException, ParseException, InterruptedException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        return (ProtezioniIndossabiliEntity) protezioniIndossabiliRepository.delete(id);
    }

    @Override
    public ProtezioniIndossabiliEntity update(ProtezioniIndossabiliDTO dto) throws IOException, ParseException, NoSuchFieldException, InterruptedException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        ProtezioniIndossabiliEntity p = (ProtezioniIndossabiliEntity) protezioniIndossabiliRepository.selectById(dto.getIdProtezioniIndossabili());
        return (ProtezioniIndossabiliEntity) protezioniIndossabiliRepository.update(ProtezioniIndossabiliMapper.dtoUpdateEntity(dto,p));
    }
}
