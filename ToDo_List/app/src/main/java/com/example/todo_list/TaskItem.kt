package com.example.todo_list

import java.time.LocalDate
import java.time.LocalTime
import java.util.*


class TaskItem
    (
    var name:String,
    var desc:String,
    var dueTime:LocalTime?,
    var complatedDate: LocalDate?,
    var id: UUID = UUID.randomUUID()
    )
{

}