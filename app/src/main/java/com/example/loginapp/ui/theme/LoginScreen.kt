package com.example.loginapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun LoginScreen(
    onNavigateToRegister: () -> Unit
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Text(
            "Login",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top=80.dp, start = 44.dp)
        )
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(top=160.dp),
            color = Color.White,
            shape = RoundedCornerShape(topStart = 48.dp, topEnd = 48.dp),
            shadowElevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
                    .padding(top=60.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                CustomStyledTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = "Email",
                    keyboardType = KeyboardType.Email // Reutiliza el estilo personalizado
                )
                Spacer(modifier = Modifier.height(16.dp))

                CustomStyledTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = "Password",
                    isPassword = true
                )

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = { /* TODO login */},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text("Login", fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text( "No tienes cuenta? Registrate aqui",
                    modifier = Modifier.clickable{onNavigateToRegister()},
                    style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.primary))
            }
        }
    }
}


