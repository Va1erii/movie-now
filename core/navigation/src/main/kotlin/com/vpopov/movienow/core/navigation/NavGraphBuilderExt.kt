package com.vpopov.movienow.core.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

fun NavGraphBuilder.register(
    router: Router,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    router.register(
        navGraphBuilder = this,
        navController = navController,
        modifier = modifier
    )
}
