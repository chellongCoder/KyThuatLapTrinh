/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

import java.util.Date;

/**
 *
 * @author chellong
 */

public class NhanVien extends Person {
    private PhongBan phongBan; 
    private int heSoLuong;
    private int thamNien;
    private double luongCoBan;

    public NhanVien() {
    }

    public NhanVien(PhongBan phongBan, int heSoLuong, int thamNien, double luongCoBan, String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }
    
    public double luongThucLinh() {
        return luongCoBan*(1+thamNien);
    }
    
    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getThamNiem() {
        return thamNien;
    }

    public void setThamNiem(int thamNien) {
        this.thamNien = thamNien;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCoBan=" + luongCoBan + '}';
    }

    @Override
    public void showInfo() {
        super.showInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCoBan=" + luongCoBan);
        System.out.println("luong thuc linh=" + this.luongThucLinh());
    }
    
    
}
