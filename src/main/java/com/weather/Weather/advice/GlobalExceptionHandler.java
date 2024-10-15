package com.weather.Weather.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<APIError> handleUltimateException(Exception exception){

        APIError apiError = new APIError();

        apiError.setStatusCode(HttpStatus.BAD_REQUEST);
        apiError.setError(exception.getMessage());

        return new ResponseEntity<>(apiError , HttpStatus.BAD_REQUEST) ;
    }

}
