package com.example.retrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        var nextTextView=findViewById<TextView>(R.id.text_view_next)
        var intent=intent
        var id=intent.getIntExtra("Id",0)
        var name=intent.getStringExtra("Name")
        nextTextView.text= id.toString()
        nextTextView.text=name
    }
}
