package com.weather.Weather.module;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Main {

    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;
    private int temp_kf ;
}

/*

"main": {
        "temp": 299.87,
        "feels_like": 301.27,
        "temp_min": 299.87,
        "temp_max": 299.87,
        "pressure": 1011,
        "humidity": 66,
        "sea_level": 1011,
        "grnd_level": 956
        }

        "main": {
        "temp": 298.04,
        "feels_like": 298.15,
        "temp_min": 298.04,
        "temp_max": 298.04,
        "pressure": 1012,
        "sea_level": 1012,
        "grnd_level": 956,
        "humidity": 60,
        "temp_kf": 0
        }
*/
