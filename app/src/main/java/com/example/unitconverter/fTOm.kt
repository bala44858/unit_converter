package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class fTOm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ftom)
        var feet = findViewById<EditText>(R.id.c4f)
        var meter = findViewById<TextView>(R.id.c4m)
        var clk4 = findViewById<TextView>(R.id.click4)
        clk4.setOnClickListener {

            var b = feet.text
            meter.text = ((b.toString()).toFloat() * (0.304)).toString()
        }
    }
}