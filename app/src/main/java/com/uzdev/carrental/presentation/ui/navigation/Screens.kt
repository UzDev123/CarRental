package com.uzdev.carrental.presentation.ui.navigation

sealed class Screens(val route: String) {
    object Splash : Screens("splash")
    object Registration : Screens("registration")
    object Login : Screens("login")
}
