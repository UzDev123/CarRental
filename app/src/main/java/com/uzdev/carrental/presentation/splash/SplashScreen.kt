package com.uzdev.carrental.presentation.splash

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.uzdev.carrental.R
import com.uzdev.carrental.presentation.ui.navigation.Screens
import com.uzdev.carrental.presentation.ui.theme.CircleBack
import com.uzdev.carrental.presentation.ui.theme.ColorSplashBack
import kotlinx.coroutines.delay


@Composable
fun AnimatedSplashScreen(navController: NavHostController) {
    var startAnim by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnim) 1f else 0f,
        animationSpec = tween(durationMillis = 1000)
    )

    LaunchedEffect(key1 = true) {
        startAnim = true
        delay(3000)
        navController.popBackStack()
        navController.navigate(Screens.Registration.route)
    }
    SplashScreen(alphaAnim.value)

}

@Composable
fun SplashScreen(alpha: Float) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = ColorSplashBack)
    ) {
        Box(
            modifier = Modifier
                .size(220.dp)
                .background(shape = CircleShape, color = CircleBack)
                .align(Alignment.Center)
        ) {
            Column(
                Modifier
                    .size(220.dp)
                    .align(Alignment.Center),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                        .alpha(alpha)
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.ic_car),
                )
                Text(
                    text = "Car Rental",
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 22.sp,
                    modifier = Modifier.alpha(alpha)
                )
            }


        }


    }

}