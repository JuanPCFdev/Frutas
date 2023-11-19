package com.jpdev.frutas.data.model

import com.google.gson.annotations.SerializedName

data class Fruta(
    @SerializedName("name") var name: String,
    @SerializedName("id") var id: Int,
    @SerializedName("family") var family: String,
    @SerializedName("order") var order: String,
    @SerializedName("genus") var genus : String,
    @SerializedName("nutritions") var nutritions: ValorNutricional
    )