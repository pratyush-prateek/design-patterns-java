package com.designpatters.sportsbuzz.exceptions;

public class SportNotSupportedException extends Exception{
    public SportNotSupportedException(String err) {
        super(err);
    }
}
