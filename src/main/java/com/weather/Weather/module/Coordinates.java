package com.weather.Weather.module;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Coordinates {

    private Double lon ;
    private Double lat ;

}


/*

"coord": {
        "lon": 77.4,
        "lat": 23.2667
        }

*/
