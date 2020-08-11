/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongdq.list;

import java.util.ArrayList;

/**
 *
 * @author quoccuong
 */
public class QuanLyDanhBa {
    private ArrayList<DanhBa> listDB;

    public QuanLyDanhBa() {
    }

    public QuanLyDanhBa(ArrayList<DanhBa> listDB) {
        this.listDB = listDB;
    }

    public ArrayList<DanhBa> getListDB() {
        return listDB;
    }

    public void setListDB(ArrayList<DanhBa> listDB) {
        this.listDB = listDB;
    }
    public boolean isExistDB(String ten, String sdt){
        for(DanhBa db: getListDB()){
            if(db.getTen().equals(ten)&& db.getSoDT().equals(sdt)){
                return true;
            }
        }
        return false;
    }
    public boolean isExistDB(String ten){
        for(DanhBa db: getListDB()){
            if(db.getTen().equals(ten)){
                return true;
            }
        }
        return false;
    }
    public void printListDB(ArrayList<DanhBa> listDB){
        for(DanhBa db: listDB){
            System.out.println(db.toString());
        }
    }
    public void themDB(String ten,String sdt){
        if(isExistDB(ten,sdt)){
            System.out.println(ten+": "+sdt+" is in list");
        }else{
            DanhBa db=new DanhBa();
            db.setTen(ten);
            db.setSoDT(sdt);
            getListDB().add(db);
        }
    }
    public void suaDB(String ten, String sdtm){
        if(isExistDB(ten)){
            for(DanhBa db: getListDB()){
                db.setSoDT(sdtm);
            }
        }else{
            System.out.println("DB is not in list");
        }
    }
    public boolean contain(String ten,String target){
        ten=ten.toLowerCase();
        target=target.toLowerCase();
        for(int i=0;i<ten.length();i++){
            int a=target.indexOf(ten.charAt(i));
            if(a==-1) return false;
        }
        return true;
    }
    public void timKiem(String ten){
        
        for(DanhBa db: getListDB()){
            //System.out.println(contain("Thang",db.getTen()));
            if(contain("Thang",db.getTen())){
                System.out.println(db.toString());
            }
        }
    }
    
}
