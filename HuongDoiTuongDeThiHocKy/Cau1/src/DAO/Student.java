/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chellong
 */
public class Student extends Person implements Serializable
{
    private String maSv;
    private String email;
    private double diemTongKet;

    public Student() {
        
    }

    public Student(String maSv, String email, double diemTongKet, String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSv = maSv;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }
    
    public Student(String maSv, String email, double diemTongKet) {
        this.maSv = maSv;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }
    
    public void showInfo() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ngay sinh " + this.ngaySinh);
        String date = sourceFormat.format(this.ngaySinh);
        System.out.println("Student{"+"Ho ten="+ this.hoTen + "ngay sinh=" + date + "dia chi=" +this.diaChi + "maSv=" + maSv + ", email=" + email + ", diemTongKet=" + diemTongKet + '}');
    }

    
    
}
