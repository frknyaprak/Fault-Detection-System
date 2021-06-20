/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsk.arizatakipsistemi.models;

import java.sql.Timestamp;

/**
 *
 * @author fsk
 */
public class ViewArizaTable {
    
    private Long id;
    private String personelAdi;
    private Timestamp girisTarihi;
    private String durumu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }

    public Timestamp getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(Timestamp girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public String getDurumu() {
        return durumu;
    }

    public void setDurumu(String durumu) {
        this.durumu = durumu;
    }
    
    
    
}
