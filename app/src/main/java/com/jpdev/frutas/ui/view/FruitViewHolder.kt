package com.jpdev.frutas.ui.view

import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jpdev.frutas.data.model.Fruta
import com.jpdev.frutas.databinding.ItemFruitBinding

class FruitViewHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding = ItemFruitBinding.bind(view)

    fun bind(fruta:Fruta){
        binding.tvFruit.text = fruta.name

        binding.cvFruit.setOnClickListener {
            val context = binding.cvFruit.context
            val intent = Intent(context,InfoFruitActivity::class.java)

            intent.putExtra("name",fruta.name)
            intent.putExtra("id",fruta.id.toString())
            intent.putExtra("family",fruta.family)
            intent.putExtra("genus",fruta.genus)
            intent.putExtra("order",fruta.order)
            intent.putExtra("fat",fruta.nutritions.fat.toString())
            intent.putExtra("protein",fruta.nutritions.protein.toString())
            intent.putExtra("sugar",fruta.nutritions.sugar.toString())
            intent.putExtra("carbohydrates",fruta.nutritions.carbohydrates.toString())
            intent.putExtra("calories",fruta.nutritions.calories.toString())

            context.startActivity(intent)
        }

    }

}