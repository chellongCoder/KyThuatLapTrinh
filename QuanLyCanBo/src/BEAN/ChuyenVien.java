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
public class ChuyenVien extends CanBo{
     private String maNgach;
     private int bacLuong;
     private float heSoLuong;

    public ChuyenVien() {
    }

    public ChuyenVien( String hoTen, Date ngaySinh, String diaChi, String gioiTinh, String maNgach, int bacLuong, float heSoLuong) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNgach = maNgach;
        this.bacLuong = bacLuong;
        this.heSoLuong = heSoLuong;
    }

    public String getMaNgach() {
        return maNgach;
    }

    public void setMaNgach(String maNgach) {
        this.maNgach = maNgach;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "ChuyenVien{" + "maNgach=" + maNgach + ", bacLuong=" + bacLuong + ", heSoLuong=" + heSoLuong + '}';
    }
     
}
