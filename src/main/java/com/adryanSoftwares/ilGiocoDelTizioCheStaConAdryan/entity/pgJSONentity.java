package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Dto.StattsPureDTO;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.Requests.PgNewJSONreq;
import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses.PgNewJSONresp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
