package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

        import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventarioEntity;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import lombok.Setter;

        import java.util.ArrayList;
        import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InventarioNewJSONresp {

    @JsonProperty
    private Long inventarioId;

    @JsonProperty
    private int base;

    @JsonProperty
    private int altezza;

    @JsonProperty
    private Long proprietario;

    @JsonProperty
    private List<OggettoInventarioEntity> oggetti = new ArrayList<OggettoInventarioEntity>();


}


