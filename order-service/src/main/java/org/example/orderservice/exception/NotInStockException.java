package org.example.orderservice.exception;

public class NotInStockException extends RuntimeException {
    public NotInStockException(String message) {
        super(message);
    }
}
