package com.vpopov.movienow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.vpopov.movienow.core.design.system.DlsTheme
import com.vpopov.movienow.core.navigation.register

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val app = applicationContext as MovieNowApp
        val featureMovieListApi = app.component.provideFeatureMovieListApi()

        setContent {
            DlsTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()

                Surface(color = MaterialTheme.colors.background) {
                    NavHost(
                        navController = navController,
                        startDestination = featureMovieListApi.router().route()
                    ) {
                        this.register(
                            featureMovieListApi.router(),
                            navController
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DlsTheme {
        Greeting("Android")
    }
}