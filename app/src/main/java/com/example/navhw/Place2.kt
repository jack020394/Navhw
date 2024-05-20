package com.example.navhw

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Place2(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = {
                navController.navigate(Screen.Home.rout)
            },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Text(text = "返回")
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ponhu),
                contentDescription = " Image ",
                modifier = Modifier
                    .size(300.dp)
                    .padding(bottom = 10.dp)
            )
            Text(
                text = "澎湖縣，古稱平湖、彭湖，位於臺灣南部臺灣海峽上，由澎湖群島所組成，" +
                        "以澎湖水道與臺灣本島之雲林縣、嘉義縣相望。縣治及最大城市為馬公市。" +
                        "澎湖縣內轄有1市、5鄉，共有6個鄉市。由於特殊的地理位置及優良的港灣條件，" +
                        "自古以來便是往來臺灣海峽的移民中繼站與軍事要地。由於縣內遍布天人菊，" +
                        "澎湖也有「菊島」的美稱",
                modifier = Modifier.padding(bottom = 50.dp)
            )
            Button(

                onClick = { /* 按鈕點擊事件 */ }

            ) {
                Text(text = "地圖", modifier = Modifier.padding(4.dp) )

            }
        }
    }
}