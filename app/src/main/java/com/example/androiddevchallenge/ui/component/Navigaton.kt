package com.example.androiddevchallenge.ui.component

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screens.PetDetailScreen
import com.example.androiddevchallenge.ui.screens.PetListScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "petList") {
        composable("petList") {
            PetListScreen(navController)
        }
        composable("petDetail/{index}") {
            PetDetailScreen(
                navController,
                index = it.arguments?.getString("index")!!
            )
        }
    }
}

