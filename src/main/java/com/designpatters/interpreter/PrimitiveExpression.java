package com.designpatters.interpreter;

public class PrimitiveExpression implements Expression {
    private int value;
    public PrimitiveExpression(int value) {
        this.value = value;
    }
    @Override
    public int evaluate() {
        return value;
    }
}
