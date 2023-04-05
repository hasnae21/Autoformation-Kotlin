package com.example.todo_list

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.*
import com.example.todo_list.adapter.ItemAdapter
import com.example.todo_list.data.Datasource
import com.example.todo_list.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    var day = 0
    var month = 0
    var year = 0
    var hour = 0
    var minute = 0

    var savedDay = 0
    var savedMonth = 0
    var savedYear = 0
    var savedHour = 0
    var savedMinute = 0


    private fun getDateTimeCalendar(){
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)
    }

    private fun pickDate(){
        val btn_timePicker: Button = findViewById(R.id.btn_timePicker)
        btn_timePicker.setOnClickListener{
            //adb logcat "eglCodecCommon:S"

            //
            getDateTimeCalendar()
            DatePickerDialog(this, this, year, month, day).show()
        }
    }
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        savedDay = dayOfMonth
        savedMonth = month
        savedYear = year

        //
        getDateTimeCalendar()
        TimePickerDialog(this,this,hour,minute,true).show()
    }

    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        savedHour = hourOfDay
        savedMinute = minute

        //
        val new_task_dueTime = findViewById<TextView>(R.id.new_task_dueTime)
        new_task_dueTime.setText("$savedDay-$savedMonth-$savedYear\n $savedHour heur $savedMinute min")
    }


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

            // DOM elements task name, task description and task time
            val taskName: String = findViewById<EditText>(R.id.new_task_name).text.toString()
            val taskDescription: String = findViewById<EditText>(R.id.new_task_desc).text.toString()
            val new_task_dueTime:String = findViewById<TextView>(R.id.new_task_dueTime).text.toString()



            pickDate()



            // call fun add from Datasource() class
            datasource.add(taskName,taskDescription,new_task_dueTime)

            // Toast validator
            Toast.makeText(this, "Task Added", Toast.LENGTH_SHORT).show()

            recyclerView.adapter?.notifyDataSetChanged()
        }

    }

}