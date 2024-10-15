package com.weather.Weather.module;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Sys {

    private String country ;
    private long sunrise ;
    private long sunset ;

    private String pod;


}

/*

"sys": {
        "country": "IN",
        "sunrise": 1728953233,
        "sunset": 1728995084
        }


"sys": {
       "pod": "n"
       },
*/
