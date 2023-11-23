package com.hbourgeot.hentechn.infraestructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hbourgeot.hentechn.infraestructure.config.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ApiResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
    String errorMessage = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(new ApiResponse(false, HttpStatus.BAD_REQUEST.value(), null, errorMessage, null));
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ResponseEntity<ApiResponse> handleHttpMessageNotReadable(HttpMessageNotReadableException ex) {
    String errorDetails = ex.getMessage();
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(new ApiResponse(false, HttpStatus.BAD_REQUEST.value(), null, "Bad Request", errorDetails));
  }

  // Otros manejadores de excepciones...
}