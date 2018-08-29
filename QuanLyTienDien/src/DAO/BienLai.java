/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class BienLai {
    private KhachHang hoDan;
    private int chiSoCu;
    private int chiSoMoi;
    private int soTienPhaiTra;

    public BienLai() {
        this.inputInfo();
    }

    public KhachHang getHoDan() {
        return hoDan;
    }

    public void setHoDan(KhachHang hoDan) {
        this.hoDan = hoDan;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(int soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }
    
    private void inputInfo() {
        Scanner sc = new Scanner(System.in);
        KhachHang kh = new KhachHang();
//        kh.inputInfo();
        this.hoDan = kh;
        System.out.println("nhap chi so cu > ");
        this.chiSoCu = Integer.parseInt(sc.nextLine());
        System.out.println("chi so moi > ");
        this.chiSoMoi = Integer.parseInt(sc.nextLine());
        this.soTienPhaiTra = tinhTienDien();
    }
    
    public void showInfo() {
        System.out.println("BienLai{" 
                + "\thoDan=" + hoDan + 
                "\t, chiSoCu=" + chiSoCu + 
                "\t, chiSoMoi=" + chiSoMoi + 
                "\t, soTienPhaiTra=" + soTienPhaiTra + 
                '}');
    }

    @Override
    public String toString() {
        return "BienLai{\n" 
                + "\n\thoDan=" + hoDan + 
                "\n, chiSoCu=" + chiSoCu + 
                "\n, chiSoMoi=" + chiSoMoi + 
                "\n, soTienPhaiTra=" + soTienPhaiTra + 
                "\n}";
    }
    
    
    
    private int tinhTienDien() {
        return (chiSoMoi - chiSoCu) * 750;
    }
}
