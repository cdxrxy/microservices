package org.example.productservice.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@ResponseStatus(NO_CONTENT)
public class EmptyProductSetException extends RuntimeException {
    public EmptyProductSetException(String message) {
        super(message);
    }
}
