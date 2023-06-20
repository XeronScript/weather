package com.example.weather.forecast.domain.weather

import androidx.annotation.DrawableRes
import com.example.weather.R

sealed class WeatherType(
    val weatherDesc: String,
    @DrawableRes val iconRes: Int
) {
    object ClearSky : WeatherType(
        "Czyste Niebo",
        R.drawable.ic_sunny
    )
    object MainlyClear : WeatherType(
        "Przeważnie czyste niebo",
        R.drawable.ic_sunnycloudy
    )
    object PartlyCloudy : WeatherType(
        "Częściowe zachmurzenie",
        R.drawable.ic_cloudy
    )
    object Overcast : WeatherType(
        "Zachmurzenie",
        R.drawable.ic_very_cloudy
    )
    object Foggy : WeatherType(
        "Mgła",
        R.drawable.ic_foggy
    )
    object DepositingRimeFog : WeatherType(
        "Mgła z szadzią",
        R.drawable.ic_foggy_rime
    )
    object LightDrizzle : WeatherType(
        "Lekka mżawka",
        R.drawable.ic_rainshower
    )
    object ModerateDrizzle : WeatherType(
        "Mżkawka",
        R.drawable.ic_rainshower
    )
    object DenseDrizzle : WeatherType(
        "Gęsta mrzawka",
        R.drawable.ic_rainshower
    )
    object LightFreezingDrizzle : WeatherType(
        "Lekka marznąca mżawka",
        R.drawable.ic_snowyrainy
    )
    object DenseFreezingDrizzle : WeatherType(
        "Gęsta marznąca mżawka",
        R.drawable.ic_snowyrainy
    )
    object SlightRain : WeatherType(
        "Opady deszczu",
        R.drawable.ic_rainy
    )
    object ModerateRain : WeatherType(
        "Deszcz",
        R.drawable.ic_rainy
    )
    object HeavyRain : WeatherType(
        "Silne opady deszczu",
        R.drawable.ic_rainy
    )
    object HeavyFreezingRain : WeatherType(
        "Deszcz ze śniegiem",
        R.drawable.ic_snowyrainy
    )
    object SlightSnowFall : WeatherType(
        "Lekkie opady śniegu",
        R.drawable.ic_snowy
    )
    object ModerateSnowfall : WeatherType(
        "Opady śniegu",
        R.drawable.ic_heavysnow
    )
    object HeavySnowFall : WeatherType(
        "Silne opady śniegu",
        R.drawable.ic_snowy
    )
    object SnowGrains : WeatherType(
        "Grad",
        R.drawable.ic_heavysnow
    )
    object SlightRainShowers: WeatherType(
        "Przelotne lekkie opady deszczu",
        R.drawable.ic_rainshower
    )
    object ModerateRainShowers : WeatherType(
        "Przetone opady deszczu",
        R.drawable.ic_rainshower
    )
    object ViolentRainShowers : WeatherType(
        "Gwałtowne opady deszczu",
        R.drawable.ic_rainshower
    )
    object SlightSnowShowers : WeatherType(
        "Przelotne opady śniegu",
        R.drawable.ic_snowy
    )
    object HeavySnowShowers : WeatherType(
        "Silne opady śniegu",
        R.drawable.ic_snowy
    )
    object ModerateThunderstorm : WeatherType(
        "Burza",
        R.drawable.ic_thunder
    )
    object SlightHailThunderStorm : WeatherType(
        "Burza z gradem",
        R.drawable.ic_rainythunder
    )
    object HeavyHailThunderstorm : WeatherType(
        "Silna burza z gradem",
        R.drawable.ic_rainythunder
    )

    companion object {
        fun fromWMO(id: Int): WeatherType {
            return when (id) {
                0 -> ClearSky
                1 -> MainlyClear
                2 -> PartlyCloudy
                3 -> Overcast
                45 -> Foggy
                48 -> DepositingRimeFog
                51 -> LightDrizzle
                53 -> ModerateDrizzle
                55 -> DenseDrizzle
                56 -> LightFreezingDrizzle
                57 -> DenseFreezingDrizzle
                61 -> SlightRain
                63 -> ModerateRain
                65 -> HeavyRain
                66 -> LightFreezingDrizzle
                67 -> HeavyFreezingRain
                71 -> SlightSnowFall
                73 -> ModerateSnowfall
                75 -> HeavySnowFall
                77 -> SnowGrains
                80 -> SlightRainShowers
                81 -> ModerateRainShowers
                82 -> ViolentRainShowers
                85 -> SlightSnowShowers
                86 -> HeavySnowShowers
                95 -> ModerateThunderstorm
                96 -> SlightHailThunderStorm
                99 -> HeavyHailThunderstorm
                else -> ClearSky
            }
        }
    }
}