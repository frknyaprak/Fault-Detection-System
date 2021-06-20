/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsk.arizatakipsistemi.dao;

import com.fsk.arizatakipsistemi.models.Personel;
import com.fsk.arizatakipsistemi.util.DBBaseUtil;
import com.fsk.arizatakipsistemi.util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fsk
 */
public class PersonelDao extends DBBaseUtil<Personel>{
    
    public int verification(String kullaniciAdi, String sifre){
        int sonuc = -1;
        Session session = null;
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Personel.class);
            criteria.add(Restrictions.eq("kullaniciAdi", kullaniciAdi));
            criteria.add(Restrictions.eq("sifre", sifre));
            
            if(criteria.list().size() > 0) {
                sonuc = ((Personel)criteria.list().get(0)).getYetkiId();
            }
            
            session.close();
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Beklenmeyen bir hata olustu.\n"+ex.getMessage());
        }finally {
            if(session != null || !session.isOpen()) {
                session.close();
            }
        }
        
        
        return sonuc;
    }
    
}
