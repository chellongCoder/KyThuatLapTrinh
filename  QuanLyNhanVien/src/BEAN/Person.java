/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

import java.util.Date;

/**
 *
 * @author chellong
 */
public class Person {
    protected String name;
    protected String dob;
    protected String address;
    protected String gender;

    public Person() {
    }

    public Person(String name, String dob, String address, String gender) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void showInfo() {
        System.out.println("name=" + name + ", dob=" + dob + ", address=" + address + ", gender=" + gender);
    }
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", dob=" + dob + ", address=" + address + ", gender=" + gender + '}';
    }
    
     
}
