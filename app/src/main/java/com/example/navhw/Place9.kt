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
fun Place9(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.paly),
                contentDescription = " Image ",
                modifier = Modifier
                    .size(300.dp)
                    .padding(bottom = 10.dp)
            )
            Text(
                text = "八里區，舊稱「八里坌」，前身「八里鄉」，位於中華民國新北市西北部" +
                        "，臺北盆地的西北端，總面積為39.4933平方公里，呈長形帶狀，其主要位在" +
                        "淡水河出海口之西側，東北隔淡水河與淡水區相望，西接林口區，南隔觀音山與" +
                        "五股區為鄰，西北濱臨臺灣海峽，東鄰臺北市北投區、士林區",
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