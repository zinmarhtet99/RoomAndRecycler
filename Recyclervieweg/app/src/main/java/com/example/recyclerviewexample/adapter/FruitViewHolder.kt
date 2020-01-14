package com.example.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.model.Fruits
import kotlinx.android.synthetic.main.layout_fruit.view.*

class FruitViewHolder(Itemveiw: View): RecyclerView.ViewHolder(Itemveiw){
    val fruitName=itemView.findViewById<TextView>(R.id.txt_fruit)
    val imgName=itemView.findViewById<ImageView>(R.id.img)


}
class FruitAdapter(val fruitlslist:ArrayList<Fruits>):RecyclerView.Adapter<FruitViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.layout_fruit,parent,false)
        return FruitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fruitlslist.size
    }
    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.fruitName.text=fruitlslist[position].name
        holder.imgName.setImageResource(fruitlslist[position].image)
    }


}