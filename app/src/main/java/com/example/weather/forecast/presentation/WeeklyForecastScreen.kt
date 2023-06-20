package com.example.weather.forecast.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.weather.forecast.presentation.weekly.WeeklyWeatherForecast

@Composable
fun WeeklyForecastScreen(
    state: WeatherViewModel
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        WeeklyWeatherForecast(state.state)
    }
}