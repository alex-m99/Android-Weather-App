package com.example.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {

    @GET("weather?appid=b452ac8afe33ed9d7d6a7c47d883e6a9&units=metric")
    Call<OpenWeatherMap>getWeatherWithLocation(@Query("lat")double lat, @Query("lon")double lon);

    @GET("weather?appid=b452ac8afe33ed9d7d6a7c47d883e6a9&units=metric")
    Call<OpenWeatherMap>getWeatherWithCityName(@Query("q")String name);



}
