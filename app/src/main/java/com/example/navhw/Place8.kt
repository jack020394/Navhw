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
fun Place8(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.greenisland),
                contentDescription = " Image ",
                modifier = Modifier
                    .size(300.dp)
                    .padding(bottom = 10.dp)
            )
            Text(
                text = "綠島是由輝石安山岩所形成之火山島，為全國第四大附屬島嶼" +
                        "。族群結構上主要為清領時期自琉球嶼與東港移民而來的閩南人" +
                        "，且為臺東縣唯一無原住民族地位的行政區，在戒嚴時期曾是" +
                        "關押政治犯的著名監獄。由於島嶼擁有豐富的海岸生態資源，1980" +
                        "年代以後被劃為「綠島風景特定區」的一部分，旅客人次迅速增加，" +
                        "促使觀光業成為綠島鄉的主要經濟產業。",
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