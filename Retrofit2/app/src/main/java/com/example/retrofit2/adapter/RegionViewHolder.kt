package com.example.retrofit2.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit2.R

class RegionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val regionId=itemView.findViewById<TextView>(R.id.text_view_id)
    val regionName=itemView.findViewById<TextView>(R.id.text_view_name)
}