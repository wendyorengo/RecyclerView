package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_name_item.view.*

data class NamesRecyclerViewAdapter(val age:Int, val hobby:String, val namesList: List<String>) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_name_item, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return namesList.size
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvName.text = namesList[position].toString()
    }

    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)