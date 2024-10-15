package com.weather.Weather.module;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Weather {

    private String id;
    private String main;
    private String description;
    private String icon;
}



/*      "id": 804,
        "main": "Clouds",
        "description": "overcast clouds",
        "icon": "04n"
*/