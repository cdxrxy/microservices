package org.example.orderservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.orderservice.dto.ErrorDto;
import org.example.orderservice.exception.NotInStockException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(NotInStockException.class)
    public ResponseEntity<?> handleBadRequest(HttpServletRequest request, RuntimeException e) {
        return ResponseEntity
                .status(BAD_REQUEST)
                .body(
                        ErrorDto
                                .builder()
                                .timestamp(new Date())
                                .status(BAD_REQUEST.value())
                                .error(BAD_REQUEST.getReasonPhrase())
                                .path(request.getServletPath())
                                .message(e.getMessage())
                                .build()
                );
    }

}
