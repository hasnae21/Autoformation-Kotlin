package com.example.todo_list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val listView: ListView = findViewById(R.id.listView)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {addItem()}

    }



    private fun addItem() {
        Toast.makeText(this,"btn clicked", Toast.LENGTH_SHORT).show()
    }
}