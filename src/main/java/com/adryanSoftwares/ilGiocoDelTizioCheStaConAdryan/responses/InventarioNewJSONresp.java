package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.responses;

        import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.OggettoInventario;
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
    private Long idInventario;

    @JsonProperty
    private int base;

    @JsonProperty
    private int altezza;

    @JsonProperty
    private Long proprietario;

    @JsonProperty
    private List<OggettoInventario> oggetti = new ArrayList<OggettoInventario>();


}


