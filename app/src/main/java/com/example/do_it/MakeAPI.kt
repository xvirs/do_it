package com.example.do_it

import retrofit2.http.GET

interface MakeAPI {

    @GET("activity/")
    suspend fun getMake():MakeResponse
}