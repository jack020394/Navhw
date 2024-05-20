package com.example.navhw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navhw.ui.theme.NavHWTheme
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavHWTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Screen.Home.rout
                    ) {
                        composable(Screen.Home.rout){
                            HomeScreen(navController=navController)
                        }
                        composable(Screen.Place1.rout){
                            SecondScreen(navController=navController)
                        }
                        composable(Screen.Place2.rout){
                            Place2(navController=navController)
                        }
                        composable(Screen.Place3.rout){
                            Place3(navController=navController)
                        }
                        composable(Screen.Place4.rout){
                            Place4(navController=navController)
                        }
                        composable(Screen.Place5.rout){
                            Place5(navController=navController)
                        }
                        composable(Screen.Place6.rout){
                            Place6(navController=navController)
                        }
                        composable(Screen.Place7.rout){
                            Place7(navController=navController)
                        }
                        composable(Screen.Place8.rout){
                            Place8(navController=navController)
                        }
                        composable(Screen.Place9.rout){
                            Place9(navController=navController)
                        }
                    }

                }
            }
        }
    }
}

