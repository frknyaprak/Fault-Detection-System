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
@Table(name = "Hizmet")
@Entity
public class Zimmet {

    @Id
    @SequenceGenerator(allocationSize = 1,
            initialValue = 1,
            name = "sq_hizmet_id",
            sequenceName = "sq_hizmet_id")
    @GeneratedValue(generator = "sq_hizmet_id")
    private Long id;
    private Long personel_id;
    private Long donanim_id;
    private Long birim_id;

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

    public Long getDonanim_id() {
        return donanim_id;
    }

    public void setDonanim_id(Long donanim_id) {
        this.donanim_id = donanim_id;
    }

    public Long getBirim_id() {
        return birim_id;
    }

    public void setBirim_id(Long birim_id) {
        this.birim_id = birim_id;
    }
    
    

}
