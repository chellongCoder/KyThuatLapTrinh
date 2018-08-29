/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class SinhVien {
    private String hoTen;
    private Date namSinh;
    private int tuoi;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String hoTen, Date namSinh, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    private void inputInfoStudent() {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
        do {            
            try {
                System.out.println("nhap ten> ");
                this.hoTen = sc.nextLine();
                System.out.println("nhap tuoi (dd-mm-yyyy)");
                this.namSinh = dt.parse(sc.nextLine());
                System.out.println("nhap lop> ");
                this.lop = sc.nextLine();
                System.out.println("nhap tuoi");
                this.tuoi = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                flag = true;
            }
        } while (!flag);
    }
    
    private void showInfoStudent() {
        System.out.println("SinhVien{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", tuoi=" + tuoi + ", lop=" + lop + "}");
    }    
    
    public static void main(String[] args) {
        try {
            System.out.println("nhap ngay> ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] elements = str.split("[^\\d]");
            for(String s : elements) {
                System.out.println(s);
            }
            SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
            System.out.println("format " + dt.parse(str));
//        Date date = new Date(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]),Integer.parseInt(elements[2]));
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
