package com.mycompany.calculator.service.exception;

public class IllegalInputStringException extends IllegalArgumentException {

    public IllegalInputStringException(String s) {
        super(s);
    }
}
