package com.example.todo_list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.todo_list.adapter.ItemAdapter
import com.example.todo_list.data.TaskManagment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val TaskManagment: TaskManagment = TaskManagment()

        val button: Button = findViewById(R.id.add_task_button)
        val recyclerView = findViewById<RecyclerView>(R.id.list_view)

        //recyclerView.adapter = ItemAdapter(this, TaskManagment)
        recyclerView.layoutManager = LinearLayoutManager(this)



        button.setOnClickListener{
            val taskName: String = findViewById<EditText>(R.id.new_task_name).text.toString()
            val taskDescription: String = findViewById<EditText>(R.id.new_task_desc).text.toString()

            TaskManagment.add(taskName,taskDescription)

            Toast.makeText(this, "Task Added", Toast.LENGTH_SHORT).show()

            recyclerView.adapter?.notifyDataSetChanged()
        }


    }



}