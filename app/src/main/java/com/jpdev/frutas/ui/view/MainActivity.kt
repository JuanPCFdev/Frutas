package com.jpdev.frutas.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.jpdev.frutas.data.model.Fruta
import com.jpdev.frutas.databinding.ActivityMainBinding
import com.jpdev.frutas.ui.viewmodel.FrutaViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val frutaViewModel: FrutaViewModel by viewModels()

    private lateinit var adapter: FruitAdapter
    private var fruitsList = mutableListOf<Fruta>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        frutaViewModel.onCreate()
        frutaViewModel.listFruta.observe(this, Observer {
            fruitsList = it as MutableList<Fruta>
            adapter = FruitAdapter(fruitsList)
            binding.rvFruits.layoutManager = LinearLayoutManager(this)
            binding.rvFruits.adapter = adapter
            adapter.notifyDataSetChanged()
        })
        initListeners()
    }

    private fun initListeners(){
        binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                // Este método se llama cuando se envía la consulta presionando "Enter" en el teclado
                // Aquí puedes realizar la búsqueda o cualquier acción adicional
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                // Este método se llama cuando el texto en el SearchView cambia
                // Puedes realizar acciones en tiempo real mientras el usuario escribe
                // newText contiene el texto actual del SearchView
                frutaViewModel.filterFruitsByName(newText)
                return true
            }
        })
    }

}