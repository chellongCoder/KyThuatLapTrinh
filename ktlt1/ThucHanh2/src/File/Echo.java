/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

/**
 *
 * @author chellong
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Exception;
public class Echo {
    public static void main(String[] args) 
        throws IOException {
        InputStreamReader reader;
        BufferedReader buffer;
        reader = new InputStreamReader(System.in);
        buffer = new BufferedReader(reader);
        String str;
        while((str=buffer.readLine())!=null) {
            System.out.println("str = " + str);
        }

    }
}
