package com.hbourgeot.hentechn.infraestructure.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
  public static ApiResponse res;

    public static ResponseEntity<ApiResponse> handleSuccess(Object data) {
        res = new ApiResponse(true, 200, data, null, null);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    public static ResponseEntity<ApiResponse> handleSuccessWithMessage(String message, int status) {
        res = new ApiResponse(true, status, null, message, null);
        return new ResponseEntity<>(res, HttpStatus.valueOf(status));
    }

    public static ResponseEntity<ApiResponse> handleClientError(String message, int status, Object data) {
        res = new ApiResponse(false, status, data, message, null);
        return new ResponseEntity<>(res, HttpStatus.valueOf(status));
    }

    public static ResponseEntity<ApiResponse> handleServerError(Exception e, int status) {
        String errorDetails = e.getMessage() + " at " + e.getStackTrace()[0];
        res = new ApiResponse(false, status, null, "Internal Server Error", errorDetails);
        return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Otros métodos según sea necesario
}