/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author User
 */
public class Number {
    private int soA;
    private int soB;

    public Number() {
    }

    public Number(int soA, int soB) {
        this.soA = soA;
        this.soB = soB;
    }

    public int getSoA() {
        return soA;
    }

    public void setSoA(int soA) {
        this.soA = soA;
    }

    public int getSoB() {
        return soB;
    }

    public void setSoB(int soB) {
        this.soB = soB;
    }
    
    public void showInfo() {
        System.out.println("soA=" + soA + ", soB=" + soB);
    }
    public int cong() {
        return soA + soB;
    }
    public int tru () {
        return soA * soB;
    }
    public double  chia () {
        return (double)soA / soB;
    }
    public int nhan () {
        return soA * soB;
    }
    public int UCLN() {
        int du;
        int soA = this.soA;
        int soB = this.soB;
        while(soB>0) {
            du = soA % soB;
            soA = soB;
            soB = du;
        }
        return soA;
    }
    @Override
    public String toString() {
        return "Number{" + "soA=" + soA + ", soB=" + soB + '}';
    }
    
    
}
