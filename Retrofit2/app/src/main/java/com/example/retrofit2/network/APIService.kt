package com.example.retrofit2.network

import com.example.retrofit2.model.Region
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("region")
    fun getRegion(): Call<List<Region>>
}