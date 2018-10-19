/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BEAN.PhongBan;
import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("value: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        PhongBan pb = PhongBan.compare(name);
        System.out.println("pb " + pb);
        
    }
}
