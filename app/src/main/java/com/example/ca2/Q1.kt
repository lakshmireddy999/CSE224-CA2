package com.example.ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import java.lang.StringBuilder

class Q1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1)

        val checkBox1=findViewById<CheckBox>(R.id.checkBox1)
        val result = StringBuilder()
        val btn=findViewById<Button>(R.id.submit)
        result.append("Selected Items")

        btn.setOnClickListener {
            if(checkBox1.isChecked)
            {
                result.append("\nPizza 100Rs")
            }
            Toast.makeText(applicationContext,result.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}