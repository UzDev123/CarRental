package com.uzdev.carrental.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.uzdev.carrental.presentation.registration.RegistrationScreen
import com.uzdev.carrental.presentation.splash.SplashScreen
import com.uzdev.carrental.presentation.ui.navigation.SetUpNavController
import com.uzdev.carrental.presentation.ui.theme.CarRentalTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import java.util.Timer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarRentalTheme {
                    val navController = rememberNavController()
                    SetUpNavController(navController)

            }
        }
    }
}

