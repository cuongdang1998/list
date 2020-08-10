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

   private List<HocSinh> listHocSinh=new ArrayList<HocSinh>();
    public List<HocSinh> getListHocSinh() {
        return listHocSinh;
    }

    public void setListHocSinh(List<HocSinh> listHocSinh) {
        this.listHocSinh = listHocSinh;
    }
    public QuanLyHocSinh() {
    }
    public void themHocSinh(HocSinh hs){
        this.getListHocSinh().add(hs);
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
}
