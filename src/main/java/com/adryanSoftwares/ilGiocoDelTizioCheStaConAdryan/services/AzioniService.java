package com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.services;

import com.adryanSoftwares.ilGiocoDelTizioCheStaConAdryan.entity.AzioniEntity;
import org.springframework.stereotype.Service;

@Service
public interface AzioniService {

    //------------------------------------AZIONI EFFETTUATE------------------------------------

    AzioniEntity attaccoFisico(AzioniEntity azioniEntity);
    AzioniEntity tiroXcolpire(AzioniEntity azioniEntity);
    AzioniEntity calcoloDanni(AzioniEntity azioniEntity);
    AzioniEntity difesa(AzioniEntity azioniEntity);

    //------------------------------------AZIONI SUBITE----------------------------------------

    AzioniEntity subireAttaccoFisico (AzioniEntity azioniEntity);
    AzioniEntity aggiornamentoVita (AzioniEntity azioniEntity);

}
