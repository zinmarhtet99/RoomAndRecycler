package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.adapter.FruitAdapter
import com.example.recyclerviewexample.model.Fruits

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.recycler_view)

        recyclerView.layoutManager=LinearLayoutManager(this)

       // recyclerView.layoutManager=GridLayoutManager(this,2)

        var fruitList=ArrayList<Fruits>()
        fruitList.add(Fruits("Apple",R.drawable.flower))
        fruitList.add(Fruits("Orange",R.drawable.flower))
        fruitList.add(Fruits("Grape",R.drawable.flower))
        fruitList.add(Fruits("Banana",R.drawable.flower))

        var fruitAdapter=FruitAdapter(fruitList)

        recyclerView.adapter=fruitAdapter

    }
}
