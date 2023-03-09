package com.example.todo_list.data

import com.example.todo_list.enum.STATUS
import com.example.todo_list.model.Task

class Datasource {

    //list to stored tasks
    val tasks = mutableListOf<Task>()


// add function
    fun add(name: String, status: STATUS = STATUS.WAITING){

        // task object of Task class
        val task = Task(name, status)

        // add a task to tasks list
        this.tasks.add(task)
    }


// delete function
    fun delete(index: Int) {

        // remouve task from tasks list
        this.tasks.removeAt(index)
    }

}