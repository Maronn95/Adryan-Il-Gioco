package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.Responses.PgNewJSONresp;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.ALLDTO.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONcrudRepository;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.JSONdb.JSONid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
public class pgJSONentity  {

    final String table = "PG";
    final String path = "\\src\\main\\java\\com\\adryanSoftwares\\ilGiocoDelTizioCheStaConAdryan\\JSONdb\\JSONpg\\";

    Class <PgNewJSONreq> Req;
    Class <PgNewJSONresp> Resp;


    @Getter
    @NoArgsConstructor
    class pgJSONParamethers{


        //JSONid idPG = new JSONid(table) ;

        String name;

        StattsPureDTO stattsPureDTO;



        public void setName(String name) {
            this.name = name;
        }
    }

}
