/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsk.arizatakipsistemi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author fsk
 */
@Table(name = "Personel_Ariza_Listesi")
@Entity
public class PersonelArizaListesi {

    @Id
    @SequenceGenerator(allocationSize = 1,
            initialValue = 1,
            name = "sq_personelarizalistesi_id",
            sequenceName = "sq_personelarizalistesi_id")
    @GeneratedValue(generator = "sq_personelarizalistesi_id")
    private Long id;
    private Long personel_id;
    private Long arizakaydi_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonel_id() {
        return personel_id;
    }

    public void setPersonel_id(Long personel_id) {
        this.personel_id = personel_id;
    }

    public Long getArizakaydi_id() {
        return arizakaydi_id;
    }

    public void setArizakaydi_id(Long arizakaydi_id) {
        this.arizakaydi_id = arizakaydi_id;
    }
    
    

}
