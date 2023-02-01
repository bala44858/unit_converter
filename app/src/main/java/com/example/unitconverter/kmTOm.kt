package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class kmTOm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_km_tom)
        var km=findViewById<EditText>(R.id.c3km)
        var m=findViewById<TextView>(R.id.c3m)
        var clk3=findViewById<TextView>(R.id.click3)
        clk3.setOnClickListener {
            m.text=((km.text.toString()).toFloat()*1000).toString()
        }
    }
}