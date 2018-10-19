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
public class Subtraction implements BinaryExpression {

    private Expression left;
    private Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression rigt() {
        return right;
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
