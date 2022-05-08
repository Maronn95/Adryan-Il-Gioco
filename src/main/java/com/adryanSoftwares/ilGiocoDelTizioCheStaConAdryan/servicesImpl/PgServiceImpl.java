package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.PgDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services.PgService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PgServiceImpl implements PgService {


    @Override
    public PgEntity setStattPure(Long IdPg, Long IdStattsPure) {
        /*PgEntity pgEntity = pgRepository.getById(IdPg);
        StattsPureEntity stattsPureEntity = stattsPureRepository.getById(IdStattsPure);
        pgEntity.setStattsPureEntity(stattsPureEntity);

        pgRepository.save(pgEntity);

        System.out.println("pg = "+pgEntity);
        return pgEntity;*/
        return null;
    }

    @Override
    public PgEntity getPg(Long idPg) {
        /*System.out.println("            "+idPg);
        PgEntity pgEntity = pgRepository.findById(idPg).get();

                if (pgEntity!=null){
            StattsPureServiceImpl stattsPureServiceImpl=new StattsPureServiceImpl();
            pgEntity.setStattsPureEntity(stattsPureServiceImpl.getStattById(idPg));
            System.out.println("Id trovato");

            return pgEntity;
            }

        System.out.println("Id non trovato");*/
        return null;
    }

    private PgDTO convertToDto (PgEntity pgEntity) {
        PgDTO pgDTO = new PgDTO();

        pgDTO.setIdPg(pgEntity.getIdPg());
        pgDTO.setName(pgEntity.getName());
        pgDTO.setStattsPureEntity(pgEntity.getStattsPureEntity());
        System.out.println("PgDTO convertToDto = "+pgDTO.getIdPg()+pgEntity.getName()+pgEntity.getStattsPureEntity());
        return pgDTO;
    }

    private PgEntity convertToEntity (PgDTO pgDTO) {
        PgEntity pgEntity = new PgEntity();

        pgEntity.setIdPg(pgDTO.getIdPg());
        pgEntity.setName(pgDTO.getName());
        pgEntity.setStattsPureEntity(pgDTO.getStattsPureEntity());

        return pgEntity;
    }

    @Override
    public PgDTO setPg(PgDTO pgDTO) {
        //return convertToDto(this.pgRepository.save(convertToEntity(pgDTO)));
        return null;
    }

    @Override
    public List<PgDTO> getAllPg() {
        /*List<PgEntity> Pgs = pgRepository.findAll();
        List<PgDTO> pgsDTO = new ArrayList<>();
        for(PgEntity pgEntity : Pgs){
            PgDTO pgDTO = convertToDto(pgEntity);
            pgsDTO.add(pgDTO);
        }*/
        //return pgsDTO;
        return null;
    }
}

