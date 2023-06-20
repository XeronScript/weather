package com.example.weather.forecast.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    // TODO eventually, change fetching to only download hourly weather for one day,
    //  and for the other days just a single max temperature (forecast_days param in api)

    @GET("/v1/forecast?hourly=temperature_2m,weathercode,windspeed_10m,pressure_msl,relativehumidity_2m&current_weather=true&daily=temperature_2m_max,weathercode&timezone=auto")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto

    @GET("/v1/forecast?hourly=temperature_2m,weathercode,windspeed_10m,pressure_msl,relativehumidity_2m&current_weather=true&daily=temperature_2m_max,weathercode&timezone=auto&temperature_unit=fahrenheit")
    suspend fun getWeatherDataInFahrenheit(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto
}
