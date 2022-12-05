package com.uzdev.carrental.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.uzdev.carrental.presentation.login.LoginScreen
import com.uzdev.carrental.presentation.registration.RegistrationScreen
import com.uzdev.carrental.presentation.splash.AnimatedSplashScreen

@Composable
fun SetUpNavController(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Splash.route) {
        composable(Screens.Splash.route)
        { AnimatedSplashScreen(navController) }
        composable(Screens.Registration.route)
        { RegistrationScreen(navController) }

        composable(Screens.Login.route)
        { LoginScreen(navController) }
    }
}