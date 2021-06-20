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
@Table(name = "Is_Yuku")
@Entity
public class IsYuku {

    @Id
    @SequenceGenerator(allocationSize = 1,
            initialValue = 1,
            name = "sq_isyuku_id",
            sequenceName = "sq_isyuku_id")
    @GeneratedValue(generator = "sq_isyuku_id")
    private Long id;
    private Long personel_id;
    private int yuk;

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

    public int getYuk() {
        return yuk;
    }

    public void setYuk(int yuk) {
        this.yuk = yuk;
    }
    
    
}
