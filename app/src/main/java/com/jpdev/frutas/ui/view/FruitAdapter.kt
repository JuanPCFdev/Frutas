package com.jpdev.frutas.ui.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jpdev.frutas.R
import com.jpdev.frutas.data.model.Fruta

class FruitAdapter(private val frutas:List<Fruta>):RecyclerView.Adapter<FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FruitViewHolder(layoutInflater.inflate(R.layout.item_fruit,parent, false))
    }

    override fun getItemCount(): Int = frutas.size

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val item = frutas[position]
        holder.bind(item)
    }
}