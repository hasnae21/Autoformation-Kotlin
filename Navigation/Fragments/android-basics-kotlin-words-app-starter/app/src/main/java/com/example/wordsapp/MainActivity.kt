package com.example.wordsapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        On utiliserez une implémentation intégrée, appelée NavHostFragment





//        recyclerView = binding.recyclerView
//        // recyclerView.layoutManager = LinearLayoutManager(this)
//        chooseLayout()
//        //recyclerView.adapter = LetterAdapter()
    }

}
