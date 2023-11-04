package co.danjuma.ideaplayground.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.danjuma.ideaplayground.screens.MainActivityScreen
import co.danjuma.ideaplayground.screens.NewScreen
import co.danjuma.ideaplayground.screens.TipCalculatorScreen

@Composable
fun ComposeNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "MainActivityScreen" ){

        composable(route = "MainActivityScreen"){
         MainActivityScreen(navController)
        }

        composable(route = "TipCalculatorScreen"){
            TipCalculatorScreen(navController)
        }

        composable(route = "NewScreen"){
            NewScreen(navController)
        }
    }

}