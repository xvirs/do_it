package com.example.do_it

data class MakeResponse(
    val activity:String,
    val type:String,
    val participants:Int,
    val price:Double,
    val link:String,
    val key:String,
    val accessibility:Double
)