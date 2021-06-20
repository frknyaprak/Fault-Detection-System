/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsk.arizatakipsistemi.dao;

import com.fsk.arizatakipsistemi.models.ArizaKaydi;
import com.fsk.arizatakipsistemi.models.Personel;
import com.fsk.arizatakipsistemi.models.ViewArizaTable;
import com.fsk.arizatakipsistemi.util.DBBaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fsk
 */
public class ArizaKaydiDao extends DBBaseUtil<ArizaKaydi>{
    
    public List<ViewArizaTable> tblList(Long personelId) {
        
        List<ViewArizaTable> list = new ArrayList<>();
        
        ArizaKaydi arizaKaydi = new ArizaKaydi();
        arizaKaydi.setPersonel_id(personelId);
        
        List<ArizaKaydi> listArizaKaydi = advancedList(arizaKaydi);
        
        for(ArizaKaydi item : listArizaKaydi) {
            ViewArizaTable tbl = new ViewArizaTable();
            tbl.setDurumu(durum(item.getDurum()));
            tbl.setGirisTarihi(item.getAcilisTarihi());
            tbl.setId(item.getId());
            tbl.setPersonelAdi(personelAdi(item.getPersonel_id()));
            list.add(tbl);
        }
        
        return list;
    }
    
    
    public String durum(int id){
        switch(id) {
            case 0: 
                return "Acik";
            case 1:
                return "Beklemede";
            case 2:
                return "Inceleniyor";
            case 4:
                return "Tamamlandi";
            default:
                return "Acik";
        }
    }
    
    
    
    public String personelAdi(Long id){
        
        PersonelDao dbPersonelDao = new PersonelDao();
        return dbPersonelDao.find(id, new Personel()).getIsim();
        
    }
    
}
