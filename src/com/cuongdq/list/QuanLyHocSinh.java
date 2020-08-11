/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongdq.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author quoccuong
 */
public class QuanLyHocSinh {

   private List<HocSinh> listHocSinh;
    public List<HocSinh> getListHocSinh() {
        return listHocSinh;
    }

    public void setListHocSinh(List<HocSinh> listHocSinh) {
        this.listHocSinh = listHocSinh;
    }
    public QuanLyHocSinh() {
    }

    public QuanLyHocSinh(List<HocSinh> listHocSinh) {
        this.listHocSinh = listHocSinh;
    }
    
    public void themHocSinh(HocSinh hs){
        if(!ktMaTonTai(hs.getMaHS())){
            this.getListHocSinh().add(hs);
        }
       
    }
    public boolean ktMaTonTai(String ma){
        for(HocSinh hs: getListHocSinh()){
            if(hs.getMaHS().equals(ma)){
                return true;
            }
        }
        return false;
    }
    public boolean ktTonTai(String tenhs){
        for(HocSinh hs: getListHocSinh()){
            if(hs.getTen().equals(tenhs)){
                return true;
            }
        }
        return false;
    }
    public void suaTenHS(String mahs,String tenmoi){
        for(HocSinh hs: getListHocSinh()){
            if(hs.getMaHS().equals(mahs)){
                hs.setTen(tenmoi);
            }
        }
    }
   
    public void timKiemHS(String ten){
        List<HocSinh> dsHS=new ArrayList<HocSinh>();
        for(HocSinh hs: getListHocSinh()){
            if(hs.getTen().equals(ten)){
                dsHS.add(hs);
            }
        }
       if(dsHS.size()==0){
           System.out.println("There is no student in list");
       }else{
           for(HocSinh hs: dsHS){
               System.out.println(hs.toString());
           }
       }
    }
    public void sapXepGiamTheoDiem(){
        Collections.sort(listHocSinh, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o2.getDiemTKHK()>o1.getDiemTKHK() ? 1:-1;
            }
            
        });
        for(HocSinh hs: getListHocSinh()){
               System.out.println(hs.toString());
           }
    }   
    public void printHS(List<HocSinh> ls){
        for(HocSinh hs: ls){
            System.out.println(hs.toString());
        }
    }
}
