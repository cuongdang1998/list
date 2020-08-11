/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongdq.list;

/**
 *
 * @author quoccuong
 */
public class DanhBa {
    private String ten;
    private String soDT;

    public DanhBa() {
    }

    public DanhBa(String ten, String soDT) {
        this.ten = ten;
        this.soDT = soDT;
    }

   
    public String getTen() {
        return ten;
    }

    
    public void setTen(String ten) {
        this.ten = ten;
    }

    
    public String getSoDT() {
        return soDT;
    }

  
    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    @Override
    public String toString() {
        return this.getTen()+" - "+ this.getSoDT();
    }
    
    
}
