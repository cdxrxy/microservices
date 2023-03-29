package org.example.orderservice.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.CONFLICT;

@ResponseStatus(CONFLICT)
public class NotInStockException extends RuntimeException {
    public NotInStockException(String message) {
        super(message);
    }
}
