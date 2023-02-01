package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var c1= findViewById<TextView>(R.id.c1)
        var c2= findViewById<TextView>(R.id.c2)
        var c3= findViewById<TextView>(R.id.c3)
        var c4= findViewById<TextView>(R.id.c4)
        var c5= findViewById<TextView>(R.id.c5)


        c1.setOnClickListener {
            startActivity(Intent(this, mTOkm::class.java))
        }
        c2.setOnClickListener {
            startActivity(Intent(this, mTOcm::class.java))
        }
        c3.setOnClickListener {
            startActivity(Intent(this, kmTOm::class.java))
        }
        c4.setOnClickListener {
            startActivity(Intent(this, fTOm::class.java))
        }
        c5.setOnClickListener {
            startActivity(Intent(this, iTOf::class.java))
        }

    }
}