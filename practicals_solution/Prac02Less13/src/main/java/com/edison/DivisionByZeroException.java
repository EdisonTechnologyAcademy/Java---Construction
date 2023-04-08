package com.edison;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Division by zero!");
    }
}
