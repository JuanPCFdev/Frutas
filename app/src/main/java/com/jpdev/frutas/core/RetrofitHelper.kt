package com.jpdev.frutas.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://www.fruityvice.com/api/fruit/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}