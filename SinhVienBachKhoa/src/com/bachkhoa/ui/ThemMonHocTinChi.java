/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bachkhoa.ui;

import javax.swing.JDialog;
import javax.swing.JTextField;

/**
 *
 * @author Long Nguyen Nhat
 * private String TenMonHoc;
    private int SoTinChi;
    private MonHocTinChi MonHocTinChiDieuKien;
    private double diemGiuaKy;
    private double diemCuoiKy;
 */
public class ThemMonHocTinChi extends JDialog{
    
    JTextField txtTenMonHoc, txtSoTinChi, txtMonHocTinChiDieuKien;
    
    
    public ThemMonHocTinChi (String title) {
        this.setTitle(title);
        addControls();
        addEvents();
    }

    private void addControls() {
        
    }
    

    private void addEvents() {
    }
}
