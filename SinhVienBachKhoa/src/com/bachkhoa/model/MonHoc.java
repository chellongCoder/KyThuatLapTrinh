/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bachkhoa.model;

/**
 *
 * @author Long Nguyen Nhat
 */
public class MonHoc {
    protected String TenMonHoc;
    protected double diemGiuaKy;
    protected double diemCuoiKy;

    public MonHoc() {
    }

    public MonHoc(String TenMonHoc, double diemGiuaKy, double diemCuoiKy) {
        this.TenMonHoc = TenMonHoc;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String TenMonHoc) {
        this.TenMonHoc = TenMonHoc;
    }

    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(double diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
    }

    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(double diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }
    
}
