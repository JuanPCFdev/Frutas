package com.jpdev.frutas.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jpdev.frutas.data.model.Fruta
import com.jpdev.frutas.domain.GetFruitUseCase
import kotlinx.coroutines.launch

class FrutaViewModel : ViewModel() {

    val listFruta:MutableLiveData<List<Fruta>?> = MutableLiveData()

    var getFruitUseCase = GetFruitUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getFruitUseCase()
            if(!result.isNullOrEmpty()){
                listFruta.value = result
            }
        }
    }

    fun filterFruitsByName(query: String) {
        viewModelScope.launch {
            val frutas = getFruitUseCase()
            val frutasFiltradas = frutas?.filter { it.name.contains(query, ignoreCase = true) }
            listFruta.value = frutasFiltradas
        }
    }

}