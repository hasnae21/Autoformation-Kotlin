package com.example.todo_list

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.todo_list.adapter.ItemAdapter
import com.example.todo_list.data.Datasource

class MainActivity : AppCompatActivity() {
    @SuppressLint("NotifyDataSetChanged", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // class Datasource()
        val datasource: Datasource = Datasource()


        // DOM elements
        val recyclerView = findViewById<RecyclerView>(R.id.list_view)
        val createButton: Button = findViewById(R.id.add_button)


        //
        recyclerView.adapter = ItemAdapter(this, datasource)
        recyclerView.layoutManager = LinearLayoutManager(this)


        // onclick event
        createButton.setOnClickListener{

            // DOM elements
            val taskName: String = findViewById<EditText>(R.id.new_task_name).text.toString()

            // call fun add from Datasource() class
            datasource.add(taskName)

            // Toast validator
            Toast.makeText(this, "Task Added", Toast.LENGTH_SHORT).show()

            // notifyDataSetChanged()
            recyclerView.adapter?.notifyDataSetChanged()
        }
    }
}