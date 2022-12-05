package com.uzdev.carrental.presentation.login

import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.uzdev.carrental.R
import com.uzdev.carrental.presentation.ui.theme.CircleBack
import com.uzdev.carrental.presentation.ui.theme.ColorSignUp
import com.uzdev.carrental.presentation.ui.theme.ColorSplashBack

@Composable
fun LoginScreen(navHostController: NavHostController) {
    Box(
        Modifier.fillMaxSize()
    ) {
        Image(
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = R.drawable.ic_car_back_registr),
            contentScale = ContentScale.Crop,
        )
        Column(
            Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(8.dp)
        ) {
            var email by remember { mutableStateOf("") }
            OutlinedTextField(

                value = email, label = { Text(text = "Email") },
                onValueChange = { email = it },

                shape = RoundedCornerShape(32.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(CenterHorizontally)
                    .padding(4.dp),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = colorResource(id = R.color.tf_back),
                    cursorColor = Color.White,
                    textColor = Color.White
                ),


                )
            var password by remember { mutableStateOf("") }
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = { Text("Enter password") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

                shape = RoundedCornerShape(32.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(CenterHorizontally)
                    .padding(4.dp),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = colorResource(id = R.color.tf_back),
                    cursorColor = Color.White,
                    textColor = Color.White
                )


            )
        }

        Column(
            Modifier
                .fillMaxWidth(0.8f)
                .align(Alignment.BottomCenter)
                .padding(end = 8.dp, start = 8.dp, top = 8.dp, bottom = 32.dp)
        ) {
            Button(
                onClick = { Log.d("mlog", " Sing in"); },
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(32.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = ColorSignUp,
                    contentColor = Color.White,
                )
            ) {
                Text(text = "Sign In ", color = Color.White)
            }
//            Button(
//                onClick = { /*TODO*/ },
//
//                modifier = Modifier
//                    .padding(4.dp)
//                    .shadow(4.dp, shape = RoundedCornerShape(32.dp), clip = false)
//                    .fillMaxWidth(0.9f)
//                    .alpha(0.8f)
//                    .align(Alignment.CenterHorizontally),
//                shape = RoundedCornerShape(32.dp),
//                colors = ButtonDefaults.buttonColors(
//                    backgroundColor = ColorSplashBack,
//                    contentColor = ColorSignUp,
//                )
//            ) {
//                Text(text = "Sign In With Other", color = Color.LightGray)
//            }

            Text(
                text = "I have not account yet",
                fontSize = 10.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(4.dp)
                    .clickable {
                        navHostController.navigate("login")
                    },
                color = Color.LightGray,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}