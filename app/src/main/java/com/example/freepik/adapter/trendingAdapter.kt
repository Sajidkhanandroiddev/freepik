package com.example.freepik.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.freepik.Model.VectorsModel
import com.example.freepik.R

class trendingAdapter(private val data: List<VectorsModel>)  :RecyclerView.Adapter<trendingAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemImage: ImageView = view.findViewById(R.id.trendingimageView)
        val itemText: TextView = view.findViewById(R.id.trendingtextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.trendinglayout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        Glide.with(holder.itemView)
            .load(item.image)
            .centerCrop()
            .placeholder(R.drawable.sample)
            .into(holder.itemImage)
        holder.itemText.text = item.text
    }
}