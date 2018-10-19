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
public class Employee extends Person {
    private String phongBan;
    private double heSoLuong;
    private int thamNiem;
    private double luongCoBan;

    public Employee() {
    }

    public Employee(String phongBan, double heSoLuong, int thamNiem, double luongCoBan, String name, String dob, String address, String gender) {
        super(name, dob, address, gender);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNiem = thamNiem;
        this.luongCoBan = luongCoBan;
    }
    public Double luongThucLinh() {
        return this.luongCoBan * (1 + (double)this.thamNiem/100);
    }
    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNiem() {
        return thamNiem;
    }

    public void setThamNiem(int thamNiem) {
        this.thamNiem = thamNiem;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    @Override
    public String toString() {
        return "Employee{" + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNiem=" + thamNiem + ", luongCoBan=" + luongCoBan + '}';
    }

    @Override
    public void showInfo() {
        super.showInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNiem=" + thamNiem + ", luongCoBan=" + luongCoBan);
    }
    
    
}
