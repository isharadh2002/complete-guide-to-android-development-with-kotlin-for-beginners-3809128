package com.example.two.trees.ui.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun TwoTreesNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(
                takeTourClick = {
                    navController.navigate(Screen.Tours.route)
                }
            )
        }
        composable(route = Screen.Tours.route) {
            ToursScreen()
        }
        composable(route = Screen.Shop.route) {
            ShopScreen()
        }
    }
}
