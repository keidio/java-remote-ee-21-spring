package com.sda.javaremoteee21spring.exception;

public class CarNotFountException extends RuntimeException{
    public CarNotFountException() {
    }

    public CarNotFountException(String message) {
        super(message);
    }

    public CarNotFountException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarNotFountException(Throwable cause) {
        super(cause);
    }

    public CarNotFountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
