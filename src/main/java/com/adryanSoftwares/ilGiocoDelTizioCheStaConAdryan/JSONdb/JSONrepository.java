package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import org.json.simple.parser.ParseException;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


import java.io.IOException;

@NoRepositoryBean
public interface JSONrepository<Req, Resp>{


    <Resp> Resp create (Req JsonReq, Resp JsonResp, String table) throws IOException, ParseException;

    <Resp2> Resp2 slectById(Integer idJSONreq, String table) throws IOException, ParseException;
}
