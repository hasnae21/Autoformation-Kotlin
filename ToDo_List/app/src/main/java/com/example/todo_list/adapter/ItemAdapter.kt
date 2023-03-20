package com.example.todo_list.adapter

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.todo_list.R
import com.example.todo_list.data.Datasource

class ItemAdapter(
    private val context: Context,
    private val datasource: Datasource
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(
        private val view: View
        ) : RecyclerView.ViewHolder(view) {

        // DOM elements
        val textViewName: TextView = view.findViewById(R.id.list_item)
        val textViewDesc: TextView = view.findViewById(R.id.list_item_desc)
        val textViewTime: TextView = view.findViewById(R.id.list_item_dueTime)

        val editButton: ImageButton = view.findViewById(R.id.edit_button)
        val deleteButton: ImageButton = view.findViewById(R.id.delete_button)
    }


    // onCreateViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        // navigate to list_item.xml layout
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }
    /////////////////////

    @SuppressLint("MissingInflatedId")

    // onBindViewHolder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val task = datasource.tasks[position]
        holder.textViewName.text = task.name
        holder.textViewDesc.text = task.desc
        holder.textViewTime.text = task.dueTime.toString()



        // onclick event Delete
        holder.deleteButton.setOnClickListener {

            datasource.tasks.removeAt(position)
            this.notifyItemRemoved(position)

            // Toast validator
            Toast.makeText(context, "Task Deleted", Toast.LENGTH_SHORT).show()
        }


        // onclick event Update
        holder.editButton.setOnClickListener {

            val dialog = Dialog(context)

            // navigate to activity_edit.xml layout
            val view: View = LayoutInflater.from(context).inflate(R.layout.activity_edit, null)


            // DOM elements
            val updateButton: Button = view.findViewById(R.id.update_button)
            val Input1: EditText = view.findViewById(R.id.editTask_name)
            val Input2: EditText = view.findViewById(R.id.editTask_desc)



            Input1.setText(task.name)
            Input2.setText(task.desc)


            // onclick event
            updateButton.setOnClickListener {
                task.name = Input1.text.toString()
                task.desc = Input2.text.toString()

                this.notifyItemChanged(position)

                dialog.cancel()

                // Toast validator
                Toast.makeText(context, "Task Updated", Toast.LENGTH_SHORT).show()
            }


            dialog.setContentView(view)
            dialog.show()
        }
    }
    //////////////////////////


    override fun getItemCount(): Int = datasource.tasks.size

}