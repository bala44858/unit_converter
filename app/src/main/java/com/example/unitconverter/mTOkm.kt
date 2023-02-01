package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.unitconverter.R.*
import java.lang.Float.parseFloat

class mTOkm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_mtokm)
        var meter=findViewById<EditText>(id.c1m)
        var km=findViewById<TextView>(id.c1km)
        var clk1=findViewById<TextView>(id.click1)
        clk1.setOnClickListener {
            var s=meter.text
            km.text= ( (s.toString()).toFloat()/1000).toString()


        }




    }
}