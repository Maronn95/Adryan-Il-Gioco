package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import org.json.simple.parser.ParseException;
import org.springframework.data.annotation.Transient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


import java.io.IOException;


public interface  JSONrepository <Req, Resp> {

    Resp selectById(Integer idJSONreq, Resp jsonResp, String table) throws IOException, ParseException;

    Resp creates(Req JsonReq, Resp JsonResp, String table) throws IOException, ParseException;
}
