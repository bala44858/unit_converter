package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class mTOcm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mtocm)
        var meter = findViewById<EditText>(R.id.c2m)
        var cm=findViewById<TextView>(R.id.c2cm)
        var clk2=findViewById<TextView>(R.id.click2)
        clk2.setOnClickListener {
//            var a=( meter.toString()).toFloat()*100
            var s=meter.text
            cm.text= ( (s.toString()).toFloat()*100).toString()
//            cm.text=(meter.toString().toFloat()*100).toString()
        }
    }
}