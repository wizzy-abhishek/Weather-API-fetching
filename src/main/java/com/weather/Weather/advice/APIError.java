package com.weather.Weather.advice;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class APIError {

    private LocalDateTime timeStamp ;
    private HttpStatus statusCode ;
    private String error ;

    public APIError() {
        this.timeStamp = LocalDateTime.now();
    }

}
