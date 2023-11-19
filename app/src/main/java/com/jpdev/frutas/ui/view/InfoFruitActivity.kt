package com.jpdev.frutas.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.frutas.R
import com.jpdev.frutas.databinding.ActivityInfoFruitBinding

class InfoFruitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInfoFruitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoFruitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Aqui debemos extraer mediante el intent, el objeto de tipo fruta que le enviemos, para posteriormente mostrar su información

        initListeners()
        getFruitInfo()
    }

    private fun getFruitInfo(){
        val name = intent.extras?.getString("name")
        val id = intent.extras?.getString("id")
        val family = intent.extras?.getString("family")
        val genus = intent.extras?.getString("genus")
        val order = intent.extras?.getString("order")
        val fat = intent.extras?.getString("fat")
        val protein = intent.extras?.getString("protein")
        val sugar = intent.extras?.getString("sugar")
        val carbohydrates = intent.extras?.getString("carbohydrates")
        val calories = intent.extras?.getString("calories")

        val str = "Nombre : $name. \n" +
                "Id: $id. \n" +
                "Familia: $family. \n" +
                "Genero: $genus. \n" +
                "Orden: $order. \n" +
                "Genero: $genus. \n" +
                "Grasas: $fat. \n" +
                "Proteina: $protein. \n" +
                "Azucares: $sugar. \n" +
                "Carbohidratos: $carbohydrates. \n" +
                "Calorias: $calories. \n"

        binding.tvFruit.text = str
    }

    private fun initListeners(){
        binding.btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}