package com.jpdev.frutas.domain

import com.jpdev.frutas.data.FruitRepository
import com.jpdev.frutas.data.model.Fruta

class GetFruitUseCase {
    private val repository = FruitRepository()

    suspend operator fun invoke():List<Fruta>? = repository.getAllFruites()

}