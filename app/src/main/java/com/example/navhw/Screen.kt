package com.example.navhw

sealed class Screen (val rout:String){
    object Home: Screen("home")
    object Place1: Screen("second")
    object Place2: Screen("place2")
    object Place3: Screen("place3")
    object Place4: Screen("place4")
    object Place5: Screen("place5")
    object Place6: Screen("place6")
    object Place7: Screen("place7")
    object Place8: Screen("place8")
    object Place9: Screen("place9")
}