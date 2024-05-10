package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet: Array<String>)
    : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

        class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
            val textView : TextView

            init {
                textView = view.findViewById(R.id.textView)
            }
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(viewGroup.context)
           .inflate(R.layout.item_layout,viewGroup,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }
}