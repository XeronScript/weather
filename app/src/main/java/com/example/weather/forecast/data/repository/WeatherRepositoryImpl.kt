package com.example.weather.forecast.data.repository

import com.example.weather.forecast.data.mappers.toWeatherInfo
import com.example.weather.forecast.data.remote.WeatherApi
import com.example.weather.forecast.domain.repository.WeatherRepository
import com.example.weather.forecast.domain.util.Resource
import com.example.weather.forecast.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred")
        }
    }
}