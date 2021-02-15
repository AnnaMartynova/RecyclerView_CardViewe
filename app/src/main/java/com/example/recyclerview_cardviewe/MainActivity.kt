package com.example.recyclerview_cardviewe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_cardviewe.adapter.RecyclerAdapter
import com.example.recyclerview_cardviewe.recycler_data.RecyclerData

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var arrayList: ArrayList<RecyclerData>? = null
    private var recyclerAdapter: RecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)
        gridLayoutManager= GridLayoutManager(applicationContext,2,LinearLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        recyclerAdapter = RecyclerAdapter(applicationContext,arrayList!!)
        recyclerView?.adapter = recyclerAdapter

    }

    private fun setDataInList(): ArrayList<RecyclerData> {

        var items: ArrayList<RecyclerData> = ArrayList()

        items.add(RecyclerData(R.drawable.movie_list, "Avengers"))
        items.add(RecyclerData(R.drawable.movie_list, "Avengers"))
        items.add(RecyclerData(R.drawable.movie_list, "Avengers"))
        items.add(RecyclerData(R.drawable.movie_list, "Avengers"))
        items.add(RecyclerData(R.drawable.movie_list, "Avengers"))
        items.add(RecyclerData(R.drawable.movie_list, "Avengers"))
        items.add(RecyclerData(R.drawable.movie_list, "Avengers"))

        return items
    }
}