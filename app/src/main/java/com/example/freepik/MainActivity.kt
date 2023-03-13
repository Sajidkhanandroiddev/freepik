package com.example.freepik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.freepik.Model.VectorsModel
import com.example.freepik.adapter.VectorAdapter
import com.example.freepik.adapter.trendingAdapter

class MainActivity : AppCompatActivity() {
   lateinit var recyclerView:RecyclerView
    lateinit var trendingRecyclerView:RecyclerView
    lateinit var unlockRecyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.vectorRecyclerview)
        trendingRecyclerView=findViewById(R.id.trendingRecyclerview)
        unlockRecyclerView=findViewById(R.id.unloackRecyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        trendingRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        unlockRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val data = listOf(
            VectorsModel(R.drawable.sample, "Item 1"),
            VectorsModel(R.drawable.sample, "Item 2"),
            VectorsModel(R.drawable.sample, "Item 3"),
            VectorsModel(R.drawable.sample, "Item 4"),
            VectorsModel(R.drawable.sample, "Item 5"),

        )
        val trendingData = listOf(
            VectorsModel(R.drawable.sampletwo, "Color Splash Background Images"),
            VectorsModel(R.drawable.sampletwo, "Color Splash Background Images"),
            VectorsModel(R.drawable.sampletwo, "Color Splash Background Images"),
            VectorsModel(R.drawable.sampletwo, "Color Splash Background Images"),
            VectorsModel(R.drawable.sampletwo, "Color Splash Background Images"),

            )
        val myAdapter =VectorAdapter(data)
        val trendingAdapter =trendingAdapter(trendingData)
        recyclerView.adapter = myAdapter
        trendingRecyclerView.adapter=trendingAdapter
        unlockRecyclerView.adapter=trendingAdapter
    }
}