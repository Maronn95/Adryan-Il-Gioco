package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

        import com.fasterxml.jackson.annotation.JsonProperty;
        import lombok.Getter;
        import lombok.Setter;

@Getter
@Setter
public class PoteriNewJSONresp {

    @JsonProperty
    private Integer idPotere;

    @JsonProperty
    private String name;

    @JsonProperty
    private String buff1;

    @JsonProperty
    private String buff2;

    @JsonProperty
    private int value1;

    @JsonProperty
    private int value2;

}

