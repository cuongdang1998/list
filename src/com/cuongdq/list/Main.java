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
public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh qlhs=new QuanLyHocSinh();
        HocSinh hs1=new HocSinh("1","Dang Quoc A","CNTT1","CNTT",10);
        HocSinh hs2=new HocSinh("2","Dang Quoc A","KHMT2","CNTT",9);
        HocSinh hs3=new HocSinh("3","Dang Quoc C","HTTT3","CNTT",8);
        HocSinh hs4=new HocSinh("4","Dang Quoc D","KTPM4","CNTT",7);
        HocSinh hs5=new HocSinh("5","Dang Quoc E","CDT5","CK",6);
        HocSinh hs6=new HocSinh("6","Dang Quoc F","OTO1","OTO",8);
        HocSinh hs7=new HocSinh("7","Dang Quoc G","QTKD1","QTKD",2);
        HocSinh hs8=new HocSinh("8","Dang Quoc H","CNTT8","CNTT",4);
        qlhs.themHocSinh(hs1);
        qlhs.themHocSinh(hs2);
        qlhs.themHocSinh(hs3);
        qlhs.themHocSinh(hs4);
        qlhs.themHocSinh(hs5);
        qlhs.themHocSinh(hs6);
        qlhs.themHocSinh(hs7);
        qlhs.themHocSinh(hs8);
        //Check student name in list
        System.out.println(qlhs.ktTonTai("Dang Quoc A"));
        //Fix student name by student code
        qlhs.suaTenHS("3", "Dang Quoc A");
        //Find student
        qlhs.timKiemHS("Dang Quoc A");
        //Sort sutdent by score
        System.out.println("List student after sorting");
        qlhs.sapXepGiamTheoDiem();
    }
}
