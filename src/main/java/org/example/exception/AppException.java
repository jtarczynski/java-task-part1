package org.example.exception;

public class AppException extends RuntimeException {
    public AppException(Error error) {
        super(error.getMessage());
    }
}
