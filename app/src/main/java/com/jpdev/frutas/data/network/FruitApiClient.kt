package com.jpdev.frutas.data.network

import com.jpdev.frutas.data.model.Fruta
import retrofit2.Response
import retrofit2.http.GET

interface FruitApiClient {
    @GET("all")
    suspend fun getAllFruites():Response<List<Fruta>>
}