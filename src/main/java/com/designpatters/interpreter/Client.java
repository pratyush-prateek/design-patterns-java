package com.designpatters.interpreter;

public class Client {
    public static void main(String[] args) {
        /*
        * ((2+3)-(3-2))+(2-3)*/
        Expression expression1 = new PrimitiveExpression(2);
        Expression expression2 = new PrimitiveExpression(3);
        Expression addExpression1 = new AddExpression(expression1, expression2);
        Expression subtractExpression1 = new SubtractExpression(expression2, expression1);
        Expression subtractExpression2 = new SubtractExpression(expression1, expression2);
        Expression subtractExpression3 = new SubtractExpression(addExpression1, subtractExpression1);
        Expression addExpression2 = new AddExpression(subtractExpression3, subtractExpression2);
        System.out.println(addExpression2.evaluate());
    }
}
