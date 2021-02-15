package com.example.recyclerview_cardviewe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_cardviewe.R
import com.example.recyclerview_cardviewe.recycler_data.RecyclerData
import kotlinx.android.synthetic.main.activity_card_viewe.view.*

class RecyclerAdapter(var context: Context, var arrayList: ArrayList<RecyclerData>) :
    RecyclerView.Adapter<RecyclerAdapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.activity_card_viewe, parent, false)
        return ItemHolder(itemView)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var recyclerData = arrayList.get(position)

        holder.mowies.setImageResource(recyclerData.movie!!)
        holder.avenger.text = recyclerData.avengers
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var mowies = itemView.findViewById<ImageView>(R.id.movie_list)
        var avenger = itemView.findViewById<TextView>(R.id.avengers_list)
    }


}