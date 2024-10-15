package com.weather.Weather.module;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class LiveWeather {

    private Coordinates coord ;
    private List<Weather> weather ;
    private String base ;
    private Main main ;
    private int visibility ;
    private Wind wind ;
    private Cloud clouds ;
    private long dt ;
    private Sys sys ;
    private long timezone ;
    private long id ;
    private String name ;
    private int cod ;

}


/*
{
        "coord": {
        "lon": 77.4,
        "lat": 23.2667
        },
        "weather": [
        {
        "id": 804,
        "main": "Clouds",
        "description": "overcast clouds",
        "icon": "04n"
        }
        ],
        "base": "stations",
        "main": {
        "temp": 299.87,
        "feels_like": 301.27,
        "temp_min": 299.87,
        "temp_max": 299.87,
        "pressure": 1011,
        "humidity": 66,
        "sea_level": 1011,
        "grnd_level": 956
        },
        "visibility": 10000,
        "wind": {
        "speed": 1.25,
        "deg": 32,
        "gust": 1.36
        },
        "clouds": {
        "all": 100
        },
        "dt": 1729005286,
        "sys": {
        "country": "IN",
        "sunrise": 1728953233,
        "sunset": 1728995084
        },
        "timezone": 19800,
        "id": 1275841,
        "name": "Bhopal",
        "cod": 200
        }
*/
