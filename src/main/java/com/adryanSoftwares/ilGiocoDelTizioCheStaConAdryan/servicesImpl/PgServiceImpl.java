package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.servicesImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.PgNewJSONreq;
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

        PgEntity pg = new PgEntity();
        /*pg.setIdPg(pg.getPg(idPg).getIdPg());
        pg.setName(pg.getPg(idPg).getName());
        pg.setStattsPureEntity(pg.getPg(idPg).getStattsPureEntity());
        pg.getPg(idPg);*/
        return pg;
    }

    private PgNewJSONreq convertToDto (PgEntity pgEntity) {
        PgNewJSONreq pgNewJSONreq = new PgNewJSONreq();

        //pgNewJSONDTO.setIdPg(pgEntity.getIdPg());
        pgNewJSONreq.setName(pgEntity.getName());
        //pgDTO.setStattsPureDTO(pgEntity.getStattsPureEntity());
        //System.out.println("PgDTO convertToDto = "+ pgNewJSONDTO.getIdPg()+pgEntity.getName()+pgEntity.getStattsPureEntity());
        return pgNewJSONreq;
    }

    private PgEntity convertToEntity (PgNewJSONreq pgNewJSONreq) {
        PgEntity pgEntity = new PgEntity();
    //  pgEntity.setIdPg(pgNewJSONDTO.getIdPg());
        pgEntity.setName(pgNewJSONreq.getName());
        //pgEntity.setStattsPureEntity(pgDTO.setStattsPureDTO(););

        return pgEntity;
    }

    @Override
    public PgNewJSONreq setPg(PgNewJSONreq pgNewJSONreq) {
        //return convertToDto(this.pgRepository.save(convertToEntity(pgDTO)));
        return null;
    }

    @Override
    public List<PgNewJSONreq> getAllPg() {
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

