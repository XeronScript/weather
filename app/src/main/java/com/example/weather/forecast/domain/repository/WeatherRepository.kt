package com.example.weather.forecast.domain.repository

import com.example.weather.forecast.domain.util.Resource
import com.example.weather.forecast.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}