package com.vpopov.movienow.feature.login.imp.navigation

import androidx.navigation.compose.composable
import com.vpopov.movienow.core.navigation.Router
import com.vpopov.movienow.feature.login.imp.ui.LoginScreen

class FeatureLoginRouter : Router {
    override fun route(): String = "login"

    override fun register(
        navGraphBuilder: androidx.navigation.NavGraphBuilder,
        navController: androidx.navigation.NavController,
        modifier: androidx.compose.ui.Modifier
    ) {
        navGraphBuilder.composable(route()) {
            LoginScreen(navController)
        }
    }
}