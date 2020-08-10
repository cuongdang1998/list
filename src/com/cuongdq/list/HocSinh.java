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
public class HocSinh {
    
    private String maHS;
    private String ten;
    private String lop;
    private String khoa;
    private double diemTKHK;

    public HocSinh() {
    }

    public HocSinh(String maHS, String ten, String lop, String khoa, double diemTKHK) {
        this.maHS = maHS;
        this.ten = ten;
        this.lop = lop;
        this.khoa = khoa;
        this.diemTKHK = diemTKHK;
    }
    public String getMaHS() {
        return maHS;
    }
    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getKhoa() {
        return khoa;
    }
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    public double getDiemTKHK() {
        return diemTKHK;
    }
    public void setDiemTKHK(double diemTKHK) {
        this.diemTKHK = diemTKHK;
    }

    @Override
    public String toString() {
        return this.getMaHS()+" - "+this.getTen()+" - "+ 
                this.getLop()+" - "+this.getKhoa()+" - "+ this.getDiemTKHK();
    }
    
    
}
