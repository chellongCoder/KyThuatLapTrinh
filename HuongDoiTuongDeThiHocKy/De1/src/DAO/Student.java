/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author chellong
 */
public class Student extends Person {
    private String maSv;
    private String email;
    private float diemTrungBinh;

    public Student() {
    }

    public Student(String maSv, String email, float diemTrungBinh) {
        this.maSv = maSv;
        this.email = email;
        this.diemTrungBinh = diemTrungBinh;
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

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "Student{" + "maSv=" + maSv + ", email=" + email + ", diemTrungBinh=" + diemTrungBinh + '}';
    }
    
    public void showInfo() {
        System.out.println("Student{" + "maSv=" + maSv + ", email=" + email + ", diemTrungBinh=" + diemTrungBinh + '}');
    }
}
