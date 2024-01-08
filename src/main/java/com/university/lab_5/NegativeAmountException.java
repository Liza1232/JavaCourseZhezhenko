package com.university.lab_5;

public class NegativeAmountException extends RuntimeException{
    public NegativeAmountException (String message){
        super(message);
    }
}
