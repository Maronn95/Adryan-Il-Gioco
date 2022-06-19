package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.RepoImpl;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Repository.PGRepository;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
class PGrepoImpl <Req, Resp>  implements PGRepository<Req, Resp> {

    @Autowired
    JSONcrudRepository JCRUD;


    @Override
    public Resp selectById(Integer idJSONreq, Resp jsonResp, String table) throws IOException, ParseException {
        return (Resp) JCRUD.selectById(idJSONreq,jsonResp,table);
    }

    @Override
    public Resp creates(Req JsonReq, Resp JsonResp, String table) throws IOException, ParseException {
        return (Resp) JCRUD.creates(JsonReq, JsonResp, table);
    }
}
