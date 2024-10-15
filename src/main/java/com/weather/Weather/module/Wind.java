package com.weather.Weather.module;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Wind {

    private double speed;
    private int deg;
    private double gust;
}

/*
"wind": {
        "speed": 1.25,
        "deg": 32,
        "gust": 1.36
        }
*/
