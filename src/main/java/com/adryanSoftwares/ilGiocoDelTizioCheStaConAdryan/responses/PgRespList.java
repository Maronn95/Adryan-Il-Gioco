package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.PgEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PgRespList {

    @JsonProperty
    List<PgNewJSONresp> pgList;

    public PgRespList (List<PgEntity> entities){
        if ( this.pgList == null){
            this.pgList = new ArrayList<>();
        }
        for ( PgEntity entity : entities){
            pgList.add(new PgNewJSONresp(entity));
        }
    }
}
