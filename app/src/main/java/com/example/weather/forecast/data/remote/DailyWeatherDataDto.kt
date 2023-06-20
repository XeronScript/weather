package com.example.weather.forecast.data.remote

import com.squareup.moshi.Json

data class DailyWeatherDataDto(
    val time: List<String>,

    @field:Json(name = "temperature_2m_max")
    val temperatures: List<Double>,

    @field:Json(name = "weathercode")
    val weatherCode: List<Int>
)
