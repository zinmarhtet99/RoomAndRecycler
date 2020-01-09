package com.example.retrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var btnAdd=findViewById<Button>(R.id.btn_add)

        btnAdd.setOnClickListener {
            var editId=findViewById<EditText>(R.id.edit_id)
            var editTextView=findViewById<EditText>(R.id.edit_text_view)
            var edit_id=editId.text
            var edit_text=editTextView.text.toString()
            var intent=Intent(this,NextActivity::class.java)
            intent.putExtra("Id",edit_id)
            intent.putExtra("Name",edit_text)
            startActivity(intent)
        }

    }
}
