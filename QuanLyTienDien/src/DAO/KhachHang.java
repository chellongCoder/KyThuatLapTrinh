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
public class KhachHang {
    private String hoTen;
    private int soNha;
    private String maSoCongTo;

    public KhachHang() {
        this.inputInfo();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }
    
    private void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten ho gia dinh > ");
        this.hoTen = sc.nextLine();
        System.out.println("nhap so nha> ");
        this.soNha = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ma so cong to > ");
        this.maSoCongTo = sc.nextLine();
    }
    
    public void showInfo() {
        System.out.println("KhachHang{" + "hoTen=" + hoTen + ", soNha=" + soNha + ", maSoCongTo=" + maSoCongTo + '}');
    }

    @Override
    public String toString() {
        return "\nKhachHang{" + 
                "\n\thoTen=" + hoTen + 
                "\n\t, soNha=" + soNha + 
                "\n\t, maSoCongTo=" + maSoCongTo + 
                "\n}\n";
    }

    
}
