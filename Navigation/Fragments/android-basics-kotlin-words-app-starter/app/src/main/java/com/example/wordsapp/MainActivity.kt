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

//        recyclerView = binding.recyclerView
//
//        // recyclerView.layoutManager = LinearLayoutManager(this)
//        chooseLayout()
//
//        //recyclerView.adapter = LetterAdapter()
    }

//    // Activer le buton menu view layout and grid
//    private var isLinearLayoutManager = true
//
//    private fun chooseLayout() {
//        if (isLinearLayoutManager) {
//            recyclerView.layoutManager = LinearLayoutManager(this)
//        } else {
//            recyclerView.layoutManager = GridLayoutManager(this, 4)
//        }
//        recyclerView.adapter = LetterAdapter()
//    }
//
//    private fun setIcon(menuItem: MenuItem?) {
//        if (menuItem == null)
//            return
//
//        menuItem.icon =
//            if (isLinearLayoutManager)
//                ContextCompat.getDrawable(this, R.drawable.ic_grid_layout)
//            else ContextCompat.getDrawable(this, R.drawable.ic_linear_layout_list)
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.layout_menu, menu)
//
//        val layoutButton = menu?.findItem(R.id.action_switch_layout)
//        setIcon(layoutButton)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.action_switch_layout -> {
//                isLinearLayoutManager = !isLinearLayoutManager
//                chooseLayout()
//                setIcon(item)
//                return true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}
