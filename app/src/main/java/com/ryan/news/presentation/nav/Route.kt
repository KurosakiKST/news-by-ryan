package com.ryan.news.presentation.nav

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ryan.news.presentation.view.home.HomeView
import com.ryan.news.presentation.view.search.SearchView

@ExperimentalMaterial3Api
@Composable
internal fun Route() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            HomeView(navHostController = navController)
        }
        composable(Routes.Search.route) {
            SearchView(navHostController = navController)
        }
    }
}

sealed class Routes(val route : String) {
    object Home : Routes("home")

    object Search : Routes("search")

}