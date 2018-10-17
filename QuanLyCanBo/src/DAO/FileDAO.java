/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.ChuyenVien;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class FileDAO {
    public static ArrayList<ChuyenVien> ChuyenViens = new ArrayList<ChuyenVien>();
    public static void ReadFile(String filename) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder buffer = new StringBuilder();
            String[] elements = new String[7];
            String line = br.readLine();
            while(line!=null) {
                buffer.append(line);
//                System.out.println("line: " + line);
                elements = line.split("[$]");
                ChuyenVien cv = new ChuyenVien(elements[0], sdf.parse(elements[1]), elements[2], elements[3], elements[4], Integer.parseInt(elements[5]), Float.parseFloat(elements[6]));
                ChuyenViens.add(cv);
                line = br.readLine();
            }
            for (ChuyenVien ChuyenVien : ChuyenViens) {
                System.out.println("chuyen vien " + ChuyenVien);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
