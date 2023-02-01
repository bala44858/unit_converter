package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class iTOf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itof)
        var inch = findViewById<EditText>(R.id.c3in)
        var feet = findViewById<TextView>(R.id.c3f)
        var clk3 = findViewById<TextView>(R.id.click3)
        clk3.setOnClickListener {
//            var a=( meter.toString()).toFloat()*100
            var b = inch.text
            feet.text = ((b.toString()).toFloat() * (0.083)).toString()
        }
    }
}