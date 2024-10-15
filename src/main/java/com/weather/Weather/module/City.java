package com.weather.Weather.module;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class City {

    private long id ;
    private String name ;

    private Coordinates coord ;
    private String country ;
    private long population ;
    private long timezone ;
    private long sunrise ;
    private long sunset ;

}

/*

       "city": {
               "id": 1275841,
               "name": "Bhopal",

                "coord": {
                        "lat": 23.2667,
                        "lon": 77.4
                        },

                        "country": "IN",
                        "population": 1599914,
                        "timezone": 19800,
                        "sunrise": 1728953233,
                        "sunset": 1728995084
                }

*/
