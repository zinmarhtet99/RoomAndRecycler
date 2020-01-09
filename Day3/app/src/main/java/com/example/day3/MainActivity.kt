package com.example.day3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNumone=findViewById<EditText>(R.id.edt_num1)
        val edtNumtwo=findViewById<EditText>(R.id.edt_num2)

        val btnsum=findViewById<Button>(R.id.btnsum)
        val btnsub=findViewById<Button>(R.id.btnsub)
        val btndiv=findViewById<Button>(R.id.btndiv)

        val txtresult:TextView=findViewById(R.id.txt_result)



        btnsum.setOnClickListener {
            var numone:Int=edtNumone.text.toString().toInt()
            var numtwo:Int=edtNumtwo.text.toString().toInt()
            var result=numone+numtwo
            txtresult.text=result.toString()
        }
        btnsub.setOnClickListener {
            var numone:Int=edtNumone.text.toString().toInt()
            var numtwo:Int=edtNumtwo.text.toString().toInt()
            var result=numone-numtwo
            txtresult.text=result.toString()
        }
        btndiv.setOnClickListener {
            var numone:Int=edtNumone.text.toString().toInt()
            var numtwo:Int=edtNumtwo.text.toString().toInt()
            var result=numone/numtwo
            txtresult.text=result.toString()
        }



    }
}
