package com.pws.springbootrestapiexceptionhandling.exceptions;

public class NoProductFoundException extends RuntimeException {
    public NoProductFoundException(String message){
        super(message);
    }
}
