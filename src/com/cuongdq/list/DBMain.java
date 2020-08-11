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
public class DBMain {
    public static void main(String[] args) {
        DanhBa db1=new DanhBa("Thang","023324");
        DanhBa db2=new DanhBa("TranThanh","09343");
        DanhBa db3=new DanhBa("Hoai","02323");
        DanhBa db4=new DanhBa("ToHoang","032423");
        DanhBa db5=new DanhBa("ToThang","098773");
        DanhBa db6=new DanhBa("ToTien","012324");
        ArrayList<DanhBa> dbl=new ArrayList<DanhBa>();
        dbl.add(db1); dbl.add(db2);
        dbl.add(db3);dbl.add(db4);
        dbl.add(db5);dbl.add(db6);
        QuanLyDanhBa qldb=new QuanLyDanhBa(dbl);
        qldb.printListDB(qldb.getListDB());
        qldb.suaDB("Cuong", "0978353432");
        System.out.println("DB after fixing");
        qldb.printListDB(dbl);
        String name="Thang";
        System.out.println("Finding db with a given name is:"+name);
        qldb.timKiem(name);
       
    }
}
