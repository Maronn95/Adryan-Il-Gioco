package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;


import java.io.IOException;


public interface  JSONrepository <Req, Resp> {

    <Resp> Resp selectById(Integer idJSONreq, Resp jsonResp, String table) throws IOException, ParseException;

    <Resp> Resp creates(Req JsonReq, Resp JsonResp, String table) throws IOException, ParseException;
}
