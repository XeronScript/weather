package com.example.weather.di

import com.example.weather.forecast.data.location.DefaultLocationTracker
import com.example.weather.forecast.data.repository.WeatherRepositoryImpl
import com.example.weather.forecast.domain.location.LocationTracker
import com.example.weather.forecast.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}