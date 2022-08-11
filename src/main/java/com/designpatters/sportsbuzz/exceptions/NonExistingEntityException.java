package com.designpatters.sportsbuzz.exceptions;

public class NonExistingEntityException extends Exception{
    public NonExistingEntityException(String err){
        super(err);
    }
}
