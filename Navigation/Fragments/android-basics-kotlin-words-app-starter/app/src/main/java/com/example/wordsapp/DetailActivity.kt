package com.example.wordsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordsapp.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    companion object {
        const val LETTER = "letter"
        val SEARCH_PREFIX = "https://www.google.com/search?q="
    }

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            val binding = ActivityDetailBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // val letterId = "A"
            // val letterId = intent?.extras?.getString("letter").toString()
            val letterId = intent?.extras?.getString(LETTER).toString()

            val recyclerView = binding.recyclerView

            recyclerView.layoutManager = LinearLayoutManager(this)

            recyclerView.adapter = WordAdapter(letterId, this)

            // Adds a [DividerItemDecoration] between items
            recyclerView.addItemDecoration(
                DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
            )

            title = getString(R.string.detail_prefix) + " " + letterId
        }
}