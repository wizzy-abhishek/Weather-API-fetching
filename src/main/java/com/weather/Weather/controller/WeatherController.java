package com.weather.Weather.controller;

import com.weather.Weather.module.LiveWeather;
import com.weather.Weather.module.WeatherForecast;
import com.weather.Weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    private final WeatherService weatherService ;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/live/{city}")
    public ResponseEntity<LiveWeather> getWeather(@PathVariable String city){
        return
                ResponseEntity.ok(weatherService.getLiveWeather(city));
    }

    @GetMapping("/forecast/{city}")
    public ResponseEntity<WeatherForecast> getWeatherForecast(@PathVariable String city){
        return
                ResponseEntity.ok(weatherService.getWeatherForecast(city));
    }

}
