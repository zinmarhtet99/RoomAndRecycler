package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSum.setOnClickListener {
            var numOne = binding.edtnumone.text.toString().toInt()
            var numTwo = binding.edtnumtwo.text.toString().toInt()
            var result = (numOne + numTwo).toString()
            var calculate: Calculate = Calculate(numOne, numTwo, result)
            binding.number = calculate

        }
        binding.btnSub.setOnClickListener {
            var numOne = binding.edtnumone.text.toString().toInt()
            var numTwo = binding.edtnumtwo.text.toString().toInt()
            var result = (numOne - numTwo).toString()
            var calculate: Calculate = Calculate(numOne, numTwo, result)
            binding.number = calculate
        }
        binding.btnMul.setOnClickListener {
            var numOne = binding.edtnumone.text.toString().toInt()
            var numTwo = binding.edtnumtwo.text.toString().toInt()
            var result = (numOne * numTwo).toString()
            var calculate: Calculate = Calculate(numOne, numTwo, result)
            binding.number = calculate
        }
        binding.btnDiv.setOnClickListener {
            var numOne = binding.edtnumone.text.toString().toInt()
            var numTwo = binding.edtnumtwo.text.toString().toInt()
            var result = (numOne / numTwo).toString()
            var calculate: Calculate = Calculate(numOne, numTwo, result)
            binding.number = calculate
        }
    }
}