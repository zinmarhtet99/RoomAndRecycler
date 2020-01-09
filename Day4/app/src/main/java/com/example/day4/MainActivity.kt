package com.example.day4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.day4.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    var person:Person=Person("John","Developer")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.textViewName.text="textname"

        binding.myName=person

        binding.ButtonShow.setOnClickListener{
            person=Person("Jame","Android Developer")
            binding.myName=person
        }


    }
}
