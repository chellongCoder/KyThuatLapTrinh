/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.Employee;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class FileDAO {
    public static ArrayList<Employee> DocFile (String filename) {
        ArrayList<Employee> Employees = new ArrayList<Employee>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            String[] attributes = new String[8];
            while(line!=null) {
                attributes = line.split("[$]");
                Employee em = new Employee();
                em.setName(attributes[0]);
                em.setDob(attributes[1]);
                em.setAddress(attributes[2]);
                em.setGender(attributes[3]);
                em.setPhongBan(attributes[4]);
                em.setHeSoLuong(Double.parseDouble(attributes[5]));
                em.setThamNiem(Integer.parseInt(attributes[6]));
                em.setLuongCoBan(Double.parseDouble(attributes[7]));
                Employees.add(em);
                line = br.readLine();
            }
            return Employees;
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return null;
    }
}
