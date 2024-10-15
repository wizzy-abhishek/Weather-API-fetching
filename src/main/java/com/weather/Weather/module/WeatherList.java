package com.weather.Weather.module;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class WeatherList {

    private long dt ;
    private Main main ;
    private List<Weather> weather ;
    private Cloud clouds ;
    private Wind wind ;
    private int visibility ;
    private int pop ;
    private Sys sys ;
    private String dt_txt ;

}


/*

{
        "dt": 1729436400,
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

        "weather": [
               {
               "id": 800,
               "main": "Clear",
               "description": "clear sky",
               "icon": "01n"
               }
               ],

       "clouds": {
               "all": 0
               },

       "wind": {
               "speed": 1.18,
               "deg": 205,
               "gust": 1.26
               },

        "visibility": 10000,
        "pop": 0,
        "sys": {
                    "pod": "n"
                },
        "dt_txt": "2024-10-20 15:00:00"
               }
               ],
*/
