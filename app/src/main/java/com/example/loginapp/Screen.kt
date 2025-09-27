package com.example.loginapp

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen(val route: String){
    @Serializable object Login : Screen("login")
    @Serializable object Register: Screen("register")
}