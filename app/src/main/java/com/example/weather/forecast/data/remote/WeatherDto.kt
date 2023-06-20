package com.example.weather.forecast.data.remote

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: HourlyWeatherDataDto,

//    @field:Json(name = "daily")
//    val dailyData: DailyWeatherDataDto
)
