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
fun Place5(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.tainang),
                contentDescription = " Image ",
                modifier = Modifier
                    .size(300.dp)
                    .padding(bottom = 10.dp)
            )
            Text(
                text = "臺南市，通稱臺南，簡稱「南」，為中華民國直轄市，臺灣六都之一，" +
                        "位於臺灣西南部，其西面臨臺灣海峽、東面臨阿里山山脈、北面與嘉義縣鄰接 " +
                        "、南面與高雄市鄰接。面積2,191.65平方公里，為台灣各縣市中，平原區比例最大、地" +
                        "形最平緩的城市，農耕地面積全臺灣第一。阡陌交錯，公路道路為全臺最多，全市文化古蹟遍" +
                        "佈，多元文化並存。",
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