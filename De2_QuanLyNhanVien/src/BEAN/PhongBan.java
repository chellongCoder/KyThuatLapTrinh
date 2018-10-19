/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author chellong
 */
 import java.io.Serializable;
public enum PhongBan implements Serializable{
    ThietBi,
    NhanSu,
    RandD,
    KinhDoanh,;

    @Override
    public String toString() {
        switch (this) {
            case ThietBi:
                return "thiet bi";
            case NhanSu: 
                return "nhan su";
            case RandD: 
                return "R&D";
            case KinhDoanh: 
                return "kinh doanh";
        }
        return null;
    }
    
    public static PhongBan compare(String value) {
        System.out.println(ThietBi.toString());
        if(value.toLowerCase().equals(ThietBi.toString())) {
            return PhongBan.ThietBi;
        }
        if(value.toLowerCase().equals(NhanSu.toString())) {
            return PhongBan.NhanSu;
        }
        if(value.toLowerCase().equals(RandD.toString())) {
            return PhongBan.RandD;
        }
        if(value.toLowerCase().equals(KinhDoanh.toString())) {
            return PhongBan.KinhDoanh;
        }
        return null;
    }

}
