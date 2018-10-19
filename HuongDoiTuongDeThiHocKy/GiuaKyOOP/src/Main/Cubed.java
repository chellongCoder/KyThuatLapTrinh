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
public class Cubed implements Expression {
    private Expression expression;

    public Cubed(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String asString() {
        return "";
    }

    @Override
    public int envaluate() {
        return 1;
    }
    
}
