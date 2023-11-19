package com.jpdev.frutas.data

import com.jpdev.frutas.data.model.FruitProvider
import com.jpdev.frutas.data.model.Fruta
import com.jpdev.frutas.data.network.FruitService

class FruitRepository {

    private val api = FruitService()

    suspend fun getAllFruites():List<Fruta>{
        val response = api.getFruits()
        FruitProvider.fruits = response
        return response
    }

}