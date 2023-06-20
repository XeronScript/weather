package com.example.weather.forecast.presentation.navigation


import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import com.google.accompanist.navigation.animation.composable
//import com.google.accompanist.navigation.animation.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
import com.example.weather.favorites.presentation.SearchScreen
import com.example.weather.forecast.presentation.HomeScreen
import com.example.weather.forecast.presentation.WeatherViewModel
import com.example.weather.forecast.presentation.WeeklyForecastScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavigationGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    viewModel: WeatherViewModel
) {
    val animationTransitionTime = 300
    AnimatedNavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "home"
    ) {
        composable(
            route = "home",
            enterTransition = {
                when (initialState.destination.route) {
                    "weekly_weather_forecast" -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(animationTransitionTime)
                    )

                    "favorites" -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(animationTransitionTime)
                    )

                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    "weekly_weather_forecast" -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(animationTransitionTime)
                    )

                    "favorites" -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(animationTransitionTime)
                    )

                    else -> null
                }
            }
        ) {
            HomeScreen(viewModel)
        }

        composable(
            route = "weekly_weather_forecast",
            enterTransition = {
                when (initialState.destination.route) {
                    "favorites" -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(animationTransitionTime)
                    )

                    "home" -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(animationTransitionTime)
                    )

                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    "home" -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(animationTransitionTime)
                    )

                    "favorites" -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(animationTransitionTime)
                    )

                    else -> null
                }
            }
        ) {
            WeeklyForecastScreen(viewModel)
        }

        composable(
            route = "favorites",
            enterTransition = {
                when (initialState.destination.route) {
                    "home" -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(animationTransitionTime)
                    )

                    "weekly_weather_forecast" -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(animationTransitionTime)
                    )

                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    "home" -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(animationTransitionTime)
                    )

                    "weekly_weather_forecast" -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(animationTransitionTime)
                    )

                    else -> null
                }
            }
        ) {
            SearchScreen()
        }
    }
}
