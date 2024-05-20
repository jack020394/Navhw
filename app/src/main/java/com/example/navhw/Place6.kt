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
fun Place6(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.taichung),
                contentDescription = " Image ",
                modifier = Modifier
                    .size(300.dp)
                    .padding(bottom = 10.dp)
            )
            Text(
                text = "「臺中」意即「臺灣之中央」，名稱始於日治時期。在清代以前，" +
                        "臺中便開始出現聚落，但不如鹿港一帶繁榮。其現代化城市的雛形" +
                        "，是於1900年在臺灣日治時期市區改正之後形成。日治時期因" +
                        "日人刻意打造成現代化城市，以市區改正政策將早期的市區規劃，整" +
                        "治流經市區的綠川和柳川，因市區植有柳樹，幽靜美麗，在臺灣日治" +
                        "時期日人宣傳片介紹中有「臺灣的京都」之稱。",
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