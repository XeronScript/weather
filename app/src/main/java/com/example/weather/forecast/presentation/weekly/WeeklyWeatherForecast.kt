package com.example.weather.forecast.presentation.weekly

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.weather.forecast.presentation.WeatherState

@Composable
fun WeeklyWeatherForecast(
    state: WeatherState
) {
    state.weatherInfo?.weatherDataPerDay?.let { weatherData ->

        weatherData.entries
            .groupBy {
                it.key
            }
//            .filter { it.key != 0 }
            .map { entry ->
                entry.value
                    .flatMap { it.value }
                    .maxBy { value -> value.temperatureCelsius }
//                    ?.let { listOf(it) } ?: emptyList()

            }
            .also { weatherData_ ->
                WeeklyWeatherDisplay(
                    modifier = Modifier.fillMaxWidth(),
                    weatherData = weatherData_
                )
            }
    }
}
