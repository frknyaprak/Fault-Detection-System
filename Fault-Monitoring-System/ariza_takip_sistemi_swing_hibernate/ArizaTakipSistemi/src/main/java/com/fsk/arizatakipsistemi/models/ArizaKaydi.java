/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsk.arizatakipsistemi.models;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author fsk
 */
@Table(name = "Ariza_Kaydi")
@Entity
public class ArizaKaydi {

    @Id
    @SequenceGenerator(allocationSize = 1,
            initialValue = 1,
            name = "sq_arizakaydi_id",
            sequenceName = "sq_arizakaydi_id")
    @GeneratedValue(generator = "sq_arizakaydi_id")
    private Long id;
    private Long arizaturu_id;
    private Long personel_id;
    private String aciklama;
    private Timestamp acilisTarihi;
    private Timestamp islemTarihi;
    private Timestamp bitirmeTarihi;
    private int durum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArizaturu_id() {
        return arizaturu_id;
    }

    public void setArizaturu_id(Long arizaturu_id) {
        this.arizaturu_id = arizaturu_id;
    }

    public Long getPersonel_id() {
        return personel_id;
    }

    public void setPersonel_id(Long personel_id) {
        this.personel_id = personel_id;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Timestamp getAcilisTarihi() {
        return acilisTarihi;
    }

    public void setAcilisTarihi(Timestamp acilisTarihi) {
        this.acilisTarihi = acilisTarihi;
    }

    public Timestamp getIslemTarihi() {
        return islemTarihi;
    }

    public void setIslemTarihi(Timestamp islemTarihi) {
        this.islemTarihi = islemTarihi;
    }

    public Timestamp getBitirmeTarihi() {
        return bitirmeTarihi;
    }

    public void setBitirmeTarihi(Timestamp bitirmeTarihi) {
        this.bitirmeTarihi = bitirmeTarihi;
    }

    public int getDurum() {
        return durum;
    }

    public void setDurum(int durum) {
        this.durum = durum;
    }
    
    
    

}
