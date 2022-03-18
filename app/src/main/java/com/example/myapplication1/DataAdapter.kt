package com.example.myapplication1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication1.databinding.LayoutDatalistBinding

class DataAdapter(val dataArray: List<DataModel>): RecyclerView.Adapter<DataAdapter.DataListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutDatalistBinding.inflate(inflater)
        return DataListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataListViewHolder, position: Int) {
        holder.bind(dataArray[position])
    }

    override fun getItemCount(): Int {
        return dataArray.size
    }

    class DataListViewHolder(val binding: LayoutDatalistBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DataModel) {

            binding.dataModel = data
            binding.executePendingBindings()
        }
    }
}