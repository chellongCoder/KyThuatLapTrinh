/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Container;
import java.util.Locale;
import javax.swing.JFrame;

/**
 *
 * @author chellong
 */
public class QuanLySinhVien extends JFrame {
    public QuanLySinhVien () {
        this.addControl();
        this.addEvent();
    }

    private void addControl() {
          Container container =  this.getContentPane();
    }

    private void addEvent() {
        
    }
    
    public void showWindow() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
