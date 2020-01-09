package com.example.retrofit2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit2.R
import com.example.retrofit2.model.Region

class RegionAdapter (val regionList:ArrayList<Region>): RecyclerView.Adapter<RegionViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegionViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.region,parent,false)
        return RegionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return regionList.size
    }

    override fun onBindViewHolder(holder: RegionViewHolder, position: Int) {
        holder.regionId.text=regionList[position].id
        holder.regionName.text=regionList[position].region_name
    }

}