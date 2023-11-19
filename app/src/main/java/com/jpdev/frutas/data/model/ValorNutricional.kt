package com.jpdev.frutas.data.model

import com.google.gson.annotations.SerializedName

data class ValorNutricional(
    @SerializedName("calories") var calories: Float,
    @SerializedName("fat") var fat: Float,
    @SerializedName("sugar") var sugar: Float,
    @SerializedName("carbohydrates") var carbohydrates: Float,
    @SerializedName("protein") var protein: Float
)