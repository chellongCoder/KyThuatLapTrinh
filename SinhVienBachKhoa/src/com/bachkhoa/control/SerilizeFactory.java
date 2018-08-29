/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bachkhoa.control;

import com.bachkhoa.model.MonHocNienChe;
import com.bachkhoa.model.MonHocTinChi;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class SerilizeFactory {

    public static boolean luuFile(Vector<MonHocTinChi> vec, String path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(vec);
            oos.close();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static Vector<MonHocTinChi> docFile(String path) {
        Vector<MonHocTinChi> vec = new Vector<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object data = ois.readObject();
            vec = (Vector<MonHocTinChi>) data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vec;
    }

    public static boolean luuFileMonNienChe(Vector<MonHocNienChe> vec, String path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(vec);
            oos.close();

        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static Vector<MonHocNienChe> docFileNienChe(String path) {
        Vector<MonHocNienChe> vec = new Vector<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object data = ois.readObject();
            vec = (Vector<MonHocNienChe>) data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vec;
    }

//    public static void main(String[] args) {
//        Vector<MonHocNienChe> vec = docFileNienChe("CacMonHocNienChe.db");
//        for (MonHocNienChe mh : vec) {
//            System.out.println(mh);
//        }
//    }
}
