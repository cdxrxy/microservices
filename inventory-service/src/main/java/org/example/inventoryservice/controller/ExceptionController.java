package org.example.inventoryservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.inventoryservice.dto.ErrorDto;
import org.example.inventoryservice.exception.InventoryAlreadyExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

import static org.springframework.http.HttpStatus.CONFLICT;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(InventoryAlreadyExistsException.class)
    public ResponseEntity<?> handleConflict(HttpServletRequest request, RuntimeException e) {
        return ResponseEntity
                .status(CONFLICT)
                .body(
                        ErrorDto
                                .builder()
                                .timestamp(new Date())
                                .status(CONFLICT.value())
                                .error(CONFLICT.getReasonPhrase())
                                .path(request.getServletPath())
                                .message(e.getMessage())
                                .build()
                );
    }

}
