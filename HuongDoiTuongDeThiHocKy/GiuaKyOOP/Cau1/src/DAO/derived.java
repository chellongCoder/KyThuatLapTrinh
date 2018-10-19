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
public class derived extends Base {
     public void f() {
        System.out.println("derived f()");
    }

    public static void main(String[] args) {
        derived d = new derived();
        Base b = d;
        b.show();
        d.show();
    }
}
