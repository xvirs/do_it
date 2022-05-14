package com.example.do_it

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MakeNetwork {

    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.boredapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MakeAPI::class.java)
    }

}