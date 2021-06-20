/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsk.arizatakipsistemi.models;

/**
 *
 * @author fsk
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Personel_To_Ariza")
@Entity
public class PersonelToAriza {

    @Id
    @SequenceGenerator(allocationSize = 1,
            initialValue = 1,
            name = "sq_personeltoariza_id",
            sequenceName = "sq_personeltoariza_id")
    @GeneratedValue(generator = "sq_personeltoariza_id")
    private Long id;
    private Long personel_id;
    private Long ariza_id;

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

    public Long getAriza_id() {
        return ariza_id;
    }

    public void setAriza_id(Long ariza_id) {
        this.ariza_id = ariza_id;
    }
    
    
}
