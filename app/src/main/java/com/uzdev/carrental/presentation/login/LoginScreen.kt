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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.uzdev.carrental.R
import com.uzdev.carrental.presentation.ui.navigation.Screens
import com.uzdev.carrental.presentation.ui.theme.ColorSignUp

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

            val modifier = Modifier
                .fillMaxWidth()
                .align(CenterHorizontally)
                .padding(4.dp)
            val email = OutlinedEmailField(modifier = modifier)
            val pass = OutLinedPasswordField(modifier = modifier)


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
                    .align(CenterHorizontally),
                shape = RoundedCornerShape(32.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = ColorSignUp,
                    contentColor = Color.White,
                )
            ) {
                Text(text = "Sign In ", color = Color.White)
            }

            Text(
                text = "I have not account yet",
                fontSize = 10.sp,
                modifier = Modifier
                    .align(CenterHorizontally)
                    .padding(4.dp)
                    .clickable {
                        navHostController.navigate(Screens.Registration.route)
                    },
                color = Color.LightGray,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}


@Composable
fun OutLinedPasswordField(modifier: Modifier): String {
    var password by remember { mutableStateOf("") }
    OutlinedTextField(
        value = password,
        onValueChange = {
            password = it
        },
        label = { Text("Password", color = Color.White) },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

        shape = RoundedCornerShape(32.dp),
        modifier = modifier,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = colorResource(id = R.color.tf_back),
            cursorColor = Color.White,
            textColor = Color.White,
            focusedBorderColor = Color.White,

            ),
    )

    return password
}

@Composable
fun OutlinedEmailField(modifier: Modifier): String {
    var email by remember { mutableStateOf("") }
    OutlinedTextField(

        value = email, label = { Text(text = "Email", color = Color.White) },
        onValueChange = { email = it },

        shape = RoundedCornerShape(32.dp),
        modifier = modifier,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = colorResource(id = R.color.tf_back),
            cursorColor = Color.White,
            textColor = Color.White,
            focusedBorderColor = Color.White
        ),


        )

    return email

}