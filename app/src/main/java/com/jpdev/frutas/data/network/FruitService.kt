package com.jpdev.frutas.data.network

import com.jpdev.frutas.core.RetrofitHelper
import com.jpdev.frutas.data.model.Fruta
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FruitService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getFruits(): List<Fruta> {

        return withContext(Dispatchers.IO) {
            val response = retrofit.create(FruitApiClient::class.java).getAllFruites()
            response.body() ?: emptyList()
        }

    }

}