package com.designpatters.interpreter;

public class AddExpression implements Expression{
    private Expression expression1;
    private Expression expression2;
    public AddExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int evaluate() {
        return expression1.evaluate() + expression2.evaluate();
    }
}
