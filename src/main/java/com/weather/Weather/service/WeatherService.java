package com.weather.Weather.service;

import com.weather.Weather.module.LiveWeather;
import com.weather.Weather.module.WeatherForecast;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class WeatherService {

    @Value("${weather.base.url}")
    private String BASE_URL ;

    @Value("${weather.api.key}")
    private String API_KEY ;

    private final RestClient restClient ; // Latest way
    private final RestTemplate restTemplate ; // Older way

    public WeatherService(RestClient restClient, RestTemplate restTemplate) {
        this.restClient = restClient;
        this.restTemplate = restTemplate;
    }

    public LiveWeather getLiveWeather(String city){
        final String LIVE_BASE_URL = BASE_URL + "weather?q=" + city + "&appid=" + API_KEY ;
        return restClient.get()
                .uri(LIVE_BASE_URL)
                .retrieve()
                .body(LiveWeather.class);
    }

    public WeatherForecast getWeatherForecast(String city){
        final String url = BASE_URL + "forecast?q=" + city + "&appid=" + API_KEY;
        return restTemplate
                .getForObject(url , WeatherForecast.class);
    }

}
