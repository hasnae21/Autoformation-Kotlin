package com.example.todo_list.data

import com.example.todo_list.model.Task

class TaskManagment {
    val tasks = mutableListOf<Task>()

    fun add(name: String, desc: String){
        val task = Task(name,desc)
        this.tasks.add(task)
    }

    fun delete(index: Int) {
        this.tasks.removeAt(index)
    }

}