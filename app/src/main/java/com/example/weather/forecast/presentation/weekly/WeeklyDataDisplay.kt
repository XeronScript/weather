package com.example.weather.forecast.presentation.weekly

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.weather.forecast.domain.weather.WeatherData

@Composable
fun WeeklyWeatherDisplay(
    modifier: Modifier = Modifier,
    weatherData: List<WeatherData>
) {
    LazyColumn(
        content = {
            items(weatherData) { data ->
                WeeklyListItem(data)
                Spacer(modifier = Modifier.fillMaxWidth().height(5.dp))
            }
        }
    )
}