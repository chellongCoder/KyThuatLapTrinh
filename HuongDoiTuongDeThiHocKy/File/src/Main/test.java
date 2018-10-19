/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author chellong
 */
public class test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         File demoFile = new File("/Users/chellong/Desktop/testImage");
         FileInputStream fis = new FileInputStream("/Users/chellong/Desktop/c-programming.png");
         FileOutputStream fos = new FileOutputStream(demoFile);
         int character = 0;
         byte[] b = new byte[fis.available()];
         fis.read(b);
         fos.write(b);
//         while ((character=fis.read())!=-1) {            
//             System.out.println("item " + character);
//             fos.write(character);
//        }
            fis.close();
 
        PrintWriter pw = new PrintWriter("/Users/chellong/Desktop/testFile.out");
        pw.println("hello");
        pw.println("124");
        
        pw.close();
        fis = new FileInputStream("/Users/chellong/Desktop/testFile.out");
        byte[] bit = new byte[fis.available()];
        fis.read(bit);
        for (int i = 0; i < bit.length; i++) {
            System.out.print((char)bit[i]);
        }
        fis.close();
    }
}
