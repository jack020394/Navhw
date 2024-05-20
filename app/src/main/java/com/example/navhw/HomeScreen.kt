package com.example.navhw

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController){
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)
        ,verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "花蓮", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place1.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text ="澎湖", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place2.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text ="台東", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place3.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text ="台北", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place4.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text ="台南", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place5.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text ="台中", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place6.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text ="新竹", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place7.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text ="綠島", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place8.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp).height(75.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text ="八里", modifier = Modifier.weight(1f))
                Button(onClick = {
                    navController.navigate(Screen.Place9.rout)

                }) {
                    Text(text = "更多")
                }
            }
        }

    }

}