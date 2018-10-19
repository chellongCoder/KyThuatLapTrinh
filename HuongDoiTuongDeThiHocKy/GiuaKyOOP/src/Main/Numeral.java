/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author chellong
 */
public class Numeral implements Expression{
    private int value;

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
    }

    @Override
    public String asString() {
        return "";
    }

    @Override
    public int envaluate() {
        return value;
    }
    
    
}
