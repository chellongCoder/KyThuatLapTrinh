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
public class Square extends Reactangle {
    protected double size;
    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(double size, String color, boolean filled) {
        this.size = size;
        this.color = color;
        this.filled = filled;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
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

    @Override
    public String toString() {
        return "Square{" + "size=" + size + '}';
    }
    
    
    
}
