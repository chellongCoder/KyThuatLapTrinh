/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2;

/**
 *
 * @author chellong
 */
public class Reactangle extends Shape{
    protected double width;
    protected double length;

    public Reactangle() {
    }

    public Reactangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Reactangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea () {
        return this.width * this.length;
    }
    public double getPerimater() {
        return 2*(this.length+this.width);
    }

    @Override
    public String toString() {
        return "Reactangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    
}
